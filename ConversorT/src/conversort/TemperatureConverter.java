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
public class TemperatureConverter {
    public double celsiusToKelvin(double c){
        return c + 273.15;
    }
    
    public double celsiusToFahrenheit(double c){
        return  c *  (float)9/5+32;
    }
    
    public double kelvinToCelsius(double k){
        return  (float) k - 273.15;
    }
    public double fahrenheitToCelsius(double f){
        float rest = (float) f-32;
        return rest * (float) 5/9;
    }
    
    public double kelvinToFahrenheit(double k){
        //°F = 1,8 x (K - 273) + 32
        return (float)1.8 * (k-273) +32;
    }
    
    public double fahrenheitToKelvin(double f){
        //K = 5/9 (ºF – 32) + 273.15
        return (float)5/9 * (f-32)+273.15;
    }
    
    
}
