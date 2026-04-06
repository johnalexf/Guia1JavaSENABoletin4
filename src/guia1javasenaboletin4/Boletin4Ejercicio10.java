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
public class Boletin4Ejercicio10 {
    
    public static void solucion(){
    
        System.out.println("10. Ídem, desplazar N posiciones (N es introducido por el usuario).");
        
        int[] numeros = new int[10];
        int posicionesADesplazar;
        
        System.out.println("\nEscribe 10 numeros enteros");
        for(int i=0; i<numeros.length ; i++ ){
            System.out.printf("Escribe el numero %d = ", i+1);
            numeros[i]=Entrada.entero();
        }
        
        System.out.println("\nVamos a desplazar el vector que me entregaste hacia abajo");
        mostrarVector(numeros, "original");
        
        System.out.println("Escribe la cantidad de posiciones que deseas moverlo");
        posicionesADesplazar = Entrada.entero(false, false, true);
        
        numeros = desplazarVectorHaciaAbajo(numeros, posicionesADesplazar);
         
        String mensaje = "desplazado " + posicionesADesplazar + " posicion(es) hacia abajo";
        mostrarVector(numeros, mensaje);
        
    }
    
    public static void mostrarVector(int[] numeros, String mensaje ){
    
        System.out.println("\n El vector " + mensaje + " es :");
        for(int i=0 ; i< numeros.length ; i++){
            System.out.printf("| %d ",numeros[i]);
        }
        System.out.printf("| %n");
        
    }
    
    public static int[] desplazarVectorHaciaAbajo(int[] vector, int cantDesplazar){
    
        int[] vectorDesplazado = new int[vector.length];
        
        if(cantDesplazar >= 1){
            for(int i=0 ; i< vector.length ; i++){
                //System.out.println((i+cantDesplazar)%vector.length);
                vectorDesplazado[((i+cantDesplazar)%vector.length)] = vector[i];
            }
        }else{
             System.err.println("Señor programador, si desea mover el vector en sentido hacia arriba, hay que modificar o crear la funcion");
        }
        
        return vectorDesplazado;
    }
    
}
