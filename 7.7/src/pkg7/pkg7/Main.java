/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg7;

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
        
        //Import the scanner;
        Scanner input = new Scanner(System.in);
        
        //Create an array.
        int[] array = new int[10];
        
        //Tell the purpose of this program.
        out.print("This program is made to to generate 100 random numbers between"
                + " 0 and 9 and count the number of times that specific number has been generated.\n");
        
        //Call a method to print the array.
        printOccurenceArray(countOccurence(array));
        
    }
    //Create a method to print out the occurence.
    public static void printOccurenceArray (int[] countOccurence){
        
        //Print out the occurence array.
        for (int index=0; index<countOccurence.length; index++){
            out.println("The occurence of '"+index+"' is "+countOccurence[index]);
        }
    }
    //Create a method to find the count of each numbers.
    public static int[] countOccurence (int[] array){
        
        //Create an array.
        int[] countNumber = new int[10];
        
        //Create the variables.
        final int MAX_NUMBER = 100;
        
        //Create a loop to randomly generate numbers.
        for (int index=0; index<MAX_NUMBER; index++){
            int number = (int)(Math.random()*10);
            countNumber[number]++;
        }
        return countNumber;
    }
        
    
}
