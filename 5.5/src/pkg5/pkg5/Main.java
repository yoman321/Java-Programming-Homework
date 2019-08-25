/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg5;

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
        
        //This program is made to show the conversion from kilograms to pounds and vice-versa.
        //Create the format that would be used to place the values.
        System.err.println("Kilograms\t\tPounds\t|\tPounds\t\tKilograms");
        
        //Create the loop that would be used to display the values. i = kilograms ; j = pounds.
        for (int i=1,j=20;i<200 && j<155;i+=2,j+=5){
            
                double kilograms = i*2.2;
                double pounds = j/2.2;
                
                //Display the result on the screen.
                System.out.printf("%d%25.1f\t|\t%d%25.2f\n", i , pounds , j , kilograms);
            }
        }
    }
    

