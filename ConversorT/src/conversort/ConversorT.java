/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversort;

/**
 *
 * @author rebek
 */
public class ConversorT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println(tc.fahrenheitToCelsius(45));
        
    }
    
}
