/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_4_mile {

    public Ex_4_mile() {
        
        int mile;
        double kilometer = 1.609;
        System.out.println("Mile   Kilomiters");
        for(mile = 1; mile<=10 ; mile++)
        {
            System.out.println(""+mile+"      "+(mile*kilometer));
            
            
        
        }
    }
    
    
}
