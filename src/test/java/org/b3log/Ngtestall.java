package org.b3log;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.b3log.CoverageTest;
import org.b3log.SimpleCalculation;
import org.b3log.ComplexCalculation;

public class Ngtestall {

    SimpleCalculation sc;
    
    @BeforeClass
    public void beforeClass() {
        sc = new SimpleCalculation();
        System.out.println("this is before class");
    }

    @Test
    public void TestNgLearn() {
        System.out.println("this is TestNG test case");
    }

    @Test
    public void testadd(){
        int b = CoverageTest.testadd(5, 20);
        Assert.assertEquals(b,50);
        b = CoverageTest.testadd(10, 20);
        Assert.assertEquals(b,30);
        b = CoverageTest.testadd(30, 20);
        Assert.assertEquals(b,100);
    }
    
    @Test
    public void Add() {
        int c = sc.Add(3, 5);    
        Assert.assertEquals(c, 8);      
    }
    
    @Test
    public void Subtration() {
        int c = sc.Subtration(20, 5);     
        Assert.assertEquals(c, 15);
    }
    
    @Test
    public void Division() {
        int c = sc.Division(100, 5);
        Assert.assertEquals(c, 20);      
    }

    @Test
    public void Multiply() {
        int c = sc.Multiply(100, 5);
        Assert.assertEquals(c, 500);
    }
    
    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
}
