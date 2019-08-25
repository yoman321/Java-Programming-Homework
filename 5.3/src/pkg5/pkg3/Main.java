/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg3;

/**
 *
 * @author Utilisateur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        
        //Create a tabke of conversion from Kilograms to Pounds.
        //Create variables.
        int count;
        
        count = 1;
        
        //Create the titles.
        System.out.println("Kilograms\t\tPounds");
        
        //Create the for loop to do so. Make i+=2, since the loop augment of 2 each times the it is reread.
        for (int i=count;i<200;i+=2){
            double pounds = i * 2.2;
            System.out.println(i+"\t\t"+pounds);
                  
        }
    }
    
}
