/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg8;

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
        double[] array = new double[10];
        
        //Tell the user the use of this program.
        out.println("This program is made to return the average of an array.\n");
        
        //Ask the user to input the numbers for the array.
        out.print("Please input the numbers : ");
        for (int index=0; index<array.length; index++){
            array[index] = input.nextInt();
        }
        //Print out the result.
        out.println("The average is "+average(array));
        
    }
    //Create an int method to find the average.
    public static int average (int[] array){
        
        //Create the variable.
        final int MAX_NUMBER = 10;
        int sum = 0;
        
        //Add all the values in the array.
        for (int index=0; index<array.length; index++){
            sum += array[index];
        }
        return sum / MAX_NUMBER;
    }
    //Create a double method to find the average.
    public static double average (double[] array){
        
        //Create the variable.
        final double MAX_NUMBER = 10;
        double sum = 0;
        
        //Add all the values in the array.
        for (int index=0; index<array.length; index++){
            sum += array[index];
        }
        return sum / MAX_NUMBER;
    }
}
