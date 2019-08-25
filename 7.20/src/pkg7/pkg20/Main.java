/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg20;

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
        
        //Import the Scanner.
        Scanner input = new Scanner(System.in);
        
        //Create the array.
        double[] array = new double[10];
        
        //Tell the user what the program does.
        out.println("This program is made to find the biggest number and swap it"
                + " with the last index of the array.");
        
        //Ask the user to input the numbers.
        out.print("Please input 10 numbers : ");
        for (int index=0; index<array.length; index++){
            array[index] = input.nextInt();
        }
        //Call a void method to print the result.
        printSwapBiggest(findAndSwapBiggest(array));
    }
    //Create a void method to print the result.
    public static void printSwapBiggest (double[] array){
        
        out.print("The result is : ");
        
        for (int index=0; index<array.length; index++){
            out.printf("%4.0f", array[index]);
        }
}
    //Create a method to find the biggest number and swap it with the last.
    public static double[] findAndSwapBiggest (double[] array){
        
        //Create variables.
        double max = array[0];
        double temp = 0;
        //Create a loop to find biggest.
        for (int index=0; index<array.length; index++){
            if (array[index] > max){
                max = array[index];
            }
        }
        //Swap the biggest with the last.
        for (int index=0; index<array.length; index++){
            if (max == array[index]){
                temp = array[index];
                array[index] = array[9];
                array[9] = temp;
            }
        }
        return array;
    }
    
}
