package com.example.test;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MyTest {

    @Test
    public void testAddition(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 10;
        float actualResult = arithmetic.add(4,6);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtraction(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 4;
        float actualResult = arithmetic.subtract(6,2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivision(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 4;
        float actualResult = arithmetic.divide(8,2);
        assertEquals(expectedResult, actualResult);
    }
}
