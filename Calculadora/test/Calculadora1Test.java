/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rebek
 */
public class Calculadora1Test {
    
    public Calculadora1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculadora1.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 3;
        Calculadora1 instance = new Calculadora1();
        int expResult = 5;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of substract method, of class Calculadora1.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        int a = 10;
        int b = 2;
        Calculadora1 instance = new Calculadora1();
        int expResult = 8;
        int result = instance.substract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multiply method, of class Calculadora1.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 2;
        int b = 5;
        Calculadora1 instance = new Calculadora1();
        int expResult = 10;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of divide method, of class Calculadora1.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 10;
        int b = 2;
        Calculadora1 instance = new Calculadora1();
        int expResult = 5;
        int result = instance.divide(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
