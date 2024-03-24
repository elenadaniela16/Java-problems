/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela
 */
/* Sa se calculeze valoatrea constanteo PI pe baza formulei
 * pi/4=1-1/3+/1/5-1/7+1/9-..
 * se vor lua N=3000 de termeni
 */
public class NewClass {
public static void main(String args[])
{
    final int N=3000; // nr de termeni ce se aduna
    double pi=0;
    for (int i=0;i<N;i++)
        if(i%2==0) pi=pi+4/(2*i+1);
        else pi=pi-4/(2*i+1);
    System.out.println("PI calculat ca suma de " + N + " termeni este:  " + pi);
}
}
