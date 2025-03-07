package main;

public interface IResolucao {

	static boolean containsNumberInRow(int[][] board, int linha, int number) {
		for (int i = 0; i < board.length; i++) {
			if (board[linha][i] == number) {
				return true;
			}
		}
		return false;
	}
	
	static boolean containsNumberInColumn(int[][] board, int coluna, int number) {
		for (int i = 0; i < board.length; i++) {
			if (board[coluna][i] == number) {
				return true;
			}
		}
		return false;
	}
	
	static boolean containsNumberInSquad(int[][] board, int row, int column, int num) {
		int localBoxRow = row - row % 3;
		int localBoxColumn = column - column % 3;
		
		for (int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				if (num == board[localBoxRow][localBoxColumn]) {
					return true;
				}
				
				localBoxColumn++;
			}
			localBoxColumn = column - column % 3;
			localBoxRow++;
		}
		
		return false;
	}
	
	static void status (int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; i < board[i].length; j++) {
				if (board[i][j] == 0) {
					System.out.println("Incompleto");
					return;
				}
			}
		}
		System.out.println("Completo");
	}
	
	

}
