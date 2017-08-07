import java.util.Scanner;
import java.util.*;
/**
 * Write a description of class Numero_de_ceros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numero_de_ceros
{
   public static void main (String[] args)
    {
    Scanner teclado = new Scanner(System.in);
        int f = 1, n;
        int ceros = 0;
        System.out.print("Ingrese número: ");
        n = teclado.nextInt();
        for (int i = 1; i <= n; ++i) {
            f = f * i;
        }
        System.out.println("El factorial de " + n + " es " + f);

        String[] sNums = Integer.toString(f).split("");
        for (int i = sNums.length - 1; i >= 0; i--) {
            String num = sNums[i];
            if (num.equals("0")) {
                ceros++;
            } else {
                break;
            }
        }

        System.out.println("Cantidad de cero es " + ceros);
    }
}
