package application;

import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessmatch = new ChessMatch();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				Ui.clearScreen();
				Ui.printBoard(chessmatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = Ui.readChessPosition(sc);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = Ui.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
			}catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		
		
		
	}

}
