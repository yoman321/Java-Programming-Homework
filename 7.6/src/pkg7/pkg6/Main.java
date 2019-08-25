 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg6;

/**
 *
 * @author Utilisateur
 */
import static java.lang.System.out;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        //Import the Scanner;
        Scanner input = new Scanner(System.in); 
        
        //Create the array.
        int[] array = new int[50];
        
        //Tell the user the goal of this program.
        out.println("This program is made to find the first 50 prime numbers.");
        
        //Use a void method to print out the result.
        printPrime(findPrimes(array));
    }
    public static void printPrime (double[] primeArray){
        
        //Create the variable.
        int count = 1;
        
        //Create the loop to print out the numbers.
        for (int index=0; index<primeArray.length; index++){
            if (count % 10 == 0){
                out.println();
            }
            else 
                out.printf(" %.0f", primeArray[index]);
                count++;
        }
      
    }
    //Create a method to find the first 50 prime numbers.
    public static double[] findPrimes (int[] array){
        
        //Create the array.
        double[] primeNumbers = new double[50];
        
        //Create the variable.
        int number = 2;
        int count = 1;
        primeNumbers[0] = 2;
        
        //Create a loop to check each numbers.
        while (count<primeNumbers.length){
            
            //Add the number to the array if it is false.
            if (!isPrime(number, primeNumbers)){
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }
        return primeNumbers;
    }
    //Create a method to find out if a number is prime or not.
    public static boolean isPrime (double number, double[] primeNumbers){
        
        //Create a loop to check if a number is prime or not.
        for (int index=0; index<primeNumbers.length; index++){
            if (Math.sqrt(number)<=primeNumbers[index]){
                if (number % primeNumbers[index] == 0){
                    return true;
                }
            }
        }
        return false;
    }
    
}
