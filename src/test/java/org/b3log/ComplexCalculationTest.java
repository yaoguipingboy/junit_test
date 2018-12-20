package org.b3log;

import org.b3log.ComplexCalculation;

import static org.junit.Assert;
import org.junit.Test;


public class ComplexCalculationTest {
    
    ComplexCalculation cc = new ComplexCalculation();
    
    @Test
    public void Division() {
        
        int c = cc.Division(100, 5);
        
        assertEquals(20, c);        
    }

    @Test
    public void Multiply() {
        
        int c = cc.Multiply(100, 5);
        
        assertEquals(500, c);        
    }
}
