/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg13;

/**
 *
 * @author luoph
 */
import static java.lang.System.out;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create the array.
        int array[] = {1, 2, 3, 4};
        
        //Tell the user the point of this porgram.
        out.println("This program is made to generate a random number "
                + "except the ones passed into the arguments.");
        
        //Call a void method to print the result.
        printRandomNumber(excludeNumbers(array));
    }
    //Create a void method to print out the result.
    public static void printRandomNumber (int result){
         
        out.print("The random number is "+result);
    }
    //Create the method which exclude numbers.
    public static int excludeNumbers (int... array){
        
        //Create the variables.
        boolean excluded;
        int randomNumber;
        
        //Generate random numbers while excluding the numbers in the array.
         do {
            randomNumber = (int) (Math.random()*55);
            excluded = false;
            
            for (int index : array){
                if (index == randomNumber){
                    excluded = true;
                }
            }
         } while (excluded);
                
         return randomNumber;
        }
    }
    

        