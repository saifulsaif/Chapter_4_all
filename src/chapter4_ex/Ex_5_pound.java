/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_5_pound {

    public Ex_5_pound() {
         int kilogram;
        double pound_first = 2.2;
        System.out.println("kilogram   pound       pound       kilogram");
        for(kilogram = 1; kilogram <=10 ; kilogram+=2)
        {
            int pound=20;
             
            System.out.println(""+kilogram+"       "+(kilogram*pound_first)+"    "+pound+"      "+(pound*0.45));
            
             pound++;
        
        }
    }
    
    
}
