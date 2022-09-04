
package Condicionales;
import java.util.Scanner;
/**
 *
 * @author Rib
 */
public class validadcionFechas 
{
    //Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
    //Con meses de 28, 30 y 31 días sin años bisiestos
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el dia: ");
        int dias = input.nextInt();
        
        System.out.print("Ingrese el mes: ");
        int mes = input.nextInt();
        
        System.out.print("Ingrese el año: ");
        int anio = input.nextInt();
        
        if(anio>1000 && anio<=2050) //Se dejó un tope el año para restringir un rango específico
        {
            if(mes >= 1 && mes <= 12) //si el mes esta el rango de 1 a 12
            {
                if(mes == 2) // si el mes es febrero
                {
                    if(dias>=1 && dias<=28) // si los dias de febrero estan entre 1 y 28
                    {
                        System.out.println("Fecha ingresada de febrero es valida: "+dias+"/"+mes+"/"+anio ); // dia/mes/año
                    } else{
                        System.err.printf("dia: %d, no es valido para febrero ", dias);     
                    }                    
                }//fin if febero
                else{ // else febrero = 2
                        if(dias>=1 && dias<=31) //si los dias son entre 1 a 31 que no sea febrero
                        {
                          System.out.println("Fecha ingresada valida: "+dias+"/"+mes+"/"+anio ); // dia/mes/año
                        }else{ //si el dia es mayor a 31
                            System.err.printf("dia: %d, no es valido ", dias);     
                        }    
                    }//fin if else de febrero
            } //fin if meses
            else{ //else mes
                System.out.printf("El mes: %d,  no es valido", mes);
                }
        }//fin if año 
        else{ //else año
                if(dias == 0 && mes == 0 && anio == 0)
                {
                    System.err.println("dia, mes, año, no pueden ser 0");
                } 
                else
                {
                    System.err.println("Año no valido");
                }
            }
    }//fin metodo main
}//fin clase
