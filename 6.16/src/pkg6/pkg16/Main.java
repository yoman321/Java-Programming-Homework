/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg16;

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
        
        //This program is made to compute the number of days in a set of years.
        
        //Make the variables.
        int maxYear = 2020;
        int minYear = 2000;
        int days = 0;
        
        //Create the loop to increment the years.
        for (int years=minYear; years<=maxYear; years++){
            //Get the number of days.
            days += numberOfDaysInAYear(years);
        }
        //Tell the user the answer between 2000 and 2020.
        System.out.println("The number of days between 2000 and 2020 are "+days);
    }
    //Create the method to calculate the number of days.
    public static int numberOfDaysInAYear (int year){
        
        //Make a formula to calculate the number of days in a year.
         boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            return 366;
        }
        else
            return 365;
    
    }
}