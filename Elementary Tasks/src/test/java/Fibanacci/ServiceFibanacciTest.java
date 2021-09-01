package Fibanacci;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class ServiceFibanacciTest {

    @Test
    public void testDoFibanacciLength() {
        ServiceFibanacci serviceFibanacci = new ServiceFibanacci();
        int lengthMethod = 2;
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);
        List<Long> realData = serviceFibanacci.chooseMethod(lengthMethod);
        List<Long> expectData = new ArrayList<Long>(Arrays.asList(144l, 233l, 377l, 610l, 987l));
        assertEquals(expectData, realData);
    }
}