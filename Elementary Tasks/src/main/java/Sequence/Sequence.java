package Sequence;

import java.util.ArrayList;

class Sequence {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private int length;
    private double square;

    public Sequence(int length, double square) {
        this.length = length;
        this.square = square;
    }

    public ArrayList addSequence() {
        double minimalNumber = Math.sqrt(square);
        if (minimalNumber % 1 == 0) {
            for (int i = (int) minimalNumber; i < (length + minimalNumber); i++) {
                arrayList.add(i);
            }
        } else if (minimalNumber % 1 != 0) {
            for (int i = (int) minimalNumber + 1; i < (length + minimalNumber); i++) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public void outputSequence(ArrayList<Integer> outputArray) {
        for (int i : outputArray) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
