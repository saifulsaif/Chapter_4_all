/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_22_interest {

    public Ex_22_interest() {
        int numberOfYears=1;
       
        double principal=0;
        double balance=10000;
        double monthlyInterestRate=7;
        double monthlyPayment=865.26;
      for (int i = 1; i <= numberOfYears * 12; i++) {
      double interest = ((monthlyInterestRate * balance)/12)/100;
      principal = monthlyPayment - interest;
      balance = balance - principal;
      System.out.println(i + "\t\t" + interest
+     "\t\t" + principal + "\t\t" + balance);
}
        
        
    }
    
    
}
