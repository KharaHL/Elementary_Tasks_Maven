package HappyTickets;

import java.util.Scanner;

 class Input {
    public int inputMinimalTicket() {
        boolean ok = false;
        int numberInt = 0;
        int numberData = 0;
        do {
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Input minimal ticket (from 000001 to 999999):");
                String number = scanner.nextLine();

                if (number.length() < 6 || number.length() > 6) {
                    throw new IllegalArgumentException("Illegal format");
                }
                numberInt = Integer.parseInt(number);
                if (numberInt <= 0) {
                    throw new IllegalArgumentException("Number must be positive");
                }
                numberData = numberInt + 1000000;
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (ok != true);
        return numberData;
    }

    public int inputMaximumlTicket() {
        boolean ok = false;
        int numberInt = 0;
        int numberData = 0;
        do {
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Input maximum ticket (from 000001 to 999999):");
                String number = scanner.nextLine();

                if (number.length() < 6 || number.length() > 6) {
                    throw new IllegalArgumentException("Illegal format");
                }
                numberInt = Integer.parseInt(number);
                if (numberInt <= 0) {
                    throw new IllegalArgumentException("Number must be positive");
                }
                numberData = numberInt + 1000000;
                ok = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (ok != true);
        return numberData;
    }
}