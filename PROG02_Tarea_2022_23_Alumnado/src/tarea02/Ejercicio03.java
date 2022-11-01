/*
 * Juego de las Siete y Media
 */
package tarea02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Javier Lesaca Medina
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Variables de entrada (aquí se definen las variables que recibirán valores, si fueran necesarias)
        boolean nuevaCarta;
        // Variables de salida (aquí se definen las variables que almacenarán resultados y se mostrarán al usuario, si fueran necesarias)
        float totalUsuario = 0;
        // Clase Scanner para petición de datos al usuario a través del teclado
        Scanner teclado = new Scanner(System.in);
        
        //Variables auxiliares que manejará el programa
        Random r = new Random();
        float banca;
        int carta;
        float puntos = 0;
        String valor = "";
        //int nCarta;
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------

        // Generamos un número entre 4 y 7.5
        /* La clase Random es una clase de Java que nos sirve para generar elementos aleatorios
            en este caso el objeto "r", consigue a través de su método nextInt(número), generar
            un número aleatorio entero entre 0 y número-1, por ejemplo r.nextInt(4), generará 
            un número entero entre 0 y 3, es decir, podrá devolver 0,1,2 o 3 cada vez que se 
            utilice.
            En la siguiente línea generamos un número entre  0 y 3, al que le sumamos 4, de esta
            forma la banca obtendrá siempre un número bastante competivo, entre 4 y 7.
            Posteriormente utilizamos este mismo método sin parámetros, generando un entero entre
            0 y 2 elevado a 32
         */
        System.out.println("Ejercicio 4. Juego Siete y Media");
        System.out.println("----------------------------------------------------");

        banca = 4 + r.nextInt(4) + ((r.nextInt() % 2 == 0) ? 0f : 0.5f);

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------


        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println("La banca ha jugado, hasta donde te atreves a apostar");
        System.out.println("");
        System.out.println("JUEGO");
        System.out.println("-------------------------------");
        /*El programa realizara las acciones pertinenetes y continua preguntando si saca otra carta dentro de un bucle (do)
        mientras el jugador asi lo deseé (nuevaCarta = true)*/
        do {
        //Genera una carta aleatoria comprendida entre el 1 y el 12 
            carta = 1 + r.nextInt(12);
        //Asigna valor númerico (float) y descripción de texto (String) a las posibles cartas que pueden salir en la baraja     
          switch (carta){
            case 1:
                valor = "1";
                puntos = 1;
                break;
            case 2:
                valor = "2";
                puntos = 2;
                break;
            case 3:
                valor = "3";
                puntos = 3;
                break;
            case 4:
                valor = "4";
                puntos = 4;
                break;
            case 5:
                valor = "5";
                puntos = 5;
                break;
            case 6:
                valor = "6";
                puntos = 6;
                break;
            case 7:
                valor = "7";
                puntos = 7;
                break;
            case 8: case 9:
                valor = "Carta sin valor (0)";
                puntos = 0;
                break;
            case 10: case 11: case 12: 
                valor = "Una figura";
                puntos = 0.5f;
                break;
                 
            }
            System.out.printf("Ha obtenido: %s (%.1f)%n", valor, puntos); //Imprime por consola la descripción y el valor de la carta
            totalUsuario += puntos; //Acumula los puntos que obtiene de cada carta sacada en cada iteración 
            System.out.println("La suma total de sus cartas es: " + totalUsuario);//Imprime el total de puntos que acumula el juegador
            /*Si el total de puntos es menor o igual de 7 y medio preguntará si queremos volver a sacar carta, si la suma es mayor de 7 
            y medio el programa saldrá del bucle*/
            if (totalUsuario <= 7.5f) {
                System.out.println("Desea seguir (true - false)");
                nuevaCarta = teclado.nextBoolean();
            } else {
            /*Para realizar la salida de la condición se me ocurre hacerlo de dos formas, dando un valor de false a la variable de repartir 
            nueva carta o realizando un break, la primera me parece más elegante*/
                nuevaCarta = false;

            }
        } while (nuevaCarta == true);

        System.out.println("RESULTADO");
        System.out.println("-------------------------------");

        if (banca >= totalUsuario && totalUsuario <= 7.5f) { //si la puntuación de la banca es mayor o igual que la del jugador imprime mensaje 
            System.out.printf("Ha ganado la banca(%.1f) vs (%.1f) jugador %n", banca, totalUsuario);
        } else if (banca < totalUsuario && totalUsuario <= 7.5f) {//si la puntuación de la banca es menor que la del jugador imprime mensaje 
            System.out.printf("Has ganado: banca(%.1f) vs (%.1f) jugador %n", banca, totalUsuario);
        } else { //si no se cumple nada de lo anterior es que el jugador se ha pasado de siete y medio
            System.out.println("Ha ganado la banca, te has pasado");
        }
    }

}
