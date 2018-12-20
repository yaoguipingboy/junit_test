package org.b3log;

import org.junit.Assert;
import org.junit.Test;

import org.b3log.SimpleCalculation;

public class SimpleCalculationTest {

    SimpleCalculation sc = new SimpleCalculation();
    
    @Test
    public void Add() {
        
        int c = sc.Add(3, 5);    
        
        assertEquals(8, c);        
    }
    
    @Test
    public void Subtration() {
        
        int c = sc.Subtration(20, 5);    
        
        assertEquals(15, c);        
    }
}
