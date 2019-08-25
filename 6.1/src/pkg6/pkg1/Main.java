/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg1;

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
        
        //The point of this program is to find the first 100 pentagonal numbers.
        
        //Define the value of variables.
        final int MAX_PENTAGONAL_NUMBERS = 100;
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        
        //Create the loop to find the the first 100 pentagonal numbers.
        for (int i=1;i<MAX_PENTAGONAL_NUMBERS;i++){
            //Increment the count first.
            count++;
            //Create an if statement to determine when to print on the next line.
            if (count % NUMBERS_PER_LINE == 0){
                
                System.out.println(getPentagonalNumber(i));
            }
            else
                System.out.print(getPentagonalNumber(i)+" ");
                
        }
    }
        
        //Create the method.
        public static int getPentagonalNumber (int n){
            
            //Create the formula to find pentagonal numbers.
            int formula = (n*(3*n-1))/2;
            
            //Return the value.
            return formula;
            
        }
    }
    

