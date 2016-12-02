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
public class Ex_8_student {

    public Ex_8_student() {
        String nameOfStudent="";
        System.out.println("Enter your  3 friends name:");
        Scanner input = new Scanner(System.in);
        for(int i=0;i<3;i++){
         nameOfStudent = input.next();
        }
        System.out.println("Your friends name is "+nameOfStudent );
        



    }
    
    
}
