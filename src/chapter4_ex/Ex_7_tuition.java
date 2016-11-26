/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_7_tuition {

    public Ex_7_tuition() {
        int tuition_fee = 10000;
         int main_fee=tuition_fee+(tuition_fee*5)/100;
         int total_fee=0;
        for(int i = 1; i<=10;i++)
        {
           
             total_fee= main_fee+(main_fee*5)/100;
            total_fee=total_fee+(total_fee*5)/100;
        }
        
        System.out.println("After 10 year tuition fee is ="+total_fee);
    }
    
    
}
