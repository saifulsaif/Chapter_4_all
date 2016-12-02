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
public class Ex_30_saving {

    public Ex_30_saving() {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your save amount:");
        int saveAmount=input.nextInt();
        System.out.println("Enter annual interest rate,as integer:");
        int annualInterestRate=input.nextInt();
        double monthlyInterestRate=0.00417;
        System.out.println("monthly interest rate"+monthlyInterestRate);
        System.out.println("Enter your soving month");
        int month=input.nextInt();
        double totalBalance=0;
        for(int i=1;i<=month;i++)
        {
           
            totalBalance=(totalBalance+saveAmount)*(1+monthlyInterestRate);
             System.out.println(""+i+" Month balance is "+totalBalance);
             
        }
        
        
    }
    
    
}
