/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg18;

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
        out.println("This program is made to use the bubble-sort algorithm.");
        
        //Ask for the inputs.
        out.print("Please input 10 double numbers : ");
        for (int index=0; index<array.length; index++){
            array[index] = input.nextDouble();
        }
        //Call a void method to print the result.
        printSortedArray(sortedArray(array));
    }
    public static void printSortedArray (double[] sortedArray){
        
        out.printf("The restults are : ");
        for (int index=0; index<sortedArray.length; index++){
            out.printf("%3.0f", sortedArray[index]);
        }
}
    //Create a method that use the buble-sort algorithm.
    public static double[] sortedArray (double[] array){
        
        //Create the variable.
        double temp = 0;
        
        //Create the nested loop to sort the array.
        for (int index=0; index<array.length; index++){
            for (int num1=0, num2=1; num2<array.length; num1++, num2++){
                if (array[num1]>array[num2]){
                    temp = array[num1];
                    array[num1] = array[num2];
                    array[num2] = temp;
                }
            }
        }
        return array;
    }
}
