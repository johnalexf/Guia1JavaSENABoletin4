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
public class Boletin4Ejercicio16 {
    
    public static void solucion (){
    
        System.out.println("16. Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo \n" +
                            "(o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un \n" +
                            "grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se \n" +
                            "encuentra en la posición N (N se lee por teclado).");
        
        int cantEstudiantes = 5;
        int ciclos = 3;
        
        int[][] notasEstudiantes = new int[ciclos][cantEstudiantes];
        double[] mediaPorCiclo = new double[ciclos];
        int[] sumasPorCiclo = new int[ciclos];
        
        System.out.println("\nIngresa las notas de los alumnos");
        
        for(int i=0 ; i < ciclos; i++){
            System.out.printf("%nDigite las notas del ciclo #%d %n", i+1);
            sumasPorCiclo[i] = 0;
            for(int j=0 ; j< cantEstudiantes ; j++){
                System.out.printf("Escriba la nota del estudiante #%d = ", j+1);
                notasEstudiantes[i][j] = Entrada.entero(true, false, true);
                sumasPorCiclo[i] += notasEstudiantes[i][j] ;
            }
        }
        
        System.out.println("\nLas notas de los alumnos son las siguientes con sus respectivas medias:");
        System.out.printf("Estudiantes %n");
        
        mostrarVector(new int[]{1,2,3,4,5});
        for(int i=0 ; i < ciclos; i++){
            System.out.printf("Ciclo #%d%n",i+1);
            mediaPorCiclo[i] = (double) sumasPorCiclo[i] / cantEstudiantes;
            System.out.printf("Media = %.2f %n", mediaPorCiclo[i] );
            mostrarVector(notasEstudiantes[i]);   
        }
        
        int estudiante;
        do {            
            System.out.printf("Ingresa el estudiante al cual deseas calcular su media de las notas = ");
            estudiante = Entrada.entero(true, false, true);
            if( estudiante >= 1 && estudiante <= cantEstudiantes) break;
            else System.err.println("El estudiante no existe");
        } while (true);
        
        int sumaNotasEstudiante = 0; 
        for(int i=0 ; i < ciclos; i++){
            sumaNotasEstudiante += notasEstudiantes[i][estudiante-1];
        }
                
        System.out.printf("La media del estudiante %d es = %.2f %n%n", estudiante, (double) sumaNotasEstudiante/ciclos );
    
    }
    
    public static void mostrarVector(int[] vector){
    
        for(int i=0; i< vector.length ; i++){
            System.out.printf("|  %d  ", vector[i]);
        }
        System.out.printf("| %n%n");
    
    }
    
}
