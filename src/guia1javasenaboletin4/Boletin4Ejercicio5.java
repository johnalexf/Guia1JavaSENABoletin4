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
public class Boletin4Ejercicio5 {
    
    public static void solucion(){
    
        System.out.println("5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º \n" +
                            "de B, el 2º de A, el 2º de B, etc.");
        
        int cantNumeros = 10;
        int[] capturarNumeros = new int[cantNumeros];
        int[] numeros1 = new int[cantNumeros];
        int[] numeros2 = new int[cantNumeros];
        int[] numerosMezcla = new int[cantNumeros*2];
        
        for(int i=0; i < 2 ; i++ ){
            System.out.printf("%nIngresar los datos de la tabla #%d %n", i+1);
            
            for( int j=0 ; j < capturarNumeros.length ; j++){
                System.out.printf("Digita el numero %d = ", j+1);
                capturarNumeros[j]= Entrada.entero();
            }
            if(i == 0) numeros1 = capturarNumeros.clone();
            else numeros2 = capturarNumeros.clone();
            
        }
        
        for(int i=0 ; i < numeros1.length ; i++ ){
            numerosMezcla[2*i] = numeros1[i];
            numerosMezcla[2*i+1] = numeros2[i];
        }
        
        
        System.out.println("\n La tabla con los datos mezclados y en el orden solicitados es:");
        
        for(int i=0; i< numerosMezcla.length ; i++){
            System.out.printf("%d %n", numerosMezcla[i]);
        }
           
        
        
        
        
    }
}
