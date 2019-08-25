/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg26;

/**
 *
 * @author Utilisateur
 */
import static java.lang.System.out;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create variables.
        final int NUMBERS_PER_LINE = 10;
        int numberToCheck = 2;
        int count = 1;
        
        //Tell the user the user of this program.
        out.println("This program is made to find numbers that are palindromic"
                + " and print them 10 per lines.\n");
        
        //Create the loop to test the number.
        while (count<100){
            if (testPalindrome(numberToCheck) && testPrime(numberToCheck)){
                count++;
                out.print(numberToCheck+" ");
                
                //Check if changing line is needed.
                if (count % NUMBERS_PER_LINE == 0){
                    out.println(numberToCheck);
                }
            }
            //Increment the number to be check and the count.
            numberToCheck++;
        } 
    }
    //Create a method to test if the the number is a palindrome.
    public static boolean testPalindrome (int numberToCheck){
        
        //Make everything a string to be able to reverse the number.
        String reverse = "";
        String stringNumber = numberToCheck + "";
        
        //Make a loop to reverse the string. You need to make the length -1.
        for (int i=stringNumber.length()-1;i>=0;i--){
            reverse += stringNumber.charAt(i);     
        }
        //Create an integer out of the boolean.
        int intReverse = Integer.parseInt(reverse);
        
        //Return the value.
        if (numberToCheck == intReverse){
            return true;
        }
        else
            return false;
    }
    //Create a method to test if the number is a prime number.
    public static boolean testPrime (int numberToCheck){
        
        //Create a true variable.
        boolean isPrime = true;
        
        //Create a loop for the divisor.
        for (int divisor=2; divisor<=numberToCheck/2; divisor++){
            //Create an if statement to to discard number that are not prime.
            if (numberToCheck % divisor == 0){
                isPrime = false;
                break;
            }
        }
        //Create a return statement.
        if (isPrime){
            return true;
        }
        else 
            return false;
    }
    
}
