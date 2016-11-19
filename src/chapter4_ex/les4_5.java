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
public class les4_5 {

     les4_5() {
         int number;
          int sum=0;
          Scanner cr = new Scanner(System.in);
        do
        {
            
             System.out.println("Eneter a intger number.the program is number ='0'");
            number=cr.nextInt();
            sum+=number;  
        }while(number!=0);
        System.out.println("The sum is the number is "+sum);
        
    }
    
    
}
