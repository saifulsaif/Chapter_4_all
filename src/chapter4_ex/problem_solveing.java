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
public class problem_solveing {

    public problem_solveing() {
   
         
         long tStart=System.currentTimeMillis();
          int number_of_question=20;
          int correct_count=0;
          int wrong_count=0;
          double time =0;
         while(correct_count<=number_of_question ){
         if(wrong_count==2)
             break;
         //Level 1................................................
          int number0 = (int)(Math.random()*100);
          int number1 = (int)(Math.random()*20);
          int number2 = (int)(Math.random()*20);
          int number3 = (int)(Math.random()*20);
          int number4 = (int)(Math.random()*50);
          int number5 = (int)(Math.random()*170);
          int random = (int)(Math.random()*4);
          // Level 2......................................................
          if(correct_count>5&&correct_count<=10){
          System.out.println("Level 2 now!\n");
          int number1_level2 = (int)(Math.random()*50);
          int number2_level2 = (int)(Math.random()*50);
          int number3_level2_try = (int)(Math.random()*50);
          int number4_level2_try = (int)(Math.random()*100);
          int number5_level2_try = (int)(Math.random()*200);
          int temp_number1 = number1;
          int temp_number2=number2;
          int temp_number3_tru=number3;
          int temp_number4_try=number4;
          int temp_number5_try=number4;
          number1 = number1_level2;  
          number2 = number2_level2;
          number3=number3_level2_try;
          number4=number4_level2_try;
          number5=number5_level2_try;
          }
          // Level 3 ..................................................
           if(correct_count>10&&correct_count<=15){
          System.out.println("Level 3 now!\n");
          int number1_level3 = (int)(Math.random()*100);
          int number2_level3 = (int)(Math.random()*100);
          int number3_level3_try = (int)(Math.random()*100);
          int number4_level3_try = (int)(Math.random()*200);
          int number5_level3_try = (int)(Math.random()*300);
          int temp_number1 = number1;
          int temp_number2=number2;
          int temp_number3_tru=number3;
          int temp_number4_try=number4;
          int temp_number5_try=number4;
          number1 = number1_level3;  
          number2 = number2_level3;
          number3=number3_level3_try;
          number4=number4_level3_try;
          number5=number5_level3_try;
          }
             // Level 4 ..................................................
           if(correct_count>15&&correct_count<=20){
          System.out.println(" Level 4 now!\n");
          int number1_level4 = (int)(Math.random()*150);
          int number2_level4 = (int)(Math.random()*150);
          int number3_level4_try = (int)(Math.random()*150);
          int number4_level4_try = (int)(Math.random()*300);
          int number5_level4_try = (int)(Math.random()*200);
          int temp_number1 = number1;
          int temp_number2=number2;
          int temp_number3_tru=number3;
          int temp_number4_try=number4;
          int temp_number5_try=number4;
          number1 = number1_level4;  
          number2 = number2_level4;
          number3=number3_level4_try;
          number4=number4_level4_try;
          number5=number5_level4_try;
          }
            // Level 5 ..................................................
           if(correct_count>20&&correct_count<=25){
          System.out.println(" Level 5 now!\n");
          int number1_level5 = (int)(Math.random()*200);
          int number2_level5 = (int)(Math.random()*200);
          int number3_level5_try = (int)(Math.random()*200);
          int number4_level5_try = (int)(Math.random()*300);
          int number5_level5_try = (int)(Math.random()*400);
          int temp_number1 = number1;
          int temp_number2=number2;
          int temp_number3_tru=number3;
          int temp_number4_try=number4;
          int temp_number5_try=number4;
          number1 = number1_level5;  
          number2 = number2_level5;
          number3=number3_level5_try;
          number4=number4_level5_try;
          number5=number5_level5_try;
          }
            // Level 6 ..................................................
           if(correct_count>25&&correct_count<=30){
          System.out.println(" Level 6 now!\n");
          int number1_level6 = (int)(Math.random()*300);
          int number2_level6 = (int)(Math.random()*300);
          int number3_level6_try = (int)(Math.random()*300);
          int number4_level6_try = (int)(Math.random()*400);
          int number5_level6_try = (int)(Math.random()*600);
          int temp_number1 = number1;
          int temp_number2=number2;
          int temp_number3_tru=number3;
          int temp_number4_try=number4;
          int temp_number5_try=number4;
          number1 = number1_level6;  
          number2 = number2_level6;
          number3=number3_level6_try;
          number4=number4_level6_try;
          number5=number5_level6_try;
          }
          
          
          if(number1<number2)
          {
              int temp = number1;
                number1=number2;
                number2=temp;
          }
          int rem= number0%5;
          
          // Start Additon......
          if(rem==1)
          {
              
              System.out.println("What is the addition value?"+number1+"+"+number2);
              System.out.println("Choose The right answare:");
              if(random==0)
              System.out.println(""+number3+"\t"+number4+"\n"+number5+"\t"+(number1+number2));
              else if(random==1)
                System.out.println(""+number3+"\t"+(number1+number2)+"\n"+number5+"\t"+number4); 
              else if(random==2)
                  System.out.println(""+(number1+number2)+"\t"+number4+"\n"+number5+"\t"+number3);
              else if(random==3)
                  System.out.println(""+number3+"\t"+number4+"\n"+(number1+number2)+"\t"+number5);
              Scanner cr = new Scanner(System.in);
              int result= cr.nextInt();
              if(number1+number2==result)
              {
                  System.out.println("Your answer is correct!");
                  correct_count+=1;
              }
              else{
                  System.out.println("Your answer is wrong.\n"+number1+
                      "+"+number2+"shoud be"+(number1+number2));
                  wrong_count+=1;}
          }
          // End addition...
          
          //Start subtruction...
          else if(rem==2)
          {
              if(number1!=number2)  
              {   
              System.out.println("What is the subtraction value?"+number1+"-"+number2);
              if(random==0)
              System.out.println(""+number3+"\t"+number4+"\n"+number5+"\t"+(number1-number2));
              else if(random==1)
                System.out.println(""+number3+"\t"+(number1-number2)+"\n"+number5+"\t"+number4); 
              else if(random==2)
                  System.out.println(""+(number1-number2)+"\t"+number4+"\n"+number5+"\t"+number3);
              else if(random==3)
                  System.out.println(""+number3+"\t"+number4+"\n"+(number1-number2)+"\t"+number5);
              Scanner cr = new Scanner(System.in);
              int result= cr.nextInt();
              if(number1-number2==result)
              {
                  System.out.println("Your answer is correct!");
                  correct_count+=1;
              }
              else{
                  System.out.println("Your answer is wrong.\n"+number1+
                        "-"+number2+"shoud be"+(number1-number2));
              wrong_count+=1;}
              }
          }
          //End substruction................
          
          //Start multiplication.........
          else if(rem==3)
          {
              if(correct_count>3)
              {
                   if(number1<35 && number2<35){
                   
            System.out.println("What is the maltiple value?"+number1+"*"+number2);
             if(random==0)
              System.out.println(""+number3+"\t"+number4+"\n"+number5+"\t"+(number1*number2));
              else if(random==1)
                System.out.println(""+number3+"\t"+(number1*number2)+"\n"+number5+"\t"+number4); 
              else if(random==2)
                  System.out.println(""+(number1*number2)+"\t"+number4+"\n"+number5+"\t"+number3);
              else if(random==3)
                  System.out.println(""+number3+"\t"+number4+"\n"+(number1*number2)+"\t"+number5);
              Scanner cr = new Scanner(System.in);
              int result= cr.nextInt();
              if(number1*number2==result)
              {
                  System.out.println("Your answer is correct!");
                  correct_count+=1;
              }
              else{
                  System.out.println("Your answer is wrong.\n"+number1+
                        "*"+number2+"shoud be"+(number1*number2));
              wrong_count+=1;
              }
               }
              }
              else{
               if(number1<20 && number2<20){
                   
            System.out.println("What is the maltiple value?"+number1+"*"+number2);
             if(random==0)
              System.out.println(""+number3+"\t"+number4+"\n"+number5+"\t"+(number1*number2));
              else if(random==1)
                System.out.println(""+number3+"\t"+(number1*number2)+"\n"+number5+"\t"+number4); 
              else if(random==2)
                  System.out.println(""+(number1*number2)+"\t"+number4+"\n"+number5+"\t"+number3);
              else if(random==3)
                  System.out.println(""+number3+"\t"+number4+"\n"+(number1*number2)+"\t"+number5);
              Scanner cr = new Scanner(System.in);
              int result= cr.nextInt();
              if(number1*number2==result)
              {
                  System.out.println("Your answer is correct!");
                  correct_count+=1;
              }
              else{
                  System.out.println("Your answer is wrong.\n"+number1+
                        "*"+number2+"shoud be"+(number1*number2));
              wrong_count+=1;
              }
               }
              }
               
          }
          // End multiplication............
          
          // Start division ......
          else if(rem==4)
          {
              if(number1%number2==0){
              System.out.println("What is the div value?"+number1+"/"+number2);
             if(random==0)
              System.out.println(""+number3+"\t"+number4+"\n"+number5+"\t"+(number1/number2));
              else if(random==1)
                System.out.println(""+number3+"\t"+(number1/number2)+"\n"+number5+"\t"+number4); 
              else if(random==2)
                  System.out.println(""+(number1/number2)+"\t"+number4+"\n"+number5+"\t"+number3);
              else if(random==3)
                  System.out.println(""+number3+"\t"+number4+"\n"+(number1/number2)+"\t"+number5);
              Scanner cr = new Scanner(System.in);
              int result= cr.nextInt();
              if(number1/number2==result)
              {
                  System.out.println("Your answer is correct!");
                  correct_count+=1;
              }
              else{
                  System.out.println("Your answer is wrong.\n"+number1+
                        "/"+number2+"shoud be"+(number1/number2));
                   wrong_count+=1;}
          }}
          // End division...........
          
         long tEnd = System.currentTimeMillis();   
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
         time=elapsedSeconds/60;
        if(time>5)
        {
            System.out.println("SORRY YOUR TIME IS OVER!");
            
            break;
        }
         }
          
        System.out.println("YOUR CORRECT ANSWER "+correct_count);
        System.out.println("YOUR WRONG ANSWER "+wrong_count);
        System.out.println(" YOU SPEND  :"+time+" min");
        
   
          
    }
    
    
}
