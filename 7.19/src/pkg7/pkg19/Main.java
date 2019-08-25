/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg19;

/**
 *
 * @author luoph
 */
import java.util.Scanner;
import static java.lang.System.out;
import java.util.Arrays;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Import the Scanner.
        Scanner input = new Scanner(System.in);
        
        //Create the array.
        int[] array;
        
        //Tell the user what the program does.
        out.println("This program is made to determine if an array is sorted.");
        
        //Ask the user how many numbers will be inputed in the array.
        out.print("Please input how big you want the array to be : ");
        int ARRAY_SIZE = input.nextInt();
        
        //Set the array size.
        array = new int[ARRAY_SIZE];
        
        //Ask for the inputs from the user.
        out.print("Please input numbers in the array : ");
        for (int index=0; index<array.length; index++){
            array[index] = input.nextInt();
        }
        //Call a method to display whether the array is sorted or not.
        determineIsSorted(isSorted(array));

    }
    public static void determineIsSorted (boolean isSortedArray){
        
        if (isSortedArray){
            out.println("This array is sorted.");
        }
        else 
            out.println("This array is not sorted.");
}
    //Create a method to determine if an array is sorted or not.
    public static boolean isSorted(int[] list){
        
        //Create a loop.
        for (int index=0; index<list.length; index++){
            for (int num1=0, num2=1; num2<list.length; num1++, num2++){
                if (list[num1]>list[num2]){
                    return false;
                }
            }
        }
        return true;
    }
}

