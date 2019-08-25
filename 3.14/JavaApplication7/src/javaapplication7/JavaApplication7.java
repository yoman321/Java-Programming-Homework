/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author luoph
 */
import java.util.Scanner;
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int coinToss = (int) (Math.random() * 2);
        
        System.out.println("Please enter 0 for face and 1 for tail.");
        int coinGuess = input.nextInt();
        
        if (coinGuess >= 0 && coinGuess < 2){
            
            if (coinGuess == coinToss){
                
                if (coinToss == 1){
                    System.out.println("Congratulation! The coin landed on tail and you got it right");
                }
                else
                    System.out.println("Congratulation! the coin landed on head and you got it right.");
            }   
            else
                System.out.println("Sorry, your guess was wrong.");
        }
        else
            System.out.println("Your guess was invalid.");
    }
    
}
