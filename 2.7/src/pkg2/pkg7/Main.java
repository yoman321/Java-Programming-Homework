/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg7;

/**
 *
 * @author Utilisateur
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int minutes, years, days;
        
        System.out.println("Please enter the number of minutes");
        minutes = input.nextInt();
        
        years = minutes / (60*24*365);
        days = (minutes % (60*24*365) ) /(60*24);
        
        System.out.println("The number of years are "+years+" and the number of days are "+days);
        
    }
    
}
