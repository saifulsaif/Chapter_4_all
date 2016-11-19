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
public class Check_time {

    public Check_time() {
        long totalMiliseconds=System.currentTimeMillis();
        long totalSecond=totalMiliseconds/1000;
        long currentSecond = (int)(totalSecond%60);
        long totalMinutes = totalSecond/60;
        long currentMinutes = totalMinutes%60;
        long totalHour = totalMinutes/60;
        long currentHour = totalHour%60;
        System.out.println("Current time is "+currentHour+":"+currentMinutes+":"+currentSecond+" GMT");
        System.out.println("Current second is:"+currentSecond);
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter a value for check:");
        
        
        
        
        long end_totalMiliseconds=System.currentTimeMillis();
        long end_totalSecond=totalMiliseconds/1000;
        long end_currentSecond = (int)(totalSecond%60);
        long end_totalMinutes = totalSecond/60;
        long end_currentMinutes = totalMinutes%60;
        long count=currentSecond-end_currentSecond;
        System.out.println("end second"+end_currentSecond);
        System.out.println("count second:"+count);
        
        
    }
    
    
}
