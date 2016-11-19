/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class les4_7 {

    public les4_7() {
        float sum=0;
        for(float i=0.01f;i<=1.0f;i=i+0.01f)
        {
          sum+=i;
        }
        System.out.println("The sum is "+sum);
        
    }
    
    
}
