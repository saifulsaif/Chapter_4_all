/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_23_preceding {

    public Ex_23_preceding() {
    
        double lefttoright=0;
        double righttoleft=0;
        for(int n=1;n<=50000;n++)
        {
            lefttoright=lefttoright+1.0/n;
            
        }
        System.out.println("Left to right is "+lefttoright);
        for(int m=50000;m>=1;m--)
        {
            righttoleft=1.0/m+righttoleft;
            
        }
        System.out.println("Right to left is :"+righttoleft);
    }
    
    
}
