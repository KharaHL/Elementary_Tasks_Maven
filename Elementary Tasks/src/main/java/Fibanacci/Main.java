package Fibanacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String exit = "";
        InputValidate inputValidate = new InputValidate();
        Output output = new Output();
        do {
            int method = inputValidate.inputMethod();
            ServiceFibanacci serviceFibanacci = new ServiceFibanacci();
            output.print(serviceFibanacci.chooseMethod(method));
            System.out.println("Add another one?");
            Scanner scanner = new Scanner(System.in);
            exit = scanner.nextLine();
        } while (exit.equalsIgnoreCase("Y") || exit.equalsIgnoreCase("Yes"));
    }
}

