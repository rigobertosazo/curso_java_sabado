
package Condicionales;
import java.util.Scanner;

/**
 *
 * @author Rib
 */
    //Programa que solicita dos numeros y los ordena de mayor a menor
public class numeros_mayorMenor {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = input.nextInt();
        if (num1>num2) {
            System.out.printf("Numeros ordenados: %d , %d",num1, num2);
        }else{
            System.out.printf("Numeros ordenados: %d , %d",num2, num1);
        
        }      
    
    }
 }
