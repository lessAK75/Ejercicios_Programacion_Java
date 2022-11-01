/**
 * 
 * Ejercicio 1: cálculo del área de un trapecio regular.
 * Realiza un programa Java que permita la introducción de tres números reales. 
 * Estos números representarán la base menor, la base mayor y la altura de un trapecio regular.
 * Una vez introducidos los números por teclado, el programa calculará el área del trapecio regular siguiendo la fórmula indicada y escribirá por pantalla el resultado.
 * @author Javier Lesaca Medina
 */
package tarea01;

import java.util.Scanner; // importación de un paquete externo para poder utilizar la clase Scanner

public class Ejercicio1 {

    public static void main(String[] args) {

    //----------------------------------------------
    //    Declaración de variables y constantes
    //----------------------------------------------

        // Constantes 
        
        // Variables de entrada 
        double baseMayor;   //base mayor del trapecio en decimal
        double baseMenor;   //base menor del trapecio en decimal
        double altura;      //altura del trapecio en decimal
        
        // Variables de salida 
        double area; //variable que da el resultado de la formula quer calcula el área
        
        // Variables auxiliares
        String textoResultado; //variable que nos imprime por pantalla el resultado 
        
        // Clase Scanner para petición de datos al usuario a través del teclado
        Scanner teclado= new Scanner (System.in);
        
    //----------------------------------------------
    //               Entrada de datos 
    //----------------------------------------------
        System.out.println("Ejercicio 1. Saludo");
        System.out.println("--------------------");
        
        System.out.println("Introduce cuanto mide la base mayor del trapecio en cm: ");        // mostramos un mensaje sobre la información que vamos a pedir por teclado
        baseMayor = teclado.nextDouble();                       // a través del Scanner pedimos al usuario que escriba una línea (texto)
        
        System.out.println("Introduce cuanto mide la base menor del trapecio en cm: ");   // mostramos un mensaje sobre la información que vamos a pedir por teclado
        baseMenor = teclado.nextDouble();                                          // a través del Scanner pedimos al usuario que escriba un número entero 

        System.out.println("Introduce cuanto mide la altura del trapecio en cm: ");
        altura = teclado.nextDouble();
        
    //----------------------------------------------
    //                 Procesamiento 
    //----------------------------------------------
        area = (baseMayor + baseMenor)/2 * altura; // se aplica la formula para el calculo del area
        // se almacena en la variable resultado, el texto completo (recuerda que para unir textos se usa el operador + 
        textoResultado = "El área del trapecio base menor " + baseMenor + ", base mayor " + baseMayor + " y altura " + altura + " es: " + area;
        
        
    //----------------------------------------------
    //              Salida de resultados 
    //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");        
        System.out.println(textoResultado); // se muestra el contenido de la variable textoResultado
        System.out.println ();
        System.out.println ("Fin del programa.");           
    }
}

