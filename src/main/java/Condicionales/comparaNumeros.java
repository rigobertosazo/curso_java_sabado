
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Rib
 */
 
//programa que pide dos numeros y que nos diga si son iguales o no
public class comparaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Ingrese el primer numero entero: ");
            int num1 = input.nextInt();
            System.out.print("Ingrese el segundo numero entero: ");
            int num2 = input.nextInt();
            if (num1 == num2) {
                System.out.printf("Los numeros %d y %d son iguales\n", num1,num2);
            }else{
                System.out.printf("Los numeros %d y %d No son iguales\n", num1,num2);
            }
        }
}
