/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela
 */
//se citeste un nr natural a. sa se afiseze daca este patrat perfect sau nu
import javax.swing. *;
public class PatratPerfect {
public static void main(String args[])
{
    int a=Integer.parseInt(JOptionPane.showInputDialog("a="));
    double radical=Math.sqrt(a);
    if((int)radical*(int)radical==a)
        System.out.println("este");
    else System.out.println("nu este");
}
}
