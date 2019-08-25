/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg8;

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
    Scanner input = new Scanner(System.in);
    
    //Tell the user what you are going to with this program.
    System.out.println("This program is made to compute an ASCII code.");
    
    //Ask for the user to input the code.
    System.out.println("Please enter a code between 0 and 127 : ");
    int num = input.nextInt();
    
    //If the number is not right, tell the user to re-enter that value.
    if (num < 0 || num > 127){
        
        do{
            System.out.println("The value you have entered is not valid. Please re-enter the value another time : ");
            num = input.nextInt();
        }
        while (num < 0 || num > 127);
    }
    char charNumber = (char) num;
    
    //Give the answer to the user.
    System.out.println("The ASCII code related to the value you have entered is "+charNumber);
    
    }
    
}
