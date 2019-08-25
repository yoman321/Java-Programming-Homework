/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg1;

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
        int integer, positiveCount, negativeCount;
        
        positiveCount = 0;
        negativeCount = 0;
        float sum = 0;
        float average = 0;
        float count = 0;
        //This program is made to count the number of positive and negative integer that were inputed.
        //The program end when 0 is inputed.
        
        
        System.out.println("Please enter integer. If 0 is inputed, this program will end.");
        integer = input.nextInt();
       
        if (integer != 0){
            
            while(integer != 0){
           
                if(integer > 0){
                    positiveCount ++;
                }
                if (integer < 0){ 
                    negativeCount ++;
                }
        
            sum += integer;
            
            count ++;
        
            integer = input.nextInt();
            
            average = sum / count;
       
            }
        }
        else 
            System.out.println("No number have been inputed except 0.");
        //Display the results.
        System.out.println("the number of inputed intergers are "+count);
        System.out.println("The number of positive number is " +positiveCount);
        System.out.println("The number of negative number is "+negativeCount);
        System.out.println("The total of those integers are "+sum);
        System.out.println("The average of those intergers is "+average);
    }
    
}
