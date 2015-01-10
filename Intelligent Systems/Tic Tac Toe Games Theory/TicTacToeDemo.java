package sesionJuegos;


/**
 * @author L. Mandow
 * 
 */
public class TicTacToeDemo {
	public static void main(String[] args) {
		System.out.println("Mi Demo");
		System.out.println("");

		
		miDemo();

	}

	private static void miDemo() {
		System.out.println("MI DEMO: ");
		System.out.println("");
		TicTacToe t3 = new TicTacToe();
		
		t3.makeMove(1, 1);   //X
		t3.getBoard(t3.getState()).print();
		System.out.println("Hojas MiniMax: " + t3.getMiniMaxLeafs());
		// mostrar getAlphaBetaLeafs()
		System.out.println("Hojas AlphaBeta: " + t3.getAlphaBetaLeafs());
		
		
		System.out.println("");
		t3.makeMove(1, 0);   //O
		t3.getBoard(t3.getState()).print();
		System.out.println("Hojas MiniMax: " + t3.getMiniMaxLeafs());
		// mostrar getAlphaBetaLeafs()
		System.out.println("Hojas AlphaBeta: " + t3.getAlphaBetaLeafs());

		
		System.out.println("");
		t3.makeMove(0,2);   //X
		t3.getBoard(t3.getState()).print();
		System.out.println("Hojas MiniMax: " + t3.getMiniMaxLeafs());
		// mostrar getAlphaBetaLeafs()
		System.out.println("Hojas AlphaBeta: " + t3.getAlphaBetaLeafs());

		
		System.out.println("");
		t3.makeMove(2, 0);   //O
		t3.getBoard(t3.getState()).print();
		System.out.println("Hojas MiniMax: " + t3.getMiniMaxLeafs());
		// mostrar getAlphaBetaLeafs()
		System.out.println("Hojas AlphaBeta: " + t3.getAlphaBetaLeafs());

		
		System.out.println("");
		t3.makeMove(0,0);   //X
		t3.getBoard(t3.getState()).print();
		System.out.println("Hojas MiniMax: " + t3.getMiniMaxLeafs());
		// mostrar getAlphaBetaLeafs()
		System.out.println("Hojas AlphaBeta: " + t3.getAlphaBetaLeafs());

		
		System.out.println("");
		t3.makeMove(0, 1);   //O
		t3.getBoard(t3.getState()).print();
		System.out.println("Hojas MiniMax: " + t3.getMiniMaxLeafs());
		// mostrar getAlphaBetaLeafs()
		System.out.println("Hojas AlphaBeta: " + t3.getAlphaBetaLeafs());

		
		System.out.println("");
		t3.makeMove(2, 2);   //X
		t3.getBoard(t3.getState()).print();
		System.out.println("Hojas MiniMax: " + t3.getMiniMaxLeafs());
		// mostrar getAlphaBetaLeafs()
		System.out.println("Hojas AlphaBeta: " + t3.getAlphaBetaLeafs());

		
		System.out.println("Mi DEMO done");
	}
	
	
}
