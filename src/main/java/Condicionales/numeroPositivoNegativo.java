/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Rib
 */
    //Programa que indica si es positivo o negativo
public class numeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int num1 = input.nextInt();
        if(num1 != 0){
            if(num1>0){
                System.out.printf("El numero %d es positivo..", num1);
            }else{
                System.out.printf("El numero %d es negativo...",num1);
            }
        }else
            System.out.printf("El numero %d es neutro..", num1);
    }   
}
