/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_ex;

/**
 *
 * @author DIU
 */
public class Ex_20_primeNumber {

    public Ex_20_primeNumber() {
    
        int counter=0;
          for(int i =2   ; i<1000 ; i++){
            if(isPrime(i)){
                if(counter==8)
                {
                    System.out.println();
                    counter=0;
                }
                System.out.print(" ,"+i);
                counter=counter+1;
                
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
