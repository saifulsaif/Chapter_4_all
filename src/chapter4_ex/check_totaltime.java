/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class check_totaltime {

    public check_totaltime() {
long startTime = System.currentTimeMillis();

long endTime   = System.currentTimeMillis();
    
long totalTime = endTime - startTime;
 System.out.println("The time is: "+totalTime );
        
    }

   
    
    
}
