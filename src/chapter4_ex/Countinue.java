/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Countinue {

    public Countinue() {
   
        for(int i =0   ; i<30 ; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
             
               
                       
                      
                }

    private boolean isPrime(int i) {
                    
        for(int j = 2 ; j<=i/2 ;j++){
            if(i%j==0)
               
                return false ;
        }
        return true ; 
    
    }
               
            
        
   
}
