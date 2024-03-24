/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela
 */
//se citesc doua numere a si b. sa se afiseze daca cele doua numere au acelasi
//numar total de divizori
import javax.swing. *;
public class Comparare {
public static void main(String args[])
{
    int a=Integer.parseInt(JOptionPane.showInputDialog("a="));
    int b=Integer.parseInt(JOptionPane.showInputDialog("b="));
    int na=2;
    int nb=2;
    for (int i=2;i<=a/2;i++)
        if(a%i==0) na++;
    for (int k=2;k<=b/2;k++)
         if(b%k==0) nb++;
    if(na!=nb)
        System.out.println("Numerele nu au acelasi numar total de divizori");
    else System.out.println("Numerele au acelasi numar total de divizori");
}

}
