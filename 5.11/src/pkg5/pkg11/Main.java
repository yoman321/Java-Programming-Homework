/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg11;

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
        (Find numbers divisible by 5 or 6, but not both) 
        Write a program that displays
        all the numbers from 100 to 200, ten per line, 
        that are divisible by 5 or 6, but not
        both. Numbers are separated by exactly one space.
        */
        
        //Create the variables.
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        
        //Create the loop.
        for (int i=100;i<201;i++){
            
            //Create the if statement that would determine if the number would be print.
            if ((i%5==0 && i%6!=0) || (i%5!=0 && i%6==0)){
                
                //Create the count to unsure there will be 10 intergers per row.
                count++;
                
                /*Print the table with an if statement which determine the 
                number of intergers per row.
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
