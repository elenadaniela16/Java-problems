/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela
 */
//sa se calculeze si afiseze cate numere naturale de 4 cifre impartitee la 67, 
//dau restul 23
public class P1 {
public static void main(String args[])
{
    int k=0;
    for(int i=1000;i<=9999;i++)
        if(i%67==23) k++;
    System.out.println("Sunt " + k + " de numere.");
}
}
