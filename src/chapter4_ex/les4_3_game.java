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
public class les4_3_game {

    public les4_3_game() {
        final int number_of_qustion = 5;
        int correctCount =0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output="";
        Scanner input = new Scanner(System.in);
        while(count<number_of_qustion)
        {
            int number1 = (int)(Math.random()*100);
            int number2 = (int)(Math.random()*100);
            
            if(number1<number2)
            {
                int temp = number1;
                number1=number2;
                number2=temp;
                
            }
            System.out.println("what is "+number1+"-"+number2+"?");
            int answer = input.nextInt();
            if(number1-number2==answer)
            {
                System.out.println("your answer is correct!");
                correctCount++;
            }
            else{
                System.out.println("Your answer is wrong.\n"+number1+
                        "-"+number2+"shoud be"+(number1-number2));
           
            }
            
        count++;
        output+="\n"+number1+"-"+number2+"="+answer+((number1-number2==answer)?"correct":"worong");
        }
        long endTime = System.currentTimeMillis();
        long testTime= endTime-startTime;
        System.out.println("Correct count is"+correctCount+"\nTest time is"+testTime/1000+"seconds\n"+output);
        
    }
    }
   
