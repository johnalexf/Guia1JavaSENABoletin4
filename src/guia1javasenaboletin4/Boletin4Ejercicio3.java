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
public class Boletin4Ejercicio3 {
    
    public static void solucion(){
    
        System.out.println("3. Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media \n" +
                            "de los negativos y contar el número de ceros.");
        
        double[] numeros = new double[5];
        double sumaPositivos = 0, sumaNegativos = 0;
        int cantPos=0, cantNeg=0, cantCeros=0;
        
        for( int i=0 ; i < numeros.length ; i++){
            
            System.out.printf("Escriba el %d numero = ",i+1);
            numeros[i] = Entrada.real();
            
            if(numeros[i] == 0) cantCeros++;
            else if (numeros[i] > 0){
                cantPos++;
                sumaPositivos += numeros[i];
            }else{
                cantNeg++;
                sumaNegativos += numeros[i];
            }
        }
        
        if( cantPos == 0 ) System.out.println("No ingresaste Numeros Positivos");
        else System.out.printf("Ingresaste %d Numeros Positivos y su media es : %.2f  %n", cantPos, sumaPositivos/cantPos);
        
        if( cantNeg == 0 ) System.out.println("No ingresaste Numeros Negativos");
        else System.out.printf("Ingresaste %d Numeros Negativos y su media es : %.2f  %n", cantNeg, sumaNegativos/cantNeg);
        
        if( cantCeros == 0 ) System.out.println("No ingresaste Ceros");
        else System.out.printf("Ingresaste %d Ceros %n", cantCeros);
        
        
        
        
        System.out.printf("");
        
        
        
    }
    
}
