/*
 * Ejercicio 02
Escribe un programa en Java que solicite al usuario un número de día y  un número de mes.
Evidentemente el mes debe encontrarse entre 1 y 12 ambos inclusive, y el número de día debe estar entre 1 y el número máximo
de días que pueda tener cada mes en concreto (para el mes de Febrero tomaremos como máximo 29; 
para los meses de Abril, Junio, Septiembre, y Noviembre tomaremos 30; y para el resto de meses 31 ). 
Si mes o el día introducido no es válido (no está en ese rango), se indicará que la fecha no es correcta, 
y finalizará el programa mostrando el correspondiente mensaje de error por pantalla.
 */
package tarea02;

import java.util.Scanner;

/**
 *
 * @author Javier Lesaca Medina
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Variables de entrada (aquí se definen las variables que recibirán valores, si fueran necesarias)
        int dia;
        int mes;
        // Variables de salida (aquí se definen las variables que almacenarán resultados y se mostrarán al usuario, si fueran necesarias)
        String signoZodiaco = "";
        //Variables auxiliares
        boolean valida = false;
        // Clase Scanner para petición de datos al usuario a través del teclado
        Scanner teclado = new Scanner(System.in);
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 2. Signos del Zodíaco");
        System.out.println("----------------------------------------------------");
        System.out.println("Introduce número del MES");
        mes = teclado.nextInt();
        System.out.println("Introduce el DÍA del mes");
        dia = teclado.nextInt();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        //Comprobamos que la fecha dada es correcta comprobando en cada bloque los meses agrupados por el total de dias que tienen.
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia > 0 && dia < 32) {
                    valida = true;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 0 && dia < 31) {
                    valida = true;
                }
                break;
            case 2:
                if (dia > 0 && dia < 30) {
                    valida = true;
                }
        }
        //Si la fecha es correcta comprobamos por cada mes que signo le corresponde al dia   
        if (valida == true) {
            switch (mes) {
                case 1:
                    if (dia <= 20) {
                        signoZodiaco = "Capricornio";
                    } else {
                        signoZodiaco = "Acuario";
                    }
                    break;
                case 3:
                    if (dia <= 20) {
                        signoZodiaco = "Piscis";
                    } else {
                        signoZodiaco = "Aries";
                    }
                    break;
                case 5:
                    if (dia <= 21) {
                        signoZodiaco = "Tauro";
                    } else {
                        signoZodiaco = "Géminis";
                    }
                    break;
                case 7:
                    if (dia <= 23) {
                        signoZodiaco = "Cáncer";
                    } else {
                        signoZodiaco = "Leo";
                    }
                    break;
                case 8:
                    if (dia <= 24) {
                        signoZodiaco = "Leo";
                    } else {
                        signoZodiaco = "Virgo";
                    }
                    break;
                case 10:
                    if (dia <= 23) {
                        signoZodiaco = "Libra";
                    } else {
                        signoZodiaco = "Escorpio";
                    }
                    break;
                case 12:
                    if (dia <= 21) {
                        signoZodiaco = "Sagitario";
                    } else {
                        signoZodiaco = "Capricornio";
                    }

                    break;

                case 4:
                    if (dia <= 20) {
                        signoZodiaco = "Aries";
                    } else {
                        signoZodiaco = "Tauro";
                    }
                    break;
                case 6:
                    if (dia <= 22) {
                        signoZodiaco = "Géminis";
                    } else {
                        signoZodiaco = "Cáncer";
                    }
                    break;
                case 9:
                    if (dia <= 23) {
                        signoZodiaco = "Virgo";
                    } else {
                        signoZodiaco = "Libra";
                    }
                    break;
                case 11:
                    if (dia <= 22) {
                        signoZodiaco = "Escorpio";
                    } else {
                        signoZodiaco = "Sagitario";
                    }

                    break;

                case 2:
                    if (dia <= 19) {
                        signoZodiaco = "Acuario";
                    } else {
                        signoZodiaco = "Piscis";
                    }
                    break;

            }

        }

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println("");
        System.out.println("RESULTADO");
        System.out.println("---------");
        if (!valida) {          //Si la fecha es incorrecta (valida = false)  imprime Fecha incorrecta 
            System.out.println("Fecha Incorrecta");
        } else {                //si es válida imprime el mensaje con el signo del zodiaco 
            System.out.printf("El signo correspondiente al %d/%02d es: %s %n", dia, mes, signoZodiaco);
        }

    }

}
