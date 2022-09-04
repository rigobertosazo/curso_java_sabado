
package com.mycompany.curso_java_sabado;
import java.util.Scanner;
/**
 *
 * @author Rib
 */
public class numeroDobleTriple 
{
    public static void main(String[] args)
    {
        int numero;
        Scanner s = new Scanner(System.in);
        System.out.println("** 1. Programa que lee un numeros entero por teclado y muestra el doble y triple del numero ingresado en pantalla**\n");
        System.out.println("Ingrese el primer numero: ");
        numero=s.nextInt();
        System.out.println("El numero ingresado es: "+numero);
        System.out.println("El doble del numero ingresado es: "+numero*numero);
        System.out.println("El triple del numero ingresado es: "+numero*numero*numero);

        
    }
}
