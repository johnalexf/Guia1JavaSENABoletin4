package guia1javasenaboletin4;


import com.sun.security.auth.NTSid;
import guia1javasenaboletin4.Entrada;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOHN FORERO
 */
public class Boletin4Ejercicio9 {
    
    public static void solucion(){
        System.out.println("9. Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia \n" +
                                "abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a \n" +
                                "ser el primero.");
        
        int[] numeros = new int[10];
        int[] numerosDesplazados = new int[10];
        
        System.out.println("\nEscribe 10 numeros enteros");
        for(int i=0; i<numeros.length ; i++ ){
            System.out.printf("Escribe el numero %d = ", i+1);
            numeros[i]=Entrada.entero();
        }
        
        numerosDesplazados = desplazarVectorHaciaAbajo(numeros, 1);
         
        mostrarVector(numeros, "original");
        mostrarVector(numerosDesplazados, "desplazado una posicion hacia abajo");
        
    }
    
    public static void mostrarVector(int[] numeros, String mensaje ){
    
        System.out.println("\n El vector " + mensaje + " es :");
        for(int i=0 ; i< numeros.length ; i++){
            System.out.printf("| %d ",numeros[i]);
        }
        System.out.printf("| %n");
        
    }
    
    public static int[] desplazarVectorHaciaAbajo(int[] vector, int cantDesplazar){
    
        int[] vectorDesplazado = new int[vector.length];
        
        if(cantDesplazar >= 1){
            for(int i=0 ; i< vector.length ; i++){
                //System.out.println((i+cantDesplazar)%vector.length);
                vectorDesplazado[((i+cantDesplazar)%vector.length)] = vector[i];
            }
        }else{
             System.err.println("Señor programador, si desea mover el vector en sentido hacia arriba, hay que modificar o crear la funcion");
        }
        
        return vectorDesplazado;
    }
    
}
