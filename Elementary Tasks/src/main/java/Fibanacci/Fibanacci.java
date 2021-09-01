package Fibanacci;

import java.util.ArrayList;
import java.util.List;

class Fibanacci {

    private List<Long> fibanacci = new ArrayList<Long>();
     public List createFibanacci(long minimal_value, long maximum_value) {
        long firstElement = 1;
        long secondElement = 0;
        while (secondElement <= maximum_value) {
            if (secondElement >= minimal_value) {
                fibanacci.add(secondElement);
            }
            secondElement = secondElement + firstElement;
            firstElement = secondElement - firstElement;
        }
        return fibanacci;
    }
}
