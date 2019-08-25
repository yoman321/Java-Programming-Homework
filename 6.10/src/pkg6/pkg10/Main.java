/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg10;

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
        
        //This program is made to find the number of primes numbers below 10000.
        
        //Create the variable.
        int count = 0;
        
        //Create the loop to allow the primes numbers to be tested.
        for (int number=2;number<=10000;number++){
            //Create an if statement to increase the count if return true.
            if (isPrime(number)==true){
                count++;
            }
            
        }
        //Print the result.
        System.out.println("There are "+count+" number of prime numbers "
                + " below 10000");
    }
    //Create the method.
    public static boolean isPrime (int number){
        for (int divisor=2; divisor<=number/2; divisor++){
            if (number%divisor==0){
                return false;
            }
           
        }
        return true;
    }
    
}
