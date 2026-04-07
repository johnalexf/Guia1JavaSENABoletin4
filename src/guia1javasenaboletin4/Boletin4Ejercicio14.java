/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1javasenaboletin4;

/**
 *
 * @author johna
 */
public class Boletin4Ejercicio14 {
    
    public static void solucion(){
    
        System.out.println("14. Leer dos series de 10 enteros, que estarán ordenados crecientemente.  \n" +
                            "Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.");
        
        int tamaño = 10;
        int cantidadSeries = 2;
        int[][] series = new int[cantidadSeries][tamaño];
        int[] serieFusionada = new int[tamaño*cantidadSeries];
        
        System.out.printf("%nEscribe dos series de %d enteros ordenados de forma creciente%n", tamaño);
        
        for( int i=0; i<cantidadSeries ; i++ ){
            System.out.printf("%nEscribe la serie #%d : %n", i+1);
            
            for( int j=0; j<tamaño ; j++){
               do{ 
                    System.out.printf("Escribe el numero %d = ", j+1);
                    series[i][j] = Entrada.entero(true, false, true);
                    if(j!=0){
                       if( series[i][j] > series[i][j-1] ) break;
                       else System.err.println("El numero tiene que ser mayor que " + series[i][j-1]);
                    }
               }while(j!=0);
            }
    
        }
        
        System.out.println("\nLos datos que ingresaste son los siguientes");
        for(int i=0; i<cantidadSeries ; i++){
            System.out.printf("%nserie %d : %n", i );
            mostrarVector(series[i]);
        }
        
        
        int indiceSerie1=0, indiceSerie2=0;
        for(int i = 0 ; i < serieFusionada.length ; i++){
            
            if(indiceSerie1 != tamaño && indiceSerie2 != tamaño ){
                if( series[0][indiceSerie1] >= series[1][indiceSerie2] ){
                    serieFusionada[i] = series[1][indiceSerie2++];
                }else{
                    serieFusionada[i] = series[0][indiceSerie1++];
                }
            }else if(indiceSerie1 == tamaño){
                serieFusionada[i] = series[1][indiceSerie2++];
            }else if (indiceSerie2 == tamaño){
                serieFusionada[i] = series[0][indiceSerie1++];
            }
            
        }
            
        System.out.println("\n La serie fusionada queda asi :");
        mostrarVector(serieFusionada);
        
        
        
        
    }
    
    
    public static void mostrarVector(int[] vector){    
        for (int i=0; i< vector.length ; i++){
            System.out.printf("|  %d  ",vector[i]);
        }
        System.out.printf("| %n");
    }
    
}
