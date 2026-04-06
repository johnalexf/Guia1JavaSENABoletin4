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
public class Boletin4Ejercicio12 {
    
    public static void solucion(){
    
        System.out.println("12. Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9). Eliminar el \n" +
                            "elemento situado en la posición dada sin dejar huecos.");
        
        
        int[] numeros = new int[10];
        int posicionesAEliminar;
        
        System.out.println("\nEscribe 10 numeros enteros");
        for(int i=0; i<numeros.length ; i++ ){
            System.out.printf("Escribe el numero %d = ", i+1);
            numeros[i]=Entrada.entero();
        }
        
        mostrarVector(numeros, "Original");
        
        
        System.out.println("\nVamos ahora a eliminar un numero");
        System.out.println("Vas a escribir la posicion del numero que quieres borrar");
        System.out.println("Para que sepas que posiciones son validas te lo muestro asi:");
        System.out.println("Tabla de posiciones : [ 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 ]");
        

        while(true){
            System.out.printf("Ingresa la posicion que quieres eliminar = ");
            posicionesAEliminar = Entrada.entero(true, false, true);

            if(posicionesAEliminar >= 0 && posicionesAEliminar<=numeros.length-1)       break;
            else  System.err.println("Lo siento la posicion no esta dentro del rango, intentalo de nuevo");
        }
       
        for( int i=posicionesAEliminar; i<numeros.length - 1 ; i++){
            numeros[i] = numeros[i+1];
        }
        numeros[numeros.length - 1] = 0;
        
        
        mostrarVector(numeros, "Modificado");
        
        
    }
    
    public static void mostrarVector(int[] numeros, String mensaje ){
    
        System.out.println("\n El vector " + mensaje + " es :");
        for(int i=0 ; i< numeros.length ; i++){
            System.out.printf("| %d ",numeros[i]);
        }
        System.out.printf("| %n");
        
    }
    
    
}
