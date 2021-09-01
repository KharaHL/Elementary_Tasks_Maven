package Fibanacci;

import java.util.List;

class ServiceFibanacci {
    public List<Long> chooseMethod(int method){
        int methodRange = 1;
        int methodLength = 2;
        long minimal = 0;
        long maximum = 0;
        InputValidate inputValidate = new InputValidate();
        if (method == methodRange) {
            minimal = inputValidate.inputMinimalValue();
            maximum = inputValidate.inputMaxlValue();
        } else if (method == methodLength) {
            int length = inputValidate.inputLength();
            minimal = (long) Math.pow(10, length - 1);
            maximum = (long) Math.pow(10, length);
        }
        Fibanacci fibanacci = new Fibanacci();
        List<Long> returnFibanacci=fibanacci.createFibanacci(minimal,maximum);
        return returnFibanacci;

    }



}
