package HappyTickets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String exit = "";
        do{
            Output output = new Output();
        output.print();
            System.out.println("Add another one?");
            Scanner scanner = new Scanner(System.in);
            exit=scanner.nextLine();
        } while (exit.equalsIgnoreCase("Y") || exit.equalsIgnoreCase("Yes"));
    }
}
