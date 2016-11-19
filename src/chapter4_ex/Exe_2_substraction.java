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
public class Exe_2_substraction {

    public Exe_2_substraction() {
        int correct_count=0;
        
        
       for(int i=0;i<=5;i++)
       {
           int number1 = (int)(Math.random()*16);
           int number2 = (int)(Math.random()*16);
            if(number1<number2)
            {
                int temp = number1;
                number1=number2;
                number2=temp;
                
            }
           System.out.println("What is "+number1+"-"+number2+"??");
           Scanner cr = new Scanner(System.in);
           int result=cr.nextInt();
           if(result==number1-number2)
           {
               System.out.println("Your and is correct!");
               correct_count++;
           }
           else
               System.out.println("Incorrect!");
               System.out.println("You should type"+number1+"-"+number2+"="+(number1-number2));
           
           
       }
        System.out.println("The correct number of answer is"+correct_count);
        
    }
    
    
}
