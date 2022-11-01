/**
 * Ejercicio 3: recluido en casa.
 * Diseñar un algoritmo que nos indique si podemos salir a la calle o no. 
 * Existen distintos aspectos que influyen en esta decisión: 
 * si está lloviendo o no, si hemos terminado la tarea online de programación o si debemos ir al supermercado.
 * Solo podremos salir a la calle si no está lloviendo y ya hemos terminado la tarea online de programación.
 * A pesar de lo anterior, existe una opción en la que podremos salir siempre a la calle: el hecho de que tengamos 
 * que ir al supermercado (necesitamos comer).
 * @author Javier Lesaca Medina
 */

package tarea01;

import java.util.Scanner;


public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        boolean llueve;             //variable que indica si llueve o no
        boolean tareaTerminada;     //variable que indica si la tasrea esta terminada o no
        boolean comprar;            //variable que indica si tenemos que comprar o no 
        
        // Variables de salida
        String salir;               //variable para mostrar si salimos o no


        // Variables auxiliares
        boolean casoA;      //podemos salir si no llueve y hemos terminado la tarea 
        boolean casoB;      //podemos salir si hay que comprar
        boolean casosSalida; //variable que se compone de los casos positivos para salir 
        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 3: recluido en casa ");
        System.out.println("----------------------------- ");
        System.out.println(" ");
        
        System.out.print("Indica si está lloviendo (true/false): ");
        llueve = teclado.nextBoolean();
        
        System.out.print("Indica si has terminado la tarea online de Programación (true/false): ");
        tareaTerminada = teclado.nextBoolean();
        
        System.out.print("Indica si tienes que ir al supermercado (true/false): ");
        comprar = teclado.nextBoolean();
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        //Definimos el primer caso en el que podemos salir (no llueve y tarea acabada)
        
        casoA = llueve == false && tareaTerminada == true;
        
        //Definimos el segundo caso donde tambien podemos salir (hay que comprar)
        
        casoB = comprar == true;
        
        //Definimos la variable de salida en la que si alguna de las condiciones anteriores
        //se cumplen la respuesta será positiva
        
        casosSalida = casoA || casoB;
        
        
        //Definimos el mensaje que mostrará en cualquiera de los casos por pantalla
        
        salir = casosSalida ? "Si" : "No";
       
 
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
        System.out.println ();
	System.out.println ("RESULTADO");
	System.out.println ("---------");
        
        System.out.println("Considerando la información anterior, ¿debo salir a la calle?");
        System.out.println(salir); //muestra el resultado de salir
        
        System.out.println ();
	System.out.println ("Fin del programa.");
    }

}
