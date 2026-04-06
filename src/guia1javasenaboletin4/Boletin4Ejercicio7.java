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
public class Boletin4Ejercicio7 {
    
    public static void solucion(){
        
        System.out.println("7. Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están \n" +
                            "ordenados de forma creciente, decreciente, o si están desordenados.");
        
        int[] numeros = new int[10];
        boolean isOrdenados = false, isCreciente = false;
      
        
        System.out.println("Digite 10 numeros enteros en orden");
        for( int i=0; i < numeros.length ;i++){
            System.out.printf("Escriba el numero #%d  = ",i+1);
            numeros[i] = Entrada.entero();
        }
        
        
        int numeroVerificacion = numeros[0];
        
        /* Verificamos primero si es decreciente aqui nos importa llegar hasta el final para confirmar 
        que si esta ordenado, de eso depende si tenemos en cuenta la variable isCreciente 
        que igual ya esta asignada como false */
        for( int i=1; i < numeros.length ; i++){
            
            if(numeroVerificacion == numeros[i]) break;
            
            if(numeroVerificacion > numeros[i]) numeroVerificacion = numeros[i];
            else  break;
            
            if( i == numeros.length-1 ) isOrdenados = true;
        }
        
        /*Si isOrdenado es verdadero no necesitamos verificacion si es creciente 
        por que ya se confirmo que es decreciente y que esta ordenado
        */
        if(!isOrdenados){
            numeroVerificacion = numeros[0];
            for( int i=1; i < numeros.length ; i++){

                if(numeroVerificacion == numeros[i]) break;
                
                if(numeroVerificacion < numeros[i]) numeroVerificacion = numeros[i];
                else    break;

                if( i == numeros.length-1 ){
                    isCreciente = true;
                    isOrdenados = true;
                }
   
            }
        }
        
        if(isOrdenados)
            System.out.printf(" Los numeros estan ordenado de manera %s %n", isCreciente ? "Creciente" : "Decreciente");
        else
            System.out.println("Los numeros no estan ordenados");
            
        
        
        
    
    }
}
