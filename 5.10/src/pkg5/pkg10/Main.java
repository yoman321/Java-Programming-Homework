/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg10;

/**
 *
 * @author luoph
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        (Find numbers divisible by 5 and 6) 
        Write a program that displays all the numbers from 100 to 1,000, 
        ten per line, that are divisible by 5 and 6. Numbers are
        separated by exactly one space 
        */
        
        //Create the variables that shall be useed.
        final int NUMBERS_PER_LINE = 10;
        int count =0;
        
        //Create the loop that shall be useed.
        for (int i=100;i<1001;i++){
            
            /*
            Create the if stateement to determine if the number 
            meets the conditions
            */
            if (i%5==0 && i%6==0){
               
               /*
               Create the count that will determine if a row has more 
               than 10 intergers.
               */
                        
               count++;
               
               /*
               Create the if statement to determine if the number should just
               be printed of printed on the next row.
               */
               if (count%NUMBERS_PER_LINE==0){
                   System.out.println(i);
               }
               else 
                   System.out.print(i+" ");
               
            }
        }
        
    }
    
}
