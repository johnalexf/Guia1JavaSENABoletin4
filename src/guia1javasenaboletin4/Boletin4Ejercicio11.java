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
public class Boletin4Ejercicio11 {
    
    public static void solucion(){
    
        System.out.println("11. Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos los guardaremos en una \n" +
                            "tabla de tamaño 10. Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.");
        
        int[] numeros = new int[10];
        
        System.out.println("\nEscriba una lista de 5 numeros de forma creciente\n");
        
        for( int i=0 ; i < 5; i++){
            do{
                System.out.printf("Escriba el numero %d = ",i+1);
                numeros[i] = Entrada.entero();
                if( i!=0 ){
                    if( numeros[i] > numeros[i-1])  break;
                    else System.out.println("El numero tiene que ser mayor a " +  numeros[i-1]);
                    
                }
            }while(i!=0);
        
        }
        
        mostrarVector(numeros, "original");
        
        System.out.println("Escribe un nuevo numero cualquiera y te lo acomodare en tu lista para que siga ordenada");
        int nuevoNumero = Entrada.entero();
        
        for(int i=4 ; i >= 0; i--){
            
            if( nuevoNumero >= numeros[i] ){
                 numeros[i+1]=nuevoNumero;
                 break;
            }else{
                numeros[i+1] = numeros[i];
                if(i==0) numeros[i]=nuevoNumero;
            }
            
        }
        
        mostrarVector(numeros, "modificado");
    
    }
    
     public static void mostrarVector(int[] numeros, String mensaje ){
    
        System.out.println("\n El vector " + mensaje + " es :");
        for(int i=0 ; i< numeros.length ; i++){
            System.out.printf("| %d ",numeros[i]);
        }
        System.out.printf("| %n");
        
    }
}
