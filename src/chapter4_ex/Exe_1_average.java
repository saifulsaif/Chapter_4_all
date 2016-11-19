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
public class Exe_1_average {

    public Exe_1_average() {
        Scanner cr = new Scanner(System.in);
        int sum=0;
        int count=0;
        System.out.println("Enter your number:");
        for(int i=0;i<=5;i++)
        {
           int number = cr.nextInt();
            if(number==0)
                break;
            
            if(number>0)
            {
            sum=sum+number;
            
            }
            else{
             sum=sum+number;
            
            }
            
            count++;
           
        }
        
        System.out.println("The sum of  number"+sum);
       
        double result=sum/count;
        System.out.println("The average is "+result);
    }
   
    
}
