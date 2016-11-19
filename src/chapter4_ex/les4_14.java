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
public class les4_14 {

    public les4_14() {
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter a number for check");
        int number = cr.nextInt();
        if(number%2==0){
            System.out.println(""+number+"   is not a prime number");
        
        }
        else
        {
            
            for(int i=1;i<=number;i++)
            {
              if( number%i!=0 && number%number==0)
                System.out.println(""+number+" is  a prime number");
              else
                    System.out.println("not prime");
              break;
             
            }
            
            
        }
        
                
        
    }
    
    
}
