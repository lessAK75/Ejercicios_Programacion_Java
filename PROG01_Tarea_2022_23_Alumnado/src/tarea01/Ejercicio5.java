/**
 * Ejercicio 5: venta de pienso para animales.
 * Una tienda se dedica a la venta de pienso para animales. 
 * A todos sus clientes les aplica un sistema de descuentos en función de la cantidad de sacos de pienso comprados.
 * Los descuentos se aplican de la siguiente forma:
 *   si compran más de 5 sacos se les aplica un 5.5% de descuento.
 *   si compran más de 8 sacos se les aplicará un 10.3% de descuento.
 * Antes de calcular el importe final, se deberá sumar el IVA, que corresponde a un 10%.
 * Realiza un programa en Java que permita al usuario introducir el número de sacos que desea comprar un cliente. 
 * El precio unitario de cada uno de los sacos de pienso es de 9,75€.
 * El programa mostrará por pantalla el número de sacos que comprará el cliente, el descuento que se aplicará, 
 * el importe total aplicando los descuentos pero no el IVA y el importe total de la compra tras aplicar los descuentos 
 * por cantidad que correspondan y el IVA indicados anteriormente. 
 * Por último, el sistema mostrará la cantidad final que deberá pagar el cliente la cual será la parte entera del importe
 * total calculado anteriormente (por ejemplo, si el importe total fuera 26,40€ la cantidad final que debería pagar 
 * el cliente sería 26€).
 * 
 * @author Javier Lesaca Medina
 */

package tarea01;

import java.util.Scanner;

public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes
        double iva = 0.10;              //variable fija que almacena el iva
        double precioSaco = 9.75;       //variable fija que indica el precio de cada unidad de sacos de pienso
        double descuentoCinco= 0.055;   //variable que almacena el descuento si compramos mas de 5 sacos y menos de 8
        double descuentoOcho= 0.103;    //variable que almacena el descuento por comprar más de 8 sacos
        double noDescuento = 0;         //variable que indica que no hay descuento por menos de 5 sacos

        // Variables de entrada
        int sacosComprados;             //variable para almacenar los sacos que compra el cliente
        
        // Variables de salida
        double precioDescuento;         //variable que nos indica el precio total con descuento aplicado
        double precioIva;               //variable que almacena el precio final aplicando el descuento y el iva
        double descuento;               //variable que indica el porcentaje de descuento aplicado


        // Variables auxiliares
        double precio;                  //variable que calcula el precio total de los sacos sin descuento y sin iva
        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 5: venta de pienso para animales. ");
        System.out.println("------------------------------------------- ");
        System.out.println(" ");
        System.out.print("Introduce el número de sacos que quiere comprar el cliente: ");
        sacosComprados = teclado.nextInt();
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        //Definimos el tipo de descuento a aplicar mediante un operador ternario
        descuento = (sacosComprados <= 5) ? noDescuento : (sacosComprados < 8) ? descuentoCinco : descuentoOcho;
        
        
        //Definimos el precio de los sacos con descuento 
        precio = (sacosComprados * precioSaco);
        precioDescuento = precio - (precio * descuento);
        
        //Definimos el precio de los sacos con descuento y con IVA
        precioIva = precioDescuento + (precioDescuento * iva);
        
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
        System.out.println ();
	System.out.println ("RESULTADO");
	System.out.println ("---------");
        System.out.println("El cliente va a comprar " + sacosComprados + " sacos"); //se muestra el número de sacos
        System.out.printf("Se aplica un descuento del %.1f%% %n",(100*descuento));  //se muestra el porcentaje del descuento aplicado
        System.out.printf("El importe aplicando el descuento (sin IVA) es de: %.2f€ %n",precioDescuento); //se muestra el precio con descuento pero sin iva
        System.out.printf("El importe total (IVA incl.) asciende a: %.2f€ %n",precioIva); //se muestra el precio total con iva y descento aplicado y dos decimales
        System.out.printf("El importe final a pagar (IVA incl.) asciende a: %.0f€ %n", precioIva); //se muestra el precio final redondeado
        System.out.println ();
	System.out.println ("Fin del programa.");
    }

}
