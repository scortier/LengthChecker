package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.math.BigDecimal;

public class LengthCheckerTest{
    @Test
    public void testTwoPointDiffCalculator(){
        LengthChecker testCheckLengthObj = new LengthChecker();

        BigDecimal coordinate1 = new BigDecimal("50");
        BigDecimal coordinate2 = new BigDecimal("1000000050");
        BigDecimal returnedAns = testCheckLengthObj.twoPointDiffCalculator(coordinate1,coordinate2);
        BigDecimal expectedAns = new BigDecimal("1000000000");
        assertEquals(expectedAns,returnedAns);


    }
}