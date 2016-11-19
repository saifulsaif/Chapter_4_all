package chapter4_ex;



import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIU
 */
public class les4_8 {

    public les4_8() {
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter first int number:");
        int n1=cr.nextInt();
        System.out.println("Enter second int number:");
        int n2=cr.nextInt();
        int gcd=1;
        int k=2;
        while (k<=n1 && k<=n2)
        {
            if(n1%k==0 && n2%k==0)
                gcd=k;
            k++;
        }
        System.out.println("The greatest common divisor for "+n1+" and "+n2+" is "+gcd);
    }
    
    
}
