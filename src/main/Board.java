package main;

public class Board {

	public static int[][] board = {
            {0, 3, 0, 8, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 3, 0},
            {9, 0, 0, 0, 0, 4, 0, 0, 0},
            {0, 0, 0, 0, 3, 0, 0, 0, 8},
            {4, 0, 0, 2, 0, 8, 0, 0, 5},
            {3, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 6, 0, 0, 0, 0, 7},
            {0, 2, 0, 0, 0, 0, 4, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 6, 0}
        };
	
	public static void printBoard() {
        System.out.print("    ");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0 && i != 9) System.out.print("  ");
        }
        System.out.println("\n   ----------------------");

        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("    ------+-------+------");
            }
            
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] == 0 ? ". " : board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
