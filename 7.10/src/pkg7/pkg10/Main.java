/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg10;

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
        
        //Tell the user the point of this program.
        out.println("This program is made find the index of the smallest number in "
                + "an array.\n");
        
        //Ask the user to input the numbers in the array.
        out.print("Please input 10 numbers : ");
        for (int index=0; index<array.length; index++){
            array[index] = input.nextDouble();
        }
        //Call a method to print out the result.
        printIndexOfSmallestElement(indexOfSmallestElement(array));
    }
    //Create a void method to print out the result.
    public static void printIndexOfSmallestElement (double smallestIndex){
        
        out.printf("The smallest index in the array is %.0f\n", smallestIndex);
    }
    //Create a method to find the index of the smallest element.
    public static int indexOfSmallestElement (double[] array){
        
        //Create the variables.
        int smallestIndex = 0;
        double smallestNumber = array[1];
        
        //Create a loop to find the smallest element in the array.
        for (int index=0; index<array.length; index++){
            if (smallestNumber > array[index]){
                smallestIndex = index;
                smallestNumber = array[index];
            }
        }
        return smallestIndex;
    }
    
}
