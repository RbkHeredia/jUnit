/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversort;

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
public class TemperatureConverterTest {
    
    public TemperatureConverterTest() {
    }
    
    TemperatureConverter instance ;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new TemperatureConverter();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of celsiusToKelvin method, of class TemperatureConverter.
     */
    @Test
    public void testCelsiusToKelvin() {
        System.out.println("celsiusToKelvin");
        double c = 5.0;
        double expResult = 278.15;
        double result = instance.celsiusToKelvin(c);
        assertEquals(expResult, result, 0.5);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of celsiusToFahrenheit method, of class TemperatureConverter.
     */
    @Test
    public void testCelsiusToFahrenheit() {
        System.out.println("celsiusToFahrenheit");
        double c = 1.0;
        double expResult = 33.8;
        double result = instance.celsiusToFahrenheit(c);
        assertEquals(expResult, result, 0.5);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of kelvinToCelsius method, of class TemperatureConverter.
     */
    @Test
    public void testKelvinToCelsius() {
        System.out.println("kelvinToCelsius");
        double k = 280.0;
        double expResult = 6.85;
        double result = instance.kelvinToCelsius(k);
        assertEquals(expResult, result, 0.5);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of fahrenheitToCelsius method, of class TemperatureConverter.
     */
    @Test
    public void testFahrenheitToCelsius() {
        System.out.println("fahrenheitToCelsius");
        double f = 45.0;
        double expResult = 7.23;
        double result = instance.fahrenheitToCelsius(f);
        assertEquals(expResult, result, 0.5);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of kelvinToFahrenheit method, of class TemperatureConverter.
     */
    @Test
    public void testKelvinToFahrenheit() {
        System.out.println("kelvinToFahrenheit");
        double k = 300.0;
        double expResult = 80.33;
        double result = instance.kelvinToFahrenheit(k);
        assertEquals(expResult, result, 0.5);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of fahrenheitToKelvin method, of class TemperatureConverter.
     */
    @Test
    public void testFahrenheitToKelvin() {
        System.out.println("fahrenheitToKelvin");
        double f = 5.0;
        double expResult = 258.15;
        double result = instance.fahrenheitToKelvin(f);
        assertEquals(expResult, result, 0.5);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
