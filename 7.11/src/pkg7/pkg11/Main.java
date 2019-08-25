/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg11;

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
        
        //Create an array.
        double[] array = new double[10];
        
        //Tell the user the point of this program.
        out.println("This program is made to calculate the standard deviation "
                + "of 10 numbers.");
        
        //Ask the user to input the numbers.
        out.print("Please input 10 numbers : ");
        for (int index=0; index<array.length; index++){
            array[index] = input.nextDouble();
        }
        //Use a method to print the result.
        double result = deviation(array, mean(array));
        
        printDeviation(result);
        
    }
    //Create a void method to print out the result.
    public static void printDeviation (double deviation){
        
        out.printf("The standard deviation is %.5f", deviation);
    }
    //Create a method to calculate the mean.
    public static double mean (double[] array){
        
        //Create the variable.
        double sum = 0;
        final double MAX_NUMBERS = 10;
        
        //Find the mean.
        for (int index=0; index<array.length; index++){
            sum += array[index];
        }
        return sum / MAX_NUMBERS;
    }
    //Create a method to calculate the deviation.
    public static double deviation (double[] array, double mean){
        
        //Create the vairable.
        double sum = 0; 
        double division = 0;
        final double MAX_NUMBERS = 10;
        
        //Find the sum of the deviation.
        for (int index=0; index<array.length; index++){
            sum += Math.pow((array[index]) - mean, 2);
        }
        //Calculate the deviation.
        division = sum / (MAX_NUMBERS - 1);
        
        return Math.sqrt(division);
    }
    
}
