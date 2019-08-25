/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg5;

/**
 *
 * @author Utilisateur
 */
import static java.lang.System.out;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create the Scanner;
        Scanner input = new Scanner(System.in);
        
        //Create the array.
        int[] array = new int[10];
        
        //Tell the user the point of this program and ask for the inputs in the array.
        out.println("This program is made to numbers inputed and displys the numbers "
                + "that are distinct.\n");
        
        out.print("Input 10 numbers : ");
        for (int index=0; index<array.length; index++){
            array[index] = input.nextInt();
        }
        //Call a method to find the numbers of distinctNumbers.
        int countDistinct = countDistinct(distinctArray(array));
        
        //Call a void method to print out the answers.
        printDistinctArray(distinctArray(array), countDistinct); 
    }
    //Print the result with a method
    public static void printDistinctArray(int[] distinctArray, int countDistinct){
        
        //Print the count.
        out.println("There are "+countDistinct+" distincts numbers.");
        
        //Print the disintct numbers.
        out.print("The numbers that are distincts are : ");
        for (int index=0; index<distinctArray.length; index++){
            if (distinctArray[index] != 0 ){
                out.print(distinctArray[index]+" ");
            }
        }       
    }
    //Create a method to store the distinct numbers in the array.
    public static int[] distinctArray (int[] array){
        
        //Create the count variable.
        int countIndex = 0;
        
        //Create the array.
        int[] distinctArray = new int[10];
        
        //Create a loop to know if the number shall be store in the distinctArray.
        for (int index=0; index<distinctArray.length; index++){
            if (isDistinct(array[index], distinctArray)){
                distinctArray[countIndex] = array[index];
                countIndex++;
            }
        }
        return distinctArray;
    }
    //Create a method to find if a number is distinct or not.
    public static boolean isDistinct (int numberInArray, int[] distinctArray){
        
        //Create a loop to figure out if the number is disinct or not.
        for (int index=0; index<distinctArray.length; index++){
            if (numberInArray == distinctArray[index]){
                return false;
            }
        }
        return true;
    }
    //Call a method to find the numbers of distinct numbers.
    public static int countDistinct (int[] distinctArray){
        
        //Create the variable.
        int count = 0;
        
        //Count the numbers of distinct numbers.
        for (int index=0; index<distinctArray.length; index++){
            if (distinctArray[index] != 0){
                count++;
            }
        }
        return count;
    }
}
