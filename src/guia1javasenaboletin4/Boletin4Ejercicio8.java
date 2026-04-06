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
public class Boletin4Ejercicio8 {
    
    public static void solucion(){
        System.out.println("8. Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números. \n" +
                            "Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén \n" +
                            "detrás.");
        
        int[] numeros = new int[10];
        
        System.out.println("Escribe 8 numeros acontinuacion : ");
        
        for(int i=0 ; i < 8 ; i++ ){
            System.out.printf("Escribe el numero %d =  ", i+1 );
            numeros[i] = Entrada.entero();
        }
        
        System.out.println("\nVamos ahora a ingresasr los dos numeros que faltan");
        System.out.println("Vas a escribir el numero que quieres ingresar, y despues la posicion");
        System.out.println("Para que sepas que posiciones son validas te lo muestro asi:");
        System.out.println("Tabla de posiciones : [ 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 ]");
        
        for(int i=1 ; i<=2 ; i++){
            
            System.out.printf("Escribe el %d numero que quieres ingresar = ", i);
            int numeroAdicional = Entrada.entero();
            int posicion;
            
            while(true){
                System.out.printf("Ingresa la posicion donde quiere el numero %d ", numeroAdicional);
                posicion = Entrada.entero(true, false, true);
                
                if(posicion >= 0 && posicion<=9)       break;
                else  System.err.println("Lo siento la posicion no esta dentro del rango, intentalo de nuevo");
            }
            
            for(int j=numeros.length -1 ; j > posicion  ; j--){
                numeros[j] = numeros[j-1];
            }
        
            numeros[posicion] = numeroAdicional;
        }
        
        
        System.out.println("\nLa tabla con los cambios requeridos queda asi:");
        for(int i=0 ; i < numeros.length ; i++){
            System.out.println(numeros[i]);
        }
        
        
    }
    
}
