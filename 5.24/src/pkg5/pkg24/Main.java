/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg24;

/**
 *
 * @author Utilisateur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2, total, num3;
        
        
        num3=0;
        
        
        for (num1= 1; num1<=97; num1+=2){
           num2 = num1/(num1+2);
            
            num3 = num2+num3;
            
        }
          System.out.println(num3); 
    }
    
}
