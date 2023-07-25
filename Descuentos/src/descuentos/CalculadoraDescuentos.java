/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuentos;

/**
 *
 * @author rebek
 * 
 * Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
 */
public class CalculadoraDescuentos {
    public double calcularDescuento(double precio, double dto){
        if(dto == 0){
            return precio;
        }
        if(dto == 100){
            return 0;
        }
        double total = precio;
        double valorDescuento = (precio * dto)/100;
        return total - valorDescuento;
    }
}
