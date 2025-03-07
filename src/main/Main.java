package main;

import java.util.Scanner;

public class Main {
	private static Scanner scn = new Scanner(System.in);
	private static int row;
	private static int column;
	private static int number;


	public static void main(String[] args) {
		
		System.out.println("Bem-vindo ao Sudoku");
		System.out.println("");
		Board.printBoard();
		
		printMenu();
		
		
	}
	
	private static void inserirNumero() {
		System.out.println("Digite a posição da linha");
		row = scn.nextInt() - 1;
		System.out.println("Digite a posição da coluna");
		column = scn.nextInt() - 1;
		System.out.println("Digite o numero que deseja alocar");
		number = scn.nextInt();

		if (jogadaValida(row, column, number)) {
			Board.board[row][column] = number;
		} else {
			System.out.println("Jogada inválida! Tente novamente");
		}
		
		Board.printBoard();
		printMenu();
	}

	private static void verificarStatus() {
		IResolucao.status(Board.board);
		printMenu();
	}

	
	private static boolean jogadaValida(int linha, int coluna, int number) {
		return !IResolucao.containsNumberInRow(Board.board, linha, number) &&
				!IResolucao.containsNumberInColumn(Board.board, coluna, number) &&
				!IResolucao.containsNumberInSquad(Board.board, linha, coluna, number);
	}

	static void printMenu() {
		System.out.println("");
		System.out.println("=== Ações ===");
		System.out.println("1- Inserir numero");
		System.out.println("2- Verificar status");
		System.out.println("3- Encerrar jogo");
		int escolha = scn.nextInt();
		switch(escolha) {
			case(1) -> inserirNumero();
			case(2) -> verificarStatus();
			case(3) -> {
				System.out.println("Encerrando o jogo. Até mais!");
				System.exit(0); 
			}
			default -> {
				System.out.println("Opção inválida! Tente novamente.");
				Board.printBoard();
				printMenu();
			}
		}
	}
}
