
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Rib
 */
public class tresNumeros_mayorMenor {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero entero: ");
        int a = input.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int b = input.nextInt();
         System.out.print("Ingrese el tercer numero entero: ");
        int c = input.nextInt();
        
         if(a>b && b>c)
            System.out.printf("Ordenados: %d, %d, %d", a, b, c);
        else{
            if(a>c && c>b)
                System.out.printf("Ordenados: %d, %d, %d", a, c, b);
            else{
               if(b>a && a>c)
                   System.out.printf("Ordenados: %d, %d, %d", b, a, c);
               else{
                  if(b>c && c>a)
                      System.out.printf("Ordenados: %d, %d, %d", b, c, a);
                  else{
                      if(c>a && a>b)
                         System.out.printf("Ordenados: %d, %d, %d", c, a, b);
                      else{
                         if(c>b && b>a)
                            System.out.printf("Ordenados: %d, %d, %d", c, b , a);                                     
                          }
                      }
                   }
                }
            }
        }
    }     
