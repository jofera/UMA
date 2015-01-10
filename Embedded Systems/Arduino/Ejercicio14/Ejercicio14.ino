// Gonzalo Fernadez Jaime
// Antonio Granero Diaz

#include <math.h>

/*----------------------------------*/
#define THERMISTOR_NTCLE100E3103JB0
//#define THERMISTOR_159_282_86001
#if defined THERMISTOR_NTCLE100E3103JB0
#define THERMISTOR_T0 25.0
#define THERMISTOR_R0 10000.0
#define THERMISTOR_B 3977.0
#elif defined THERMISTOR_159_282_86001
#define THERMISTOR_T0 25.0
#define THERMISTOR_R0 2800.0
#define THERMISTOR_B 3950.0
#else
#error "Thermistor no definido"
#endif
/*----------------------------------*/
#define PINCALF 2
#define PINSENSOR 0
#define PINLEDR 3
#define PINLEDV 5

#define TMPMIN 36.0
#define TMPMAX 40.0
#define TMPDES 38.0
#define PERLECT 1000
#define PERCALF 5000

unsigned long next_ms_calf;
unsigned long next_ms_lect;
unsigned long next_ms_off;
int est_calf = LOW;
int est_ledR = LOW;
int est_ledV = LOW;
float temp;
int regulando = 0;

inline float val2tmp(int val, float T0, float R0, float B) {
  float t, r;
  r = ((1023.0 * 10e3) / float(val)) - 10e3;
  T0 += 273.15; /* celsius -> kelvin */
  t = 1.0 / ((1.0 / T0) + (log(r / R0) / B));
  return t - 273.15; /* kelvin -> celsius */
}

unsigned long esperar_temporizacion(unsigned long next_ms){
  unsigned long t = millis();
  if (t < next_ms) {
    delay(next_ms - t);
    t = millis();
  }
  return t;
}

float temperatura(){
  float temp = val2tmp(analogRead(PINSENSOR),THERMISTOR_T0,THERMISTOR_R0,THERMISTOR_B);
  if(Serial){
    Serial.print(temp);
    Serial.print(" ");
    Serial.println(est_calf);
  }
  return temp;
}

void enciendeCalefactor(){
  est_calf = HIGH;
  est_ledR = HIGH;
  digitalWrite(PINCALF, est_calf); 
  digitalWrite(PINLEDR, est_ledR);
}

void apagaCalefactor(){
  est_calf = LOW;
  est_ledR = LOW;
  digitalWrite(PINCALF, est_calf); 
  digitalWrite(PINLEDR, est_ledR);
}

void control_calf(float temp){
  if(est_calf == HIGH){
    apagaCalefactor();
  }
  float error = (TMPDES - temp);
  if(error < 0){
    // TODO EL PERIODO APAGADO.
    // SI EL CALEFACTOR ESTABA 
    // ENCENDIDO, LO APAGO
    if(est_calf == HIGH){
      apagaCalefactor();
    }
  }else if(error > 0 && error < 5){
    // ENCIENDO EL ERROR * 20% * PERIODO
    next_ms_off = millis() + (error * 0.2 * PERCALF);
    regulando = 1;
    enciendeCalefactor();
  }else{
    // ENCIENDO TODO EL PERIODO
    enciendeCalefactor();
  }
  next_ms_calf += PERCALF;
}

void control_rango_temp(float temp){
  if(temp >= TMPMIN && temp <= TMPMAX && est_ledV == LOW){
    est_ledV = HIGH; 
    digitalWrite(PINLEDV, est_ledV); 
  }else if(temp < TMPMIN || temp > TMPMAX){ 
    if(est_ledV == HIGH){
      est_ledV = LOW;
      digitalWrite(PINLEDV, est_ledV);
    }
  }
  next_ms_lect += PERLECT; 
}

void setup(){
  pinMode(PINCALF, OUTPUT);
  pinMode(PINLEDR, OUTPUT);
  pinMode(PINLEDV, OUTPUT);
  next_ms_off = next_ms_calf = next_ms_lect = millis();
  temp = temperatura();
  Serial.begin(9600);
  if(Serial){
    Serial.println("Arduino Control de Temperatura Simple (5000ms)");
    Serial.println("-y20:45 -l36 -l38 -l40 -tTemperatura -tCalefactor -s1 -s30"); 
  }
}

void loop(){
  unsigned long curr_ms = esperar_temporizacion(min(next_ms_lect,min(next_ms_calf, next_ms_off)));
  
  // Periodo del calefactor
  if(curr_ms >= next_ms_calf){
    control_calf(temp);
  }
  
  // Periodo de lectura de temperaturas
  if(curr_ms >= next_ms_lect){
    temp = temperatura();
    control_rango_temp(temp);
  }
  
  // Regulando por el ciclo de trabajo
  if(regulando && curr_ms >= next_ms_off){
    apagaCalefactor();
    regulando = 0;
  }
  
}
