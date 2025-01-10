/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.polimorfismoestaticoo;

import ec.edu.espoch.polimorfismoestaticoo.clases.Calculadora;

/**
 *
 * @author USER
 */
public class PolimorfismoEstaticoo {

    public static void main(String[] args) {
    
        Calculadora objCalculadora= new Calculadora();
        int result=objCalculadora.sumar(5, 7);
        int result2=objCalculadora.sumar(5,4,4);
        
        double resul3=objCalculadora.sumar(5, 8);
        double resul4=objCalculadora.sumar(5, 8,5);
        
        float result5=objCalculadora.sumar(8, 8);
        float result6=objCalculadora.sumar(7, 8, 7);
        
        System.out.println("El resultado es :"+result);
        System.out.println("El resultado es: "+result2);
        System.out.println("El resultado es: "+resul3);
        System.out.println("El resultado es: "+resul4);
        System.out.println("El resultado es: "+result5);
        System.out.println("El resultado es: "+result6);
        
    }
    
}
