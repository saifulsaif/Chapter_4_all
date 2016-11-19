/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

import javax.swing.JOptionPane;

/**
 *
 * @author DIU
 */
public class les4_15_gui {

    public les4_15_gui() {
        int sum =0;
        int option = JOptionPane.YES_OPTION;
        while (option == JOptionPane.YES_OPTION)
        {
         String dataString = JOptionPane.showInputDialog("Enter a int value");
            
        int data = Integer.parseInt(dataString);
        sum+=data;
        option = JOptionPane.showConfirmDialog(null, "Continue?");
        }
        
        JOptionPane.showMessageDialog(null,"The sum is "+sum);
    }
}
    

