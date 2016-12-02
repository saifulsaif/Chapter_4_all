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
public class Ex_31_CD {

    public Ex_31_CD() {
    
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your save amount:");
        int saveAmount=input.nextInt();
        System.out.println("Enter annual interest rate,as integer:");
        double annualInterestRate=input.nextDouble();
        System.out.println("Enter your soving month");
        int month=input.nextInt();
        double totalBalance=0;
        for(int i=1;i<=month;i++)
        {
           
           //totalBalance=(totalBalance+saveAmount)*(1+monthlyInterestRate);
           //System.out.println(""+i+" Month balance is "+totalBalance);
             
        }
    }
    
    
}
