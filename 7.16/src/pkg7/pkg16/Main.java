/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg16;

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
        long[] array = new long[100000];
        
        //Create the variable.
        long key = getRandom();
        long binaryTime;
        long linearTime;
        
        //Have the array have have random numbers inputed.
        for (int index=0; index<array.length; index++){
            array[index] = getRandom();
        
        }
        //Call a void method to print out the result.
        binaryTime = binarySearchTime(array, key);
        linearTime = linearSearchTime(array, key);
        
        printTimes(binaryTime, linearTime);
    } 
    //Create a void method to print the result.
    public static void printTimes (long binaryTime, long linearTime){
        
        out.println((binaryTime >= 0) ? "The search time for the binary search is of "+binaryTime+" millieseconds."
                : "The key was not found in the array.");
        
        out.println((linearTime >= 0) ? "The search time for the linear search is of "+linearTime+" millieseconds."
                : "The key was not found in the array.");
            
    }
    //Create a method to find search time in a linear search.
    public static long linearSearchTime (long[] array, long key){
        
        //Create the variables.
        long startTime;
        long endTime;
        long executionTime;
        
        //Create a loop to find the key.
        startTime = System.currentTimeMillis();
        for (int index=0; index<array.length; index++){
            if (array[index] == key){
                endTime = System.currentTimeMillis();
                
                executionTime = endTime - startTime;
                return executionTime;
            }
        }
         return -1; 
    }
    //Create a method to find the search time of a binary search.
    public static long binarySearchTime (long[] array, long key){
        
        //Ge the variables.
        long startTime;
        long endTime;
        
        //Call the array class to use the vinary search.
        java.util.Arrays.sort(array);
        startTime = System.currentTimeMillis();
        java.util.Arrays.binarySearch(array, key);
        endTime = System.currentTimeMillis();
        
        return endTime - startTime;
        
    }
    //Create a method to get random numbers.
    public static int getRandom (){
        
        return (int)(Math.random()*10000)+1;
    }
}
