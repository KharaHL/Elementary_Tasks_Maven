package Sequence;

import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        String exit = "";
        do {
            Input input = new Input();
            double square = input.inputSquare();
            int lenth = input.inputLength();
            Sequence sequence = new Sequence(lenth, square);
            sequence.outputSequence(sequence.addSequence());
            System.out.println("Add another one?");
            Scanner scanner = new Scanner(System.in);
            exit = scanner.nextLine();
        } while (exit.equalsIgnoreCase("Y") || exit.equalsIgnoreCase("Yes"));
    }
}
