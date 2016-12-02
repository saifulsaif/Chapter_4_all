/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_17_pattern {

    public Ex_17_pattern() {
   
        
        System.out.println("Pattern1");
    
        for(int i = 1;i<=5;i++)
        {
               if(i==1)
                    System.out.print("             ");
               else if(i==2)
                    System.out.print("          ");
               else if(i==3)
                    System.out.print("        ");
               else if(i==4)
                    System.out.print("      ");
               else if(i==5)
                    System.out.print("   ");
               else if(i==6)
                    System.out.print("  ");
                
            for(int j=1;j<=i*2;j++)
            { 
           
               
                
                System.out.print("  "+j);
               
                
            }
             
            System.out.println();
        
        }
        
         System.out.println("Pattern2...........");
         
         
         for(int p = 7;p>=1;p--)
        {
            for(int q=1;q<=p;q++)
            {
                System.out.print(q);
                
            }
             
            System.out.println();
        
        }
        
    }
    
    
}
