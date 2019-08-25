/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg7;

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
        
        /*This programs is made to compute the tuition for university.
        You start with 10 000$ and it increase by 5% once a year. 
        Write a program that computes the tuition in ten years and the
        total cost of four years’ worth of tuition after the tenth year.*/
        
        //Create the base variables.
        double extraYearsTuition;
        double tempYearTuition = 0;
        double yearTuition = 10000;
        final double yearIncrease = 0.05;
        int year = 10;
        int extraYears = 4;
        
        
        
        /*Create the loop that will allow to determine the total cost of 10 
        years of tuition. */
        
        for (int i=1 ; i<11; i++){
            
            tempYearTuition = yearTuition*yearIncrease+yearTuition;
            
            yearTuition = tempYearTuition;
            
            
        }
        //Set the value of yearTuition to extraYearsTuition for better readibility.
        extraYearsTuition = yearTuition;
        //Now create the loop that will be determining the extra four years of tuition.
        
        for (int i=11 ; i<15; i++){
            
            tempYearTuition = extraYearsTuition*yearIncrease+extraYearsTuition;
            
            extraYearsTuition = tempYearTuition;
            
            
        }
        System.out.printf("The yearly tuition for ten years shall be of %.2f and the extra four years of tuition shall be of %.2f\n",yearTuition ,extraYearsTuition);
    }
    
}
