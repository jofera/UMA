package practicaCSP;



import aima.core.search.csp.Assignment;
import aima.core.search.csp.BacktrackingStrategy;
import aima.core.search.csp.CSP;
import aima.core.search.csp.CSPStateListener;
import aima.core.search.csp.MinConflictsStrategy;
import aima.core.search.csp.SolutionStrategy;

/**
 * PRACTICA: Resolver el problema de las 4 reinas mediante satisfacción de restricciones.
 * Hay que tener en cuenta que no todas las restricciones son binarias, por ello aplicaremos
 * solo dos resolutores
 * 
 * SolutionStrategy solver1 = new MinConflictsStrategy(1000);
 * SolutionStrategy solver2 = new BacktrackingStrategy();
 * 
 * El programa debe mostrar por la consola:
 *   - el resultado devuelto por el resolutor
 *   - estadísticas de la ejecución 
 *   
 *   El nombre de la clase debe ser distinto para cada alumno, utilizando para ello sus apellidos:
*                           Apellido1Apellido2ReinasCSP
 *   
 * @author Lawrence Mandow
 */

public class FernandezJaimeReinasCSPDemo {
	public static void main(String[] args) {
		CSP csp = new FernandezJaimeReinasCSP();     // OJO: Cada alumno debe definir su clase problema
		
		/*
		 * Completar el método
		 */
		StepCounter stepCounter = new StepCounter();
		SolutionStrategy solver;
		
		//Usando estrategia MinConflicts:
		solver = new MinConflictsStrategy(1000);
		solver.addCSPStateListener(stepCounter);
		stepCounter.reset();
		System.out.println("Map Coloring (Minimum Conflicts)");
		System.out.println(solver.solve(csp.copyDomains()));
		System.out.println(stepCounter.getResults() + "\n");
		//Usando Backtracking:
		solver = new BacktrackingStrategy();
		solver.addCSPStateListener(stepCounter);
		stepCounter.reset();
		System.out.println("Map Coloring (Backtracking)");
		System.out.println(solver.solve(csp.copyDomains()));
		System.out.println(stepCounter.getResults() + "\n");
	}
	
	/** Counts assignment and domain changes during CSP solving. */
	protected static class StepCounter implements CSPStateListener {
		
		/*
		 * Copiar este método de aima.gui.demo.search.MapColoringCSPDemo.java
		 */
		private int assignmentCount = 0;
		private int domainCount = 0;
		
		@Override
		public void stateChanged(Assignment assignment, CSP csp) {
			++assignmentCount;
		}
		
		@Override
		public void stateChanged(CSP csp) {
			++domainCount;
		}
		
		public void reset() {
			assignmentCount = 0;
			domainCount = 0;
		}
		
		public String getResults() {
			StringBuffer result = new StringBuffer();
			result.append("assignment changes: " + assignmentCount);
			if (domainCount != 0)
				result.append(", domain changes: " + domainCount);
			return result.toString();
		}
	}
}
