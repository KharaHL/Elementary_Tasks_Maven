package Fibanacci;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibanacciTest {
    Fibanacci fibanacci=new Fibanacci();
    @Test
    public void testCraeteFibanacci() {
        int minimalValue = 0;
        int maximumValuea = 5;
       List<Long> expectValue = new ArrayList<Long>(Arrays.asList(0l,1l,1l,2l,3l,5l));
        List<Long> realArray=fibanacci.createFibanacci(minimalValue,maximumValuea);
        Assert.assertEquals(expectValue,realArray);
    }

}
