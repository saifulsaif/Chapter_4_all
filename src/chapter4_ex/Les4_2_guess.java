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
public class Les4_2_guess {

    public Les4_2_guess() {
        int number=(int)(Math.random()*101);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a magic number between o and 100");
        int guess=-1;
        while(guess!=number)
        {
            System.out.println("Enter your guess number");
            guess=s.nextInt();
            if(guess==number)
            {
                System.out.println("The number is"+guess);
            }
            else if (guess>number)
            {
                System.out.println("Your guess is too high");
            }
            else
                System.out.println("Your guess is too low");
        }
        
    }
    
    
}
