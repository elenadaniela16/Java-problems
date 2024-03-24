/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela
 */
//sa se calculeze primul nr prim mai mare decat un numar dat ca parametru in linia de comnada
public class PrimulNrPrim {
    public static void main(String args[])
    {
        int nr=Integer.parseInt(args[0]);
        int nrCrt=nr+1;
        int ok=1;
        while(ok==1)
        { if(estePrim(nrCrt))
              break;
          else nrCrt++;
    }
        System.out.println("Primul numar prim mai mare este: " + nrCrt);
}
    private static boolean estePrim(int x)
    {
        boolean ok=true;
        for(int i=2;i<=Math.sqrt(x);i++)
            if(x%i==0)
            {
                ok=false;
                break;
            }
        return ok;
    }
}
