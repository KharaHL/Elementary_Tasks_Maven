package Triangle;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String []args ) {
        Map<String, Double> area = new HashMap<>();
        String exit = "";
        do {
            try {
                System.out.println("Print name,sideA,sideB,sideC:");
                Scanner scanner = new Scanner(System.in);
                String inputData = scanner.nextLine();
                String[] data = inputData.split(",");
                String name = data[0];
                double sideA = Double.parseDouble(data[1]);
                double sideB = Double.parseDouble(data[2]);
                double sideC = Double.parseDouble(data[3]);
                if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
                    throw new NumberFormatException("больше 0");
                }
                if (!Triangle.validateTriangle(sideA, sideB, sideC)) {
                    throw new IllegalArgumentException("Triangle dont exist");
                }
                Triangle tr = new Triangle(name, sideA, sideB, sideC);
                double treandleArea = tr.triangleArea();
                area.put(data[0], treandleArea);
                // System.out.println(treandleArea);

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Add another one?");
            exit = scanner2.nextLine();
        } while (exit.equalsIgnoreCase("Y") || exit.equalsIgnoreCase("Yes"));
        area.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
