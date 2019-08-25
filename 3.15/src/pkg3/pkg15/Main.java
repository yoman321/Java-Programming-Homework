/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg15;

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
     
        int lotteryRandom = (int) (Math.random()*1000);
        
        System.out.println("Please enter a number between 0 and 999 including these numbers.");
        int lotteryGuess = input.nextInt();
        
       int lotteryRandom1 = lotteryRandom % 10;
       int lotteryRandom2 = (lotteryRandom / 10) % 10;
       int lotteryRandom3 = lotteryRandom / 100;
       
       int lotteryGuess1 = lotteryGuess % 10;
       int lotteryGuess2 = (lotteryGuess / 10) % 10;
       int lotteryGuess3 = lotteryGuess / 100;
       
        if (lotteryGuess >= 0  &&  lotteryGuess < 1000){
            
            if ((lotteryRandom1 == lotteryGuess1) && (lotteryRandom2 == lotteryGuess2)
                && (lotteryRandom3 == lotteryGuess3))
                
                System.out.println("Congratulation! You have won $10,000.");
            
                else if ((lotteryGuess1 == lotteryRandom2 && lotteryGuess2 == lotteryRandom1 && lotteryGuess3 == lotteryRandom3)
                || (lotteryGuess1 == lotteryRandom2
                && lotteryGuess1 == lotteryRandom3 && lotteryGuess3 == lotteryRandom1)
                || (lotteryGuess1 == lotteryRandom3
                && lotteryGuess2 == lotteryRandom1 && lotteryGuess3 == lotteryRandom2)
                || (lotteryGuess1 == lotteryRandom3
                && lotteryGuess2 == lotteryRandom2 && lotteryGuess3 == lotteryRandom1)
                || (lotteryGuess1 == lotteryRandom1
                && lotteryGuess2 == lotteryRandom3 && lotteryGuess3 == lotteryRandom2))
               
                System.out.println("Congratulation! You have won $3,000.");
                
                    else if (lotteryGuess1 == lotteryRandom1 || lotteryGuess1 == lotteryRandom2
                            || lotteryGuess1 == lotteryRandom3 || lotteryGuess2 == lotteryRandom1
                            || lotteryGuess2 == lotteryRandom2 || lotteryGuess2 == lotteryRandom3
                            || lotteryGuess3 == lotteryRandom1 || lotteryGuess3 ==lotteryRandom2
                            || lotteryGuess3 == lotteryRandom3)
                        
                        System.out.println("Congratulation! You have won $1,000");
            
            else
                System.out.println("Sorry, you have not won.");
                System.out.println("The lottery number was "+lotteryRandom);
        }
        else 
            System.out.println("Your lottery guess does not meet the requirement.");
    }
    
}
