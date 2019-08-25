/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg2;
import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Define variables
        long startTime = System.currentTimeMillis();
        int count;
        int quizQuestions;
        int num1, num2;
        int answer;
        int correctAnswer;
        int correctCount;
        
        //Gives variabbles a value.
        count = 0;
        quizQuestions = 5;
        correctCount = 0;
        
        //Do the loop.
        while (count < quizQuestions){
            
            //Generate random numbers.
            do {
            num1 = (int)(Math.random()*16);
            num2 = (int)(Math.random()*16);
            
            //Make sure that the interger will be between 1 and 15.
            
            } while (num1 < 1 || num2 < 1);
            
            //Ask the questions.
            System.out.println("What is "+num1+" + "+num2+" = ?"); 
            answer = input.nextInt();
            
            //Define the correct answer.
            correctAnswer = num1+num2;
            
            //Validate the answer.
            if (answer == correctAnswer){
                System.out.println("You have the correct answer");
                correctCount++;
            }
            else
                System.out.println("You are Wrong.");
            
            //Incrase oveall Count.
            count++;
        }
        //Final results.
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        
        System.out.println("You have "+correctCount+" right answers and it took you "+testTime/1000+" seconds to complete this test.");
        
    }
    
}
