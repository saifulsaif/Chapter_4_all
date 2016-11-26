/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_10_divisible {

    public Ex_10_divisible() {
        int counter=0;
        for(int i=100;i<=1000;i++)
        {
            if(i%6==0 && i%5==0)
            {
                System.out.print( ","+i);
                 
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
