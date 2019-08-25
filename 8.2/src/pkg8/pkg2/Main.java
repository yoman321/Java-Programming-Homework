/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.pkg2;

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
        double[][] array = new double[4][4];
        
        //Tell the user the point of this program.
        out.println("This program is made to find the sum of the major diagonal.");
        
        //Ask for the input from the user.
        out.print("Please input 4 numbers row line for 4 row : \n");
        for (int row=0; row<array.length; row++){
            for (int col=0; col<array[row].length; col++){
                array[row][col] = input.nextDouble();
            }
        }
        //Call a void method to print out the result.
        printSum(sumMajorDiagonal(array));
    }
    public static void printSum (double sum){
        
        out.println("The sum of the major diagonal is "+sum);
}
        //Create a method to find the sum of the major diagonal.
        public static double sumMajorDiagonal(double[][] m){
            
            //Create the variable.
            double sum = 0;
            
            //Create a loop to find the sum.
            for (int row=0, col=0; row<m.length; row++, col++){
                sum += m[row][col];
        }
            return sum;
    }
    
}
