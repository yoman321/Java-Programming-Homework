/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg13;

/**
 *
 * @author luoph
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        (Find the largest n such that n^3 < 12,000) 
        Use a while loop to find the largest
        integer n such that n3 is less than 12,000.
        */
        
        //Create the variables.
        int n = 0;
        
        //Create the loop that shall be used.
        while (Math.pow(n,3)<12000){
            
            n++;
        }
        /*
        Substract 1 from the value of n, since we are seaching to the largest
        value that is below 12000.
        */
        
        n--;
        
        //Print the result
        System.out.println("The largest value of n^3 under 12000 is "+n);
        
    }
    
}
