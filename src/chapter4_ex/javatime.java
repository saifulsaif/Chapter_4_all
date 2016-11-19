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
public class javatime {
    Scanner S=new Scanner(System.in);

    public javatime() {
        long tStart=System.currentTimeMillis();
        int a=S.nextInt();
    int b=S.nextInt();
    int c=a+b;
        System.out.println(c);
        System.out.println("Sajib");
    long tEnd = System.currentTimeMillis();
    
long tDelta = tEnd - tStart;
double elapsedSeconds = tDelta / 1000.0;
double time=elapsedSeconds/60;
        System.out.println(time);
    
    }
    
    
}
