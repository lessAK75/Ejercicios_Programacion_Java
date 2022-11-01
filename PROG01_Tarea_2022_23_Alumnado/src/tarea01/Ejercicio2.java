/**
 * Ejercicio 2: operadores aritméticos.
 * Realiza un programa Java que permita la introducción de tres números enteros. 
 * El programa realizará los cálculos necesarios para determinar:
 * 
 *  la suma de los dos primeros números divididos por el tercer número.
 *  si la suma de los tres números es par.
 *  si el resto del primer número dividido por el segundo número es distinto de 0.
 *  si la multiplicación del primer número por la mitad del segundo número es mayor que el tercer número.
 *  si el resultado del cuadrado del primer número menos el triple del segundo número por el tercer número es menor que 0.
 * @author Javier Lesaca Medina
 */

package tarea01;

import java.util.Scanner;


public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        float numA, numB, numC;   //variables con los tres números introducidos por el usuario 
        
        // Variables de salida
        float sumDivision;     //resultado de la suma de los dos primeros números divididos por el tercer número
        boolean esPar;          //resultado de si la suma de los tres números es par
        boolean distintoCero;   //resultado de si el resto del primer número dividido por el segundo número es distinto de 0.
        boolean esMayor;     //almacena resultado de si la multiplicación del primer número por la mitad del segundo número es mayor que el tercer número.
        boolean diferenciaCuadrado; //muestra si el resultado del cuadrado del primer número menos el triple del segundo número por el tercer número es menor que 0.


        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 2. operadores aritmeticos ");
        System.out.println("------------------------------------");
        System.out.println(" ");
        
        System.out.print("Introduce el primer número: ");
        numA = teclado.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        numB = teclado.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        numC = teclado.nextInt();

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        //Calculamos la suma de los dos primeros números divididos por el tercer número
        
        sumDivision = (numA + numB) / numC;
        
        //Calculamos el resultado de si la suma de los tres números es par
        
        esPar = (numA + numB + numC) % 2 == 0;
        
        //Calculamos el resultado de si el resto del primer número dividido por el segundo número es distinto de 0.
        
        distintoCero = (numA % numB) != 0;
        
        //Calculamos si la multiplicación del primer número por la mitad del segundo número es mayor que el tercer número.
        
        esMayor = (numA * ( numB / 2 )) > numC;
        
        //Calculamos si el resultado del cuadrado del primer número menos el triple del segundo número por el tercer número es menor que 0.
        
        diferenciaCuadrado = (numA*numA) - (( 3 * numB)*numC) < 0;
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
        System.out.println ();
	System.out.println ("RESULTADO");
	System.out.println ("---------");
        
        System.out.println("Comprobamos el valor de la suma de dos primeros números dividida por el tercer número: " + sumDivision);
        System.out.println("Comprobamos si la suma de los tres números es par: " + esPar);
        System.out.println("Comprobamos si el resto del primer número dividido por el segundo número es distinto de 0: " + distintoCero);
        System.out.println("Comprobamos si la multiplicación del primer número por la mitad del segundo número es mayor que el tercer número: " + esMayor);
        System.out.println("Comprobamos si el resultado del cuadrado del primer número menos el triple del segundo número por el tercer número es menor que 0: " + diferenciaCuadrado);
        
        System.out.println ();
	System.out.println ("Fin del programa.");
    }

}
