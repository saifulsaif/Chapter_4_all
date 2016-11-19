/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class Exe_3_pound {

    public Exe_3_pound() {
       Scanner cr = new Scanner(System.in);
        System.out.println("Enter your kilogram number: ");
        int kilogram=cr.nextInt();
        float total =(float) (kilogram*2.2);
        for(int i=0;i<5;i++)
        {
            System.out.println(""+kilogram+""+total);
        
        }
    }
    
    
    
}
