/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_6_mile {

    public Ex_6_mile() {
        
         int mile;
        double kilometer = 1.609;
        System.out.println("mile   kilometer       mile       kilometer");
        for(mile = 1; mile <=10 ; mile+=2)
        {
            kilometer =20;
             
            System.out.println(""+mile+"       "+(mile*kilometer)+"             "+kilometer+"      "+(kilometer*0.6215));
            
           
        
        }
    }
    
    
}
