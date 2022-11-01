/*
 *Ejercicio 4: Histograma Vertical 
 */
package tarea02;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Javier Lesaca Medina
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Variables de entrada (aquí se definen las variables que recibirán valores, si fueran necesarias)
        int filas; //número de filas que se solicitan al usuario
        
        // Variables de salida (aquí se definen las variables que almacenarán resultados y se mostrarán al usuario, si fueran necesarias)
        
        // Varibles auxiliares para que maneje el programa 
        int arregloFilas; //varible que contiene el numero de filas multiplo de 4 ya ajustado
        int contador; //variable que cuenta el numero necesario a restar a filas para que sea multiplo de 4 
        int maxSimbolos; //variable que almacena el numero máximo de signos posibles por fila 
        Random aleatorio = new Random(); //Variable que almacena NUMERO ALEATORIO DE SIMBOLOS POR FILA
        //int bloques = filas/4;
        // Clase Scanner para petición de datos al usuario a través del teclado
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 4. Histograma");
        System.out.println("-----------------------------------------");
        //Pedimos el número de filas que desea el usuario y seguiremos pidiendoselo mientras no intoduzca un numero mayor a 12
        do {
        System.out.println("Introduce el número de filas del histograma (Mayor que 12)");
        filas = teclado.nextInt();
        } while (filas < 12);
        
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
 
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println("");
        System.out.println("RESULTADO");
        System.out.println("-------------------------------------");
        //Comprueba que el número de filas es múltiplo de 4 y se ajuste si no lo es al múltiplo menor de 4 
        if (filas % 4 != 0) {
            for (contador = 1; contador < 4; contador++) {
                arregloFilas = filas - contador;
                if (arregloFilas % 4 == 0) {
                    filas = arregloFilas;
                    System.out.println("El histograma va a presentar " + filas + " filas.");
                    System.out.println("----------------------------------------------------");
                }
            }
        } else {
            System.out.println("El histograma va a presentar " + filas + " filas.");
            System.out.println("----------------------------------------------------");
        }

        //Calcula el número máximo de de simbolos que tendrá cada fila
        maxSimbolos = filas / 2;
        //System.out.println(maxSimbolos);
        //Comienza a dibujar histograma
        
        /*El histograma se compone de cuatro lineas que se repiten asi que el numero de veces que se debe repetir el bucle
        debe de ser el número de filas a imprimir dividido entre las cuatro lineas que se imprimen en cada iteración. 
        Para cada linea genera un número aleatorio que indica el numero de simbolos a imprimir y luego entra en un bucle que 
        imprime el signo mediante un contador.
        */
        for (int e = 1; e <= filas / 4; e++) {
            
            //Primera linea con el simbolo *
            int numeroAleatorioAsterisco = 3 + aleatorio.nextInt(maxSimbolos-3+1);//Genera número aleatorio mayor que 3 y menor que la mitad de filas.
            for (int i = 1; i <= numeroAleatorioAsterisco; i++) {//Itera el número de veces indicado por el aleatorio e imprime el simbolo
                System.out.print("*");
            }
            System.out.println("");//Salto de linea al salir del bucle
            //Segunda linea que repite el mismo proceso que la primera
            int numeroAleatorioAlmohadilla = 3 + aleatorio.nextInt(maxSimbolos-3+1);
            for (int i = 1; i <= numeroAleatorioAlmohadilla; i++) {
                System.out.print("#");
            }
            System.out.println("");
            //tercera linea
            int numeroAleatorioArroba = 3 + aleatorio.nextInt(maxSimbolos-3+1);
            for (int i = 1; i <= numeroAleatorioArroba; i++) {
                System.out.print("@");
            }
            System.out.println("");
            //cuarta linea
            int numeroAleatorioMayorque = 3 + aleatorio.nextInt(maxSimbolos-3+1);
            for (int i = 1; i <= numeroAleatorioMayorque; i++) {
                System.out.print(">");
            }
            System.out.println("");
            //linea de cierre
            System.out.println("----------------------------------------------------");
        }
    }
}
