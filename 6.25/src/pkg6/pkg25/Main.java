/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg25;

/**
 *
 * @author Utilisateur
 */
import java.util.Scanner;
import static java.lang.System.out;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input the Scanner.
        Scanner input = new Scanner(System.in);
        
        //Tell the user the point of this method.
        out.println("This program is made to find the hours, minutes, and seconds "
                + "of an inputed millisedonds.\n");
        
        //Asl the user to input the milliseconds.
        out.print("Please input the milliseconds : ");
        long milliseconds = input.nextLong();
        
        //Display the result.
        out.println("The time in hours:minutes:seconds is "+convertMillis(milliseconds));
    }
    //Create a method to make the conversion from milliseconds to hours:minutes:seconds.
    public static String convertMillis (long millis){
        
        //Get the total seconds.
        long totalSeconds = millis / 1000;
        
        //Get the current second.
        long currentSecond = totalSeconds % 60;
        
        //Get the total minutes.
        long totalMinutes = totalSeconds / 60;
        
        //Get the current minutes.
        long currentMinutes = totalMinutes % 60;
        
        //Get the total hours.
        long totalHours = totalMinutes / 60;
        
        //Get the current hours.
        long currentHours = totalHours % 24;
        
        //Convert everything to String.
        String stringCurrentSecond = Long.toString(currentSecond);
        String stringCurrentMinutes = Long.toString(currentMinutes);
        String stringCurrentHours = Long.toString(currentHours);
        
        //Return everything as a string.
        String hoursMinutesSeconds = stringCurrentHours+":"+stringCurrentMinutes+":"
                +stringCurrentSecond;
        
        return hoursMinutesSeconds;          
    }
    
}
