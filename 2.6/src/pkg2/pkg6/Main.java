/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg6;

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
        int num1, num2, num3, num4,total;
        
        System.out.println("Please enter an integer between 0 and 1000");
        num1 = input.nextInt();
        
        num2 = num1 % 10;
        num3 = (num1 / 10) % 10;
        num4 = num1 / 100;
        
        total = num2+num3+num4;
        
        System.out.println("the total of these numbers are "+total);
    }
    
}
