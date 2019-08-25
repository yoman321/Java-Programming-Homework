/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg10;

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
        Scanner input = new Scanner (System.in);
        
        int temp, num3, answer;
        
        System.out.println("here is an equation. Please resolve and try the number of time needed.");
        
        do{
            
        
        int num1 = (int)(Math.random()*100);
        int num2 = (int)(Math.random()*100);
            if (num1 < num2){ 
                
                temp = num1;
                 num1 = num2;
                 num2 = temp;
        }   
                    System.out.println("What is "+num1+" - "+num2);
                     answer = input.nextInt();
      
                     num3 = num1-num2;
      
                           if(answer == num3){
                           System.out.println("Your answer is correct!");
          
      }
                           else
                               System.out.println("You are incorrect. Try to resolve another equation.");
        }
        while (num3 != answer);
                           
    }
}
    

