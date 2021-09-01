package Fibanacci;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputValidate {
    private long minimalValue;
    private long maxValue;
    private int length;
    private int method;

    public long inputMinimalValue() {
        boolean ok = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input minimal value(0-9223372036854775807):");
                minimalValue = scanner.nextLong();
                if (minimalValue < 0) {
                    throw new IllegalArgumentException("the minimum value must be positive");
                }
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (ok != true);
        return minimalValue;
    }

    public long inputMaxlValue() {
        boolean ok = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input max value(0-9223372036854775807):");
                maxValue = scanner.nextLong();
                if (maxValue < 0) {
                    throw new IllegalArgumentException("the maximum value must be positive");
                }
                if (maxValue < minimalValue) {
                    throw new IllegalArgumentException("the maximum value must be bigger than minimum ");
                }
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (ok != true);
        return maxValue;
    }

    public int inputLength() {
        boolean ok = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input length(1-15):");
                length = scanner.nextInt();
                if (length <= 0 || length > 18) {
                    throw new IllegalArgumentException("the length must be from 1 to 15");
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

    public int inputMethod() {
        boolean ok = false;
        do {
            try {
                System.out.println("Input method:[1/2]");
                System.out.println("1-range");
                System.out.println("2-length");
                Scanner scanner = new Scanner(System.in);
                method = scanner.nextInt();
                if ((method != 1) & (method != 2)) {
                    throw new IllegalArgumentException();
                }
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (ok != true);
        return method;
    }
}
