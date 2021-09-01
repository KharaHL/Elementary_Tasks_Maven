package Sequence;

import java.util.InputMismatchException;
import java.util.Scanner;

 class Input {
    private int length;
    private double square;
    public double inputSquare() {
        boolean ok = false;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input square");
                square = scanner.nextDouble();
                if (square < 0) {
                    throw new IllegalArgumentException("the square value must be positive");
                }
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (ok != true);
        return square;
    }
    public int inputLength() {
        boolean ok = false;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input length");
                length = scanner.nextInt();
                if (length < 0) {
                    throw new IllegalArgumentException("the length value must be positive");
                }
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (ok != true);
        return length;
    }

}
