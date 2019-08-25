/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg41a;

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
        System.out.println("Please enter numbers knowing that 0 will stop the program ");
        int maxNum = input.nextInt();
        int count = 1;
        int number;
         number = input.nextInt();
        
        while (number > 0){
           number = input.nextInt();
            if (number > maxNum){
            maxNum = number;
            count = 1;
        }
            if (number == maxNum){
                count ++;
            }
          
    }
    System.out.println("The largest number is "+maxNum);
    System.out.println("The occurence of is "+count);
}
}
