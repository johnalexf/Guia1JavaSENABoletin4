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
public class Boletin4Ejercicio4 {
 
    public static void solucion(){
    
        System.out.println("4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el \n" +
                            "penúltimo, el tercero, etc.");
        
        int[] numeros =  new int[11];
        
        for (int i=0 ; i < numeros.length ; i++){
           
            System.out.printf("Escribe el %d numero Entero = ",i+1);
            numeros[i] = Entrada.entero();
            
        }
        
        System.out.println("\n Los numeros mostrados desde los extremos hasta el centro se ven asi :");
        
        
        for(int i=0 ; i < (numeros.length/2) ; i++){
            System.out.printf("El %d numero es : %d %n", i + 1, numeros[i]);
            System.out.printf("El %d numero es : %d  %n", (numeros.length-i), numeros[(numeros.length-1) - i]);     
        }
        
        if(numeros.length % 2 != 0)
            System.out.printf("El %d numero es : %d %n", (numeros.length/2) + 1, numeros[numeros.length/2]);
    
    }
    
}
