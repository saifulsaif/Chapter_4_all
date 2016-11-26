package chapter4_ex;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class Bolean1 {

    /**
     * @param args the command line arguments
     */
    public Bolean1() {
        // TODO code application logic here
        final int NumberOfQuestion = 5;
        int correctcount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);

        while (count < NumberOfQuestion) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if (number1 < number2) {
                int temp = number2;
                number1 = number2;
                number2 = temp;
            }
            //Greater Then
            System.out.println("What is " + number1 + " > " + number2 + "?");
            int answer = input.nextInt();

            if (number1 > number2) {
                System.out.println("You are correct");
                correctcount++;
            } else {
                System.out.println("your answer is wrong\n" + number1 + ">" + number2 + "should be" + (number1 > number2));
            }
            count++;

            // output += "\n" + number1 + ">" + number2 + "=" + answer + ((number1 > number2 ) );
            // Greater Then And Equal
            System.out.println("What is " + number1 + " => " + number2 + "?");
            answer = input.nextInt();

            if (number1 >= number2) {
                System.out.println("You are correct");
                correctcount++;
            } else {
                System.out.println("your answer is wrong\n" + number1 + ">=" + number2 + "should be" + (number1 >= number2));
            }
            count++;

            //Less Then
            System.out.println("What is " + number1 + " > " + number2 + "?");
            answer = input.nextInt();

            if (number1 < number2) {
                System.out.println("You are correct");
                correctcount++;
            } else {
                System.out.println("your answer is wrong\n" + number1 + "<" + number2 + "should be" + (number1 < number2));
            }
            count++;

            //output += "\n" + number1 + "<" + number2 + "=" + answer + ((number1 < number2 ));
            //Less Then And Equal
            System.out.println("What is " + number1 + " =< " + number2 + "?");
            answer = input.nextInt();

            if (number1 <= number2) {
                System.out.println("You are correct");
                correctcount++;
            } else {
                System.out.println("your answer is wrong\n" + number1 + "<=" + number2 + "should be" + (number1 <= number2));
            }
            count++;

            //Equal Equal
            System.out.println("What is " + number1 + " == " + number2 + "?");
            answer = input.nextInt();

            if (number1 == number2) {
                System.out.println("You are correct");
                correctcount++;
            } else {
                System.out.println("your answer is wrong\n" + number1 + "==" + number2 + "should be" + (number1 == number2));
            }
            count++;

            //Not Equal
            System.out.println("What is " + number1 + " != " + number2 + "?");
            answer = input.nextInt();

            if (number1 != number2) {
                System.out.println("You are correct");
                correctcount++;
            } else {
                System.out.println("your answer is wrong\n" + number1 + "!=" + number2 + "should be" + (number1 != number2));
            }
            count++;


            }

        }
    }

