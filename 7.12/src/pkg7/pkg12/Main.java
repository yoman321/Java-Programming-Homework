/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg12;

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
        int[] array = new int[10];
        
        //Tell the user the point of this porgram.
        out.println("This program is made to reverse an array.\n");
        
        //Ask the user to input the numbers.
        out.print("Please input 10 numbers : ");
        for (int index=0; index<array.length; index++){
            array[index] = input.nextInt();
        }
        //Call a void method to print th reverse array.
        printReverseArray(reverse(array)); 
    }
    //Create a void method to print out the reverse array.
    public static void printReverseArray (int[] reverse){
        
        for (int index : reverse){
            out.print(index+" ");
        }
        out.println();
    }
    //Create a method to reverse the array.
    public static int[] reverse (int[] array){
        
        //Create the reverse array.
        int[] reverse = new int[10];
        
        //Create a loop to reverse the array.
        for (int indexArray=0, indexReverse=reverse.length-1; indexArray<array.length; 
                indexArray++, indexReverse--){
            reverse[indexReverse] = array[indexArray];   
        }
        return reverse;
    }    
}
