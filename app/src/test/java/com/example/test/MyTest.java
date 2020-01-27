package com.example.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MyTest {

    Arithmetic arithmetic = null;

    @Before
    public void setUp(){
        arithmetic = new Arithmetic();
    }

    @Test
    public void testAddition(){
        float expectedResult = 10;
        float actualResult = arithmetic.add(4,6);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtraction(){
        float expectedResult = 4;
        float actualResult = arithmetic.subtract(6,2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivision(){
        float expectedResult = 4;
        float actualResult = arithmetic.divide(8,2);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown(){
        arithmetic = null;
    }
}
