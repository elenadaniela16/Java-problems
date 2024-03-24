/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela
 */
//se citesc n1 si n2 capetele unui interval inchis. sa se afiseze daca in intervalul
//[n1,n2], exista cel putin un numar prim
import javax.swing. *;
public class ExistaNumerePrime {
public static void main(String args[])
{
    int n1=Integer.parseInt(JOptionPane.showInputDialog("n1="));
    int n2=Integer.parseInt(JOptionPane.showInputDialog("n2="));
    boolean ok=false;
    if(n1>n2)
    {
        int aux=n1;
        n1=n2;
        n2=aux;
    }
    for(int i=n1;i<=n2;i++)
    {
        if(estePrim(i)==true)
        {
            ok=true;
            break;
        }
    if(ok) System.out.println("Exista numere prime");
    else System.out.println("Nu exista numere prime");
    }
}
private static boolean estePrim(int x)
{
    for(int i=2;i<=Math.sqrt(x);i++)
        if(x%i==0) {return false; }
            return true;
       
    
}
}
