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
public class Boletin4Ejercicio6 {
    
    public static void solucion(){
    
        System.out.println("6. Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la \n" +
                            "forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.");
        
        int cantNumeros = 12;
        int cantTablas = 2;
        int[][] numeros = new int[cantTablas][cantNumeros];
        int[] numerosMezcla = new int[cantNumeros*cantTablas];
        
        for( int i=0 ; i < cantTablas ; i++){       
            System.out.printf("%n Escriba los datos de la tabla #%d %n", i+1);
            for(int j=0; j < cantNumeros ; j++){
                System.out.printf("Escriba el numero %d = ", j+1);
                numeros[i][j] = Entrada.entero();
            }
        }
        
        int guardarDeA = 3;
        
        for( int i=0; i < cantNumeros/guardarDeA; i++ ){
        
            for( int j=0; j < guardarDeA ; j++){
                //System.out.println(2*guardarDeA*i + j);
                //System.out.println(2*guardarDeA*i  + guardarDeA + j);
                numerosMezcla[2*guardarDeA*i + j] = numeros[0][guardarDeA*i + j];
                numerosMezcla[2*guardarDeA*i + guardarDeA + j] = numeros[1][guardarDeA*i + j];
                
            }
            
        }
        
        
        System.out.println("\n La tabla mezclada con los numeros en el orden establecido es:");
        for(int i=0; i < numerosMezcla.length ; i++){
            System.out.println(numerosMezcla[i]);
        }
                
       
        
    
    }
}
