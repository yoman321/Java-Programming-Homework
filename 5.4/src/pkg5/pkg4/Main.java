/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg4;

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
        
        //This program is made to converse miles into Kilometers for sets velues.
        
        //Create the board where the values would be shown.
        System.out.println("Miles\t\tKilmoeters");
        
        //Create a loop that would make the values conversion.
        for (int i=1;i<11;i++){
            double kilometers = i*1.609;
            
            //Print out the values.
            System.out.println(i+"\t\t"+kilometers);
        }
    }
    
}
