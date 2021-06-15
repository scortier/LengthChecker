package com.example;
import java.math.BigDecimal;


public class LengthChecker{
    public BigDecimal twoPointDiffCalculator(BigDecimal coordinate1,BigDecimal coordinate2){
        BigDecimal diffBetweenPoints = coordinate1.subtract(coordinate2).abs();
        return diffBetweenPoints;
    }
}
