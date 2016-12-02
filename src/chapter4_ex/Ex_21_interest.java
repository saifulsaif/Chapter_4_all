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
public class Ex_21_interest {

    public Ex_21_interest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yearly interest rate :");
        double annualInterstRate = input.nextDouble();
        double monthlyInterestRate = annualInterstRate/12;
        System.out.println("Enter number of year as a integer:");
        int numberOfYear=input.nextInt();
        System.out.println("Enter loan amount:");
        int loanAmount=input.nextInt();
        double monthlyPayment = loanAmount*monthlyInterestRate/
         (1-1/Math.pow(1+monthlyInterestRate,numberOfYear*12));
         double totalPayment = monthlyPayment*numberOfYear*12;
         System.out.println(""+monthlyPayment);
         System.out.println(""+totalPayment);
         System.out.println("The monthly payment is"+(int)(monthlyPayment*100)/100.0);
        System.out.println("Total payment"+(int)(totalPayment*100)/100.0);
    }
    
    
}
