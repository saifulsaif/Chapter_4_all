/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

import java.util.Scanner;
import java.util.jar.Attributes;

/**
 *
 * @author DIU
 */
public class Ex_8_score {

    public Ex_8_score() {
        
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter 1st student info:");
        String name="";
        int score=0;
      
            System.out.println("Enter student name:");
            name = cr.next();
            System.out.println("Enter student score:");
            score =cr.nextInt();
            System.out.println("Enter 2nd student info ");
            System.out.println("Enter student name:");
           String name2 = cr.next();
            System.out.println("Enter student score:");
          int  score2 =cr.nextInt();
          System.out.println("The highest score and name");
          if(score>score2)
              System.out.println(""+name+"  "+score);
          else
             System.out.println(""+name2+"  "+score2); 
    }
    
    
}
