/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_12_check {

    public Ex_12_check() {
        int i=0;
        while(i<200)
        {
            if(i*i>12000){
                System.out.println(""+i+"  is grater then 12000");
               break;}
            
            i++;
        }
    
    }
    
    
}
