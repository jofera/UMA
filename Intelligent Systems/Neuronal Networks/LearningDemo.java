package sesionNN;

import aima.core.learning.framework.DataSet;
//import aima.core.learning.framework.DataSetFactory;  //modificado para la práctica en sesionNN
import aima.core.learning.neural.BackPropLearning;
import aima.core.learning.neural.FeedForwardNeuralNetwork;
import aima.core.learning.neural.IrisDataSetNumerizer;
import aima.core.learning.neural.IrisNNDataSet;
import aima.core.learning.neural.NNConfig;
import aima.core.learning.neural.NNDataSet;
import aima.core.learning.neural.Numerizer;
import aima.core.learning.neural.Perceptron;


public class LearningDemo {
	public static void main(String[] args) {
		try {
		
			DataSet irisDataSet = DataSetFactory.getIrisDataSet();
			Numerizer numerizer = new IrisDataSetNumerizer();
			NNDataSet datos = new IrisNNDataSet();

			datos.createExamplesFromDataSet(irisDataSet, numerizer);

			System.out.println("Probando Perceptron:");
			perceptronDemo(4, 3, datos, 10);
		
			System.out.println("Probando Feedforward:");
			backPropagationDemo(4, 1, 3, datos, 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * Crea un Perceptron con las neuronas y entradas indicadas. Lo entrena el número de epocas
	 * con el conjunto de datos innds. Después devuelve el número de ejemplos clasificado
	 * correcta y erroneamente tras el entrenamiento.
	 */

	public static void perceptronDemo(int entradas, int neuronas, NNDataSet datos, int epocas) {
		try {

			Perceptron perc = new Perceptron(neuronas, entradas);
			
			for (int i = 0; i < epocas; i++){

			//Entrena: 
			perc.trainOn(datos, 1);

			//Prueba:
			datos.refreshDataset();
			int[] result = perc.testOnDataSet(datos);
			System.out.println(result[0] + " correctos, " + result[1] + " erroneos");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	public static void backPropagationDemo(int entradas, int ocultas, int salidas, NNDataSet datos, int epocas) {
		try {
		
			NNConfig config = new NNConfig();
			config.setConfig(FeedForwardNeuralNetwork.NUMBER_OF_INPUTS, entradas);
			config.setConfig(FeedForwardNeuralNetwork.NUMBER_OF_OUTPUTS, salidas);
			config.setConfig(FeedForwardNeuralNetwork.NUMBER_OF_HIDDEN_NEURONS,	ocultas);
			config.setConfig(FeedForwardNeuralNetwork.LOWER_LIMIT_WEIGHTS, -2.0);
			config.setConfig(FeedForwardNeuralNetwork.UPPER_LIMIT_WEIGHTS, 2.0);

			FeedForwardNeuralNetwork ffnn = new FeedForwardNeuralNetwork(config);
			ffnn.setTrainingScheme(new BackPropLearning(0.1, 0.9));
			
			for (int i = 0 ; i<epocas; i++){

			//Entrena:
			ffnn.trainOn(datos, 1);	

			//Prueba:
			datos.refreshDataset();
			int[] result = ffnn.testOnDataSet(datos);
			System.out.println(result[0] + " correctos, " + result[1] + " erroneos");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
