package practicaCSP;


import java.util.ArrayList;
import java.util.List;

import aima.core.search.csp.*;

/**
 * PRÁCTICA: Completar el código para representar una restricción cuaternaria para el problema
 *  de las N-reinas.
 * Las variables son fila y columna de 2 reinas. No pueden estar en la misma diagonal.
 * El nombre de la clase debe ser distinto para cada alumno, utilizando para ello sus apellidos:
 *                           Apellido1Apellido2NotSameDiagonalConstraint
 * @author Lawrence Mandow 
 */

public class FernandezJaimeNotSameDiagonalConstraint implements Constraint {

	private Variable row1, col1, row2, col2;
	private List<Variable> scope;

	public FernandezJaimeNotSameDiagonalConstraint(Variable row1, Variable col1, Variable row2, Variable col2) {
		this.row1 = row1;
		this.col1 = col1;
		this.row2 = row2;
		this.col2 = col2;
		scope = new ArrayList<Variable>(2);
		scope.add(row1);
		scope.add(col1);
		scope.add(row2);
		scope.add(col2);
	}

	@Override
	public List<Variable> getScope() {
		return scope;
	}

	@Override
	public boolean isSatisfiedWith(Assignment assignment) {
		/**
		 * Este método devuelve true si la asignación satisface la restricción, y false en otro caso.
		 * 
		 * PISTA: Utilizando el método getAssignment(<variable>) de la clase Assignment
		 * comprobar si todas las variables están instanciadas (son distintas de null).
		 * Si alguna está sin instanciar,
		 *   entonces devolver true
		 *   en otro caso, los valores de las variables serán números enteros, comprobar 
		 *                 si las dos reinas están o no en la misma diagonal y devolver el 
		 *                 valor correspondiente.
		 */
		
		Object fila1 = assignment.getAssignment(row1);
		Object columna1 = assignment.getAssignment(col1);
		Object fila2 = assignment.getAssignment(row2);
		Object columna2 = assignment.getAssignment(col2);
		if (fila1==null || fila2==null || columna1==null || columna2==null){
			return true;
		}else{
			return Math.abs((Integer)fila1 - (Integer)fila2) != Math.abs((Integer)columna1 - (Integer)columna2);
		}
	}
}
