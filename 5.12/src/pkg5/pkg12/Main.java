/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg12;

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
        (Find the smallest n such that n^2 > 12,000) 
        Use a while loop to find the smallest
        integer n such that n2 is greater than 12,000.
        */
    
        //Creat the variables.
        double n = 0;
    
        //Create the loop.
        while (Math.pow(n,2)<12000){
          
            n++;     
        }
        System.out.println("The smallest value of n^2 which is bigger than"
                + " 12000 is "+n);
    }
}
