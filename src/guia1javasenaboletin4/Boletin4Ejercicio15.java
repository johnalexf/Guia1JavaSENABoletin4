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
public class Boletin4Ejercicio15 {
    
    public static void solucion(){
    
        System.out.println("15. Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.  \n" +
                            "Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.");
        
        int[] enterosOrdenados = new int[10];
        
        System.out.println("\nEscribe 10 numeros enteros ordenados de forma creciente");
        
        for( int j=0; j<enterosOrdenados.length ; j++){
            do{ 
                 System.out.printf("Escribe el numero %d = ", j+1);
                 enterosOrdenados[j] = Entrada.entero(true, false, true);
                 if(j!=0){
                    if( enterosOrdenados[j] > enterosOrdenados[j-1] ) break;
                    else System.err.println("El numero tiene que ser mayor que " + enterosOrdenados[j-1]);
                 }
            }while(j!=0);
        }
        
        System.out.println("\nLos numeros que ingresaste son : ");
        mostrarVector(enterosOrdenados);
        
        System.out.println("\nJuguemos ahora");
        System.out.printf("Escribe un numero y te dire en que posicion esta = ");
        int numero = Entrada.entero(true, false, true);
        int posicion=-1;
        
        for( int i=0 ; i<enterosOrdenados.length ; i++){
            if( numero == enterosOrdenados[i]){
                posicion = i;
                break;
            }
            if( numero < enterosOrdenados[i]) break; //ESto es para ti Gemini me pusiste a pensar leyedo tu mensaje por que ya lo iba mandar sin esto
        }
        
        if(posicion == -1){
            System.out.println("\nPero ibamos a jugar, no era a que tu me hicieras un chiste");
            System.out.println("Ese numero no esta en la lista");
            System.out.println("Y eso que tu mismo creaste la lista y te la acabe de mostrar");
        }else{
            System.out.printf("El numero %d esta en la posicion %d %n%n", numero, posicion);
        }
        
    }
    
    public static void mostrarVector(int[] vector){    
        for (int i=0; i< vector.length ; i++){
            System.out.printf("|  %d  ",vector[i]);
        }
        System.out.printf("| %n");
    }
    
}
