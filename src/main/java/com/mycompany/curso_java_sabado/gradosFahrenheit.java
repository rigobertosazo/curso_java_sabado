
package com.mycompany.curso_java_sabado;
import java.util.Scanner;

/**
 *
 * @author Rib
 */
public class gradosFahrenheit 
{
    public static void main(String[] args)
    {
        float numero;
        Scanner s = new Scanner(System.in);
        System.out.println("** 1. Programa que lee una cantidad de grados centígrados y la pasa a grados fahrenheit**\n");
        System.out.println("Ingrese la cantidad de grados centígrados: ");
        numero=s.nextFloat();
        float f= 32+(9*numero/5);
        System.out.println("La cantidad de grados Fahreinheit es: :" +f);    
    }
}
