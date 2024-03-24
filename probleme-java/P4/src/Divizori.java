/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela
 */
//sa se afiseze toti divizorii unui numar intreg dat ca parametru in linia de comanda
public class Divizori {
public static void main(String args[])
{
    int nr=Integer.parseInt(args[0]);
    for(int i=1; i<=nr;i++)
        if(nr%i==0) System.out.println(i);
}
}
