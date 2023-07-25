/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuentos;

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
public class CalculadoraDescuentosTest {
    
    public CalculadoraDescuentosTest() {
    }
    
    CalculadoraDescuentos instance;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CalculadoraDescuentos();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularDescuento method, of class CalculadoraDescuentos.
     */
    @Test
    public void testCalcularDescuento() {
        System.out.println("Prueba calcular descuento");
        double precio = 30.0;
        double dto = 10.0;
        double expResult = 27.0;
        double result = instance.calcularDescuento(precio, dto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
            fail("La prueba falló, los valores no son los esperados.");
        } else {
            System.out.println("Prueba pasada");
        }
    }
    
    @Test
    public void testCalcularCero() {
        System.out.println("Prueba calcular descuento 0");
        double precio = 50.0;
        double dto = 0.0;
        double expResult = 50.0;
        double result = instance.calcularDescuento(precio, dto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
            fail("La prueba falló, los valores no son los esperados.");
        } else {
            System.out.println("Prueba pasada");
        }
    }
    
    @Test
    public void testCalcularDescuentoTotal() {
        System.out.println("Prueba calcular descuento al 100%");
        double precio = 30.0;
        double dto = 100.0;
        double expResult = 0.0;
        double result = instance.calcularDescuento(precio, dto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
            fail("La prueba falló, los valores no son los esperados.");
        } else {
            System.out.println("Prueba pasada");
        }
    }
    
}
