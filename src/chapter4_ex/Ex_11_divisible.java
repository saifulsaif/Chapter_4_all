/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_11_divisible {

    public Ex_11_divisible() {
    
    
        int counter=0;
        int j;
       for( j=100;j<200;j++)
        {
            if(j%6==0 && j%5==0)
                continue;
            if(j%6==0 || j%5==0)
            {
                System.out.print( ","+j);
                 
            counter=counter+1;
            if(counter==10)
            {
                System.out.println();
                counter=0;
            }
            }
          
        }
    }
}
