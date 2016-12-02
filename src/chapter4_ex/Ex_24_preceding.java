/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_24_preceding {

    public Ex_24_preceding() {
    
        double lefttoright=0;
        double righttoleft=0;
        double value=1.0;
        double value_2=97;
        for(int n=3;n<=99;n=n+2)
        {
            value=value+2;
            lefttoright=lefttoright+value/n;
            
        }
        System.out.println("Left to right is "+lefttoright);
        
        
        for(int m=99;m>=3;m--)
        {
            value_2=value_2-2;
            righttoleft=value_2/m+righttoleft;
            
        }
        System.out.println("Right to left is :"+righttoleft);
    }
    
        
    }
    
    

