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
        double tuition_fee = 10000;
         
         int total_fee=0;
         double four_year=0;
         
         for(int i = 1; i<=10;i++)
        {
            
             tuition_fee =tuition_fee+(tuition_fee*0.05);
            System.out.println("After 10 year tuition fee is ="+tuition_fee);
            if(i<=4){
            four_year = four_year +tuition_fee;}
            
            
        }
         System.out.println("Tuition fee for four year:"+four_year);
        
        
    }
    
    
}
