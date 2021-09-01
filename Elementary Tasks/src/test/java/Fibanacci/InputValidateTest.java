package Fibanacci;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

public class InputValidateTest {
 InputValidate inputValidate = new InputValidate();
    @Test
    public void testInputMinimalValue() {
        String inputValue="800";
        long expectValue=800;
        ByteArrayInputStream in = new ByteArrayInputStream(inputValue.getBytes());
        System.setIn(in);
        Assert.assertEquals(expectValue,inputValidate.inputMinimalValue());
        System.setIn(System.in);
    }

    @Test
    public void testInputMaxlValue() {
        String inputValue="10000000";
        long ecpectValue=10000000;
        ByteArrayInputStream in = new ByteArrayInputStream(inputValue.getBytes());
        System.setIn(in);
        Assert.assertEquals(ecpectValue, inputValidate.inputMaxlValue());
        System.setIn(System.in);
    }

    @Test
    public void testInputLength() {
        String inputValue="5";
        int expectValue=5;
        ByteArrayInputStream in = new ByteArrayInputStream(inputValue.getBytes());
        System.setIn(in);
        Assert.assertEquals(expectValue, inputValidate.inputLength());
        System.setIn(System.in);
    }

    @Test
    public void testInputMethod() {
        String inputValue="2";
        int ecpectValue=2;
        ByteArrayInputStream in = new ByteArrayInputStream(inputValue.getBytes());
        System.setIn(in);
        Assert.assertEquals(ecpectValue, inputValidate.inputMethod());
        System.setIn(System.in);
    }
}