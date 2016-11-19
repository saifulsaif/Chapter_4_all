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
public class les4_4_sum {

    public les4_4_sum() {
        Scanner cr = new Scanner(System.in);
        System.out.println("Eneter a intger number.the program is number ='0'");
        int number=cr.nextInt();
        int sum=0;
        while(number!=0)
        {
            sum+=number;
             System.out.println("Eneter a intger number.the program is number ='0'");
            number=cr.nextInt();
            
        }
        System.out.println("The sum is the number is "+sum);
        
        
    }
    
}
