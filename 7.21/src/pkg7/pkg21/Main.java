/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg21;

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
        int[] slots;
        
        //Create the variable.
        int count;
        int max;
        int random = 0;
        
        //Tell the user what the utility of this program.
        out.println("This program is made to determine in which slots balls"
                + " will fall int.");
        
        //Ask the user for the number of balls.
        out.print("Enter the number of balls to drop : ");
        int NUMBER_OF_BALLS = input.nextInt();
        
        //Ask the user for the number of slots.
        out.print("Enter the number of slots in the bean machine : ");
        int NUMBER_OF_SLOTS = input.nextInt();
        
        //Set the number of slots for the array.
        slots = new int[NUMBER_OF_SLOTS];
         
        //Create a loop to diplay the path.
        for (int indexB=0; indexB<NUMBER_OF_BALLS; indexB++){
            count = 0;
            for (int indexS=0; indexS<slots.length-1; indexS++){
                random = (int)(Math.random() * 2);
                
                //Print R when 0 and L when 1.
                if (random == 0){
                    out.print("R");
                }
                else 
                    out.print("L");
                
                //Increment count when Right.
                if (random == 0){
                    count++;
                }
            }
            slots[count]++;
            
            out.println();
        }
        //Call a method that will find the highest value in the slots array.
        max = highest(slots);
        
        //Create a loop to print the balls.
        for (int indexM=max; indexM>0; indexM--){
            System.out.println();
            for (int index = 0; index < slots.length; index++) {
		if (slots[index] >= indexM) {
                    System.out.print("0");
                    }
                    else
			System.out.print(" ");
                }
            }
        System.out.println();        
    }
    //Create a method that will find the highest integer in the array.
    public static int highest (int[] slots){
        
        //Set the max value.
        int max = slots[0];
        
        //Create a loop to find the highest value.
        for (int index=0; index<slots.length; index++){
            if (max<slots[index]){
                max = slots[index];
            }
        }
        return max;
    }
   
}
    

