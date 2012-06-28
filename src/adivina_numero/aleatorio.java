/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina_numero;
import java.util.Random;

/**
 *
 * @author Memoeslink
 */
public class aleatorio {
    private int numero;

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public boolean ProbarValor(int n)
    {
        boolean gano = false;
        if(n == this.numero)
        {
            System.out.println("\n ¡Felicidades, le atinaste!");
            gano = true;
        }
        else
        {
            if(n<this.numero)
            {
                System.out.println("\n El número es mayor.");
            }
            else
            {
                System.out.println("\n El número es menor.");
            }
        }
        return gano;
    }
    
    public void GenerarAleatorio()
    {
        Random rnd = new Random();
        this.numero = rnd.nextInt(101);
    }
    
    public aleatorio()
    {
        this.numero = 0;
    }
}
