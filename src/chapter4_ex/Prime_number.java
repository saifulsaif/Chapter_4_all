/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Prime_number {

    public Prime_number() {
    
         for(int i=1;i<=20;i++)
         {
           if(prime(i)) { 
                 System.out.println(i);
           }
         }
    }
    public boolean prime(int i)
    {
        for(int j=2;j<=i/2;j++)
        {
            if(i%j==0)
                return false;
        }
        return true;
    }
    
    
}
