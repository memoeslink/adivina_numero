/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina_numero;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Memoeslink
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int r = 0, noportunidades = 0, supuesto = 0;
        boolean victoria;
        Scanner scantool = new Scanner(System.in);
        aleatorio llamada = new aleatorio();
        do
        {
            victoria = false;
            System.out.println("\n ---ADIVINA UN NÚMERO---");
            System.out.println("\n [1] Jugar.");
            System.out.println(" [2] Salir.");
            do{
                System.out.println("\n Opción: ");
                try
                {
                    r = Integer.parseInt(scantool.nextLine());
                }
                catch(NumberFormatException error)
                {
                    System.out.println("\n Error: " + error.getMessage());
                    r = 0;
                }
            }while(r<1||r>2);
            
            if(r==1)
            {
                do{
                    System.out.println("\n Dame el número de oportunidades para adivinar: ");
                    try
                    {
                        noportunidades = Integer.parseInt(scantool.nextLine());
                    }
                    catch(NumberFormatException error)
                    {
                        System.out.println("\n Error: " + error.getMessage());
                        noportunidades = 0;
                    }
                }while(noportunidades<1);
                
                llamada.GenerarAleatorio();
                for(int c = 0; c < noportunidades; c++)
                {
                    do{
                        System.out.println("\n Dame un número [Entre 0 y 100]: ");
                        try
                        {
                            supuesto = Integer.parseInt(scantool.nextLine());
                        }
                        catch(NumberFormatException error)
                        {
                            System.out.println("\n Error: " + error.getMessage());
                            supuesto = -1;
                        }
                    }while(supuesto<0 || supuesto >100);
                    victoria = llamada.ProbarValor(supuesto);
                    System.in.read();
                    if(victoria == true)
                    {
                        c = noportunidades;
                    }
                }
            }
        }while(r!=2);
    }
}
