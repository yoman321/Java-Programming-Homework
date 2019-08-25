/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg15;

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
        (Display the ASCII character table) 
        Write a program that prints the characters in
        the ASCII character table from ! to ~. 
        Display ten characters per line. The ASCII
        table is shown in Appendix B. 
        Characters are separated by exactly one space.
        */
        
        //Create the variable.
        int count=0;
        final int CHARACTERS_PER_LINE = 10;
        
        //Create the loop.
        for (int i=33;i<127;i++){
            
            count++;
            
            //Check the count to know how to print the tablee.
            if (count%CHARACTERS_PER_LINE==0){
                System.out.println((char)i);
            }
            else 
                System.out.print((char)i+" ");
            
            
        }
    }
    
}
