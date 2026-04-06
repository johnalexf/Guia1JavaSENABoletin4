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
public class Boletin4Ejercicio13 {
    
    public static void solucion(){
    
        System.out.println("13. Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos \n" +
                            "impares.\n" +
                            "Realizar dos versiones: una trabajando con los valores y otra trabajando con los índices.");
        
        int[] numeros = new int[10];
        int[] numerosPares =  new int[10];
        int[] numerosImpares =  new int[10];
        int[] indiceNumerosPares =  new int[10];
        int[] indiceNumerosImpares =  new int[10];
        
        System.out.println("\nEscribe 10 numeros enteros positivos");
        for(int i=0; i<numeros.length; i++){
            System.out.printf("Escribe el numero %d = ",i+1);
            numeros[i] = Entrada.entero(false, false, true);
        }
        
        
        int indicePares = 0;
        int indiceImpares = 0;
        for(int i=0; i<numeros.length; i++){
            //Solucion con los valores
            if(numeros[i]%2 == 0) numerosPares[indicePares] = numeros[i];
            else  numerosImpares[indiceImpares] = numeros[i]; 
            
            //Solucion con los indices
            if(numeros[i]%2 == 0) indiceNumerosPares[indicePares++] = i;
            else  indiceNumerosImpares[indiceImpares++] = i; 
        }
        
        System.out.println("\nSolucion con los valores");
        mostrarVector(numerosPares, "numeros pares");
        mostrarVector(numerosImpares, "numeros impares");
        
        mostrarVector(indiceNumerosPares, "indices de los numeros pares");
        mostrarVector(indiceNumerosImpares, "indices de los numeros impares");
        
        
        
    }
    
    
     public static void mostrarVector(int[] numeros, String mensaje ){
    
        System.out.println("\n El vector " + mensaje + " es :");
        for(int i=0 ; i< numeros.length ; i++){
            System.out.printf("| %d ",numeros[i]);
        }
        System.out.printf("| %n");
        
    }
     
     
    
}
