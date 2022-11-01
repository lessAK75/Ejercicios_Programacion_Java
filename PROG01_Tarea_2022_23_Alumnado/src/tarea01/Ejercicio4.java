/**
 * Ejercicio 4: horas, minutos y segundos
 * Escribe un programa en Java que permita introducir por teclado una cantidad de segundos mediante un valor entero.
 * A continuación, se pedirá por pantalla la introducción de tres valores enteros correspondientes a un número de horas, 
 * un número de minutos y un número de segundos.
 * La aplicación deberá calcular cuántas horas, minutos y segundos corresponden a la suma de ambas cantidades 
 * y la mostrará por pantalla.
 * @author Javier Lesaca Medina
 */

package tarea01;

import java.util.Scanner;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        int segundosA;  //variable que almacena el número de segundos que se pide la primera vez
        int horas;      //variable que almacena el número de horas
        int minutos;    //variable que almacena el número de minutos
        int segundosB;  //variable que almacena el número de segundos que se pide la segunda vez
        
        
        // Variables de salida
        int resultadoHoras;     //variable que muestra las horas totales despues de sumar y calcular
        int resultadoMinutos;   //variable que muestra los minutos totales despues de sumar y calcular


        // Variables auxiliares
        int segundosTotales;    //variable que almacena los segundos totales despues de sumar
        int restoHoras;         //varible que muestra el resto de segundos después de calcular horas totales 
        int restoMinutos;       //variable que muestra los segundos restantes después de calcular los minutos totales

        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 4: horas, minutos y segundos ");
        System.out.println("-------------------------------------- ");
        System.out.println(" ");
        
        System.out.print("Introduce el total de segundos: ");
        segundosA = teclado.nextInt();
        System.out.print("Introduce el número de horas: ");
        horas = teclado.nextInt();
        System.out.print("Introduce el número de minutos: ");
        minutos = teclado.nextInt();
        System.out.print("Introduce el número de segundos: ");
        segundosB = teclado.nextInt();

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        //Calculamos los segundos totales resultantes de la suma de los datos introducidos
        
        segundosTotales = segundosA + (horas*3600) + (minutos*60) + segundosB;
        
        //Calculamos el numero de horas totales y el resto de segundos que nos quedan
        resultadoHoras = segundosTotales / 3600;
        restoHoras = segundosTotales % 3600;
        
        //Calculamos minutos y el resto de segundos 
        resultadoMinutos = restoHoras / 60;
        restoMinutos = restoHoras % 60;
        
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
        System.out.println ();
	System.out.println ("RESULTADO");
	System.out.println ("---------");
        
        System.out.println("Las cantidades introducidas suman un total de " + resultadoHoras + " horas, " + resultadoMinutos + " minutos y " + restoMinutos + " segundos.");
        
        
        System.out.println ();
	System.out.println ("Fin del programa.");
    }

}
