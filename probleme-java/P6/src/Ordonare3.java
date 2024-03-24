/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela
 */
// se citesc de la tastatura trei numere intregi a,b,c. sa se ordoneze aceste numere
//crescatoare, a i a va fi minimul, iar in c va fi maximul.
//citriea de la tastatura se va face cu metoda showInputDialog() din clasa JOptionPane
import javax.swing.JOptionPane;
public class Ordonare3 {
public static void main(String args[])
{
    int a=Integer.parseInt(JOptionPane.showInputDialog("a="));
    int b=Integer.parseInt(JOptionPane.showInputDialog("b="));
    int c=Integer.parseInt(JOptionPane.showInputDialog("c="));
    System.out.println(a + " "+b+" "+c);
    if(a>b)
    {
        int aux=a;
        a=b;
        b=aux;
    }
    if(a>c)
    {
        int aux=a;
        a=c;
        c=aux;
    }
    if(b>c)
    {
        int aux=b;
        b=c;
        c=aux;
    }
    
    System.out.print(a + " " + b + " " + c);
}
}
