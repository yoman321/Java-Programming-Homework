/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg12;

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
        
        //This program is made to prints out characters 10 per lines.
        
        //Set the variables.
        char ch1 = '1';
        char ch2 = 'Z';
        final int numberPerLine = 10;
        
        //Call the method to set the start and the end of the print.
        printChars (ch1, ch2, numberPerLine);
        
    }
    //Create the method.
    public static void printChars (char ch1, char ch2, int numberPerLine){
        
        //Create the count.
        int count = 1;
        
        //Create the loop to print the characters.
        for (char i=ch1; i<=ch2; i++){
            //Make sure that the characters are printed ten per line.
            if (count % numberPerLine == 0){
                System.out.println(i);
            }
            else
                System.out.print(i+" ");
            
            //Increment count.
            count++;
        }
    }
    
}
