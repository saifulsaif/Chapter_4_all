/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class Ex_gcd {

    public Ex_gcd() {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter to intger value:");
        int first_number=input.nextInt();
        int second_number=input.nextInt();
        int gcd=0;
        for(int i=1;i<=first_number;i++)
        {
            if(first_number%i==0 && second_number%i==0)
            {
                 gcd=i;
            }
        }
        System.out.println("The common greatest divisor is "+gcd);
    }
    
    
}
