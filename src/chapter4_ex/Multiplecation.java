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
public class Multiplecation {

    public Multiplecation() {
        
        System.out.println("Ener your multiplecation number:");
        Scanner input= new Scanner(System.in);
        int number=input.nextInt();
        for(int i=1;i<=10;i++)
        {
            int sum=i*number;
            System.out.println(""+i+"*" +number+ "="+sum);
        }
    }
    
    
}
