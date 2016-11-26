/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_12_checknnn {

    public Ex_12_checknnn() {
     int i=0;
        while(i<200)
        {
            if(i*i*i>12000){
                int j=i-1;
                System.out.println(""+j+"  is grater then 12000");
               break;}
            
            i++;
        }
    }
    
    
}
