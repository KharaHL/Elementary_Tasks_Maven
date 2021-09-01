package ChessBoard;

import java.util.InputMismatchException;
import java.util.Scanner;

 class Input {
    public int inputWeight() {
        boolean ok = false;
        int boardWeight = 0;
        do {
            try {
                System.out.println("Input Weight:");
                Scanner scanner = new Scanner(System.in);
                boardWeight = scanner.nextInt();
                if (boardWeight < 0) {
                    throw new IllegalArgumentException("the weight value must be positive");
                }
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (ok != true);
        return boardWeight;
    }

    public int inputHeight() {
        boolean ok = false;
        int boardHeight = 0;
        do {
            try {
                System.out.println("Input Weight:");
                Scanner scanner = new Scanner(System.in);
                boardHeight = scanner.nextInt();
                if (boardHeight < 0) {
                    throw new IllegalArgumentException("the Height value must be positive");
                }
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (ok != true);
        return boardHeight;
    }
}
