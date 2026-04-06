/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1javasenaboletin4;

/**
 *
 * @author JOHN FORERO
 */
public class Boletin4Ejercicio2 {
    
    public static void solucion(){
        System.out.println("2. Leer 5 números y mostrarlos en orden inverso al introducido.");
        
        double[] numeros = new double[5];
        
        for( int i=0 ; i < numeros.length ; i++){
            System.out.printf("Escriba el %d numero = ",i+1);
            numeros[i] = Entrada.real();
        }
        
        System.out.println("\nLos numeros introducidos en orden inverson son");
        
        for( int i = numeros.length - 1 ; i >= 0 ; i--  ){
            System.out.println(numeros[i]);
        }
        
       
    }
    
}
