/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class les4_6 {

    public les4_6() {
       
        
   System.out.println(" Multiplication Table");

 // Display the number title
 System.out.print("    ");
 
 for (int j = 1; j <= 9; j++)
            
 System.out.print("   " + j);

 System.out.println("\n———————————————————————————————————————");

 // Print table body
 
for(int i = 1;i<=9;i++){

 System.out.print(i + " | ");
 for(int j=1;j<=9;j++){
      
 // Display the product and align properly
 System.out.printf("%4d", i * j);
 }
System.out.println();
    }
    }
    
}
