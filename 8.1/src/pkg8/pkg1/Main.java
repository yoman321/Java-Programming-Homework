/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.pkg1;

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
        
        //Import the Scanner;
        Scanner input = new Scanner(System.in);
        
        //Create the array.
        double[][] array = new double[3][4];
        
        //Create the variables.
        int count = 0;
        
        //Tell the user the point of this program.
        out.println("This program is made to calculate the sum of a 3-by-4"
                + " matrix row by row.");
        
        //Ask for the input from the user.
        out.print("Please input the values : ");
        for (int row=0; row<array.length; row++){
            for (int col=0; col<array[row].length; col++){
                array[row][col] = input.nextInt();
            }
        }
        //Create a loop to get the sum of collums and print it out.
        for (int col=0; col<array.length; col++){
            out.println("The sum of col "+col+" is "+sumColumn(array, col)); 
            }
        }
    
    //Create a method to sum the colums.
    public static double sumColumn(double[][] array, int col){
        
        //Create the variable.
        double sum = 0;
        
        //Create a loop to sum the columns.
        for (int row=0; row<array.length; row++){
            sum += array[row][col];
        }
        return sum;
    }    
}
