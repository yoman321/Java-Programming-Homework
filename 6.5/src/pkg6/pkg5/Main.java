/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg5;

/**
 *
 * @author Utilisateur
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Add the Scanner.
        Scanner input = new Scanner(System.in);
        
        //Tell the point of this program.
        System.out.println("This program is made to sort three numbers"
                + " in increasing numbers.\n");
        
        //Tell the user to input the numbers.
        System.out.print("Please input three numbers : ");
        //Input the variables.
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        
        //Use the void method for these variables.
        displaySortedNumbers (num1, num2, num3);
    }
    //Create the moethod for this program.
    public static void displaySortedNumbers (double num1, double num2, double num3){
        
        
        //Create the temp variable.
        double temp = 0;
        //Create an if statement to determine the order of those numbers.
        if (num3<num1 && num3<num2){
            temp = num3;
            num3 = num1;
            num1 = temp;
        }
        if (num2<num1 && num2<num3){
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        if (num2>num3){
            temp = num3;
            num3 = num2;
            num2 = temp;
        }
          
        //Print out the answer.
        System.out.println("The numbers in increasing orders are : "+num1+" "+num2+" "+num3);
    }
         

}
