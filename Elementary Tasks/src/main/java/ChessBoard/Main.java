package ChessBoard;

import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        String exit = "";
        Input input = new Input();
        do {
        int height = input.inputHeight();
        int weight = input.inputWeight();
        ChessBoard chessBoard = new ChessBoard(height, weight);
        chessBoard.printBoard();
    System.out.println("Add another one?");
    Scanner scanner = new Scanner(System.in);
    exit=scanner.nextLine();
    }while (exit.equalsIgnoreCase("Y") || exit.equalsIgnoreCase("Yes"));
}}
