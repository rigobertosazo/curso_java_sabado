
package com.mycompany.curso_java_sabado;

import java.util.Scanner;

/**
 *
 * @author Rib
 */
public class ingresoNombre 
{
    public static void main(String[] args) 
    {    
            Scanner s = new Scanner(System.in);
            System.out.println("** 2. Programa que lee un nombre y muestre en pantalla: Buenos dias nombre_introducido **\n");
            System.out.println("Ingrese el nombre: ");
            String nombre = s.nextLine(); //o bien se puede usar String nombre = s.next();
            System.out.println("Buenos días "+nombre);
    }
}
