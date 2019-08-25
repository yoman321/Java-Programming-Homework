/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg14;

/**
 *
 * @author luoph
 */
import java.util.Scanner;
import static java.lang.System.out;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Import the Scanner;
        Scanner input = new Scanner(System.in);
        
        //Create the array.
        int[] array = new int[5];
        
        //Tell the user the point of this program.
        out.println("This program is made find the gcd of 5 numbers.");
        
        //Ask the user for the inputs.
        out.print("Please inputs 5 numbers : ");
        for (int index=0; index<array.length; index++){
            array[index] = input.nextInt();
        }
        //Call the void method to print out the result.
        printGcd(gcd(array));
    }
    public static void printGcd (int gcd){
        
        out.println("The gcd is "+gcd);
        
    }
    //Create a method to find the gcd.
    public static int gcd (int... numbers){
        
        //Create the variables.
        boolean isDivisor;
        int gcd = 1;
        
        //Create a loop to find the gcd.    
        for (int divisor=1; divisor<=min(numbers); divisor++){
            isDivisor = true;
            for (int index : numbers){
                if (index % divisor != 0){
                isDivisor = false;
                }
            }
            if (isDivisor){
                gcd = divisor;
            }
        }
        
        return gcd;
    }
    //Create a method to find the minimum number of the array.
    public static int min (int... numbers){
        
        //Create the min variable.
        int min = numbers[1];
        
        //Create the loop to find the minimum of the array.
        for (int index : numbers){
            if (index < min){
                min = index;
            }
        }
        return min;
    }
    
}
