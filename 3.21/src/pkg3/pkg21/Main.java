/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg21;

/**
 *
 * @author luoph
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       int month, day, q, m, h;
       
       System.out.println("This program is made to calculate the day of the week.");
        
       //Ask for the user to enter an the year he is in, since everything can be calculated fromt that point.
       System.out.println("Please enter the year you are in.");
       int realYear = input.nextInt();
       
       int j = realYear / 100;
       int k = realYear % 100;
       
        System.out.println("Please enter the month you are in knowing that 3=March and 14=January");
        month = input.nextInt();
       
            if (month<3 || month>14){  
            
                do{
                    System.out.println("You have entered an invalid number. Please re-enter the month.");
                    month = input.nextInt();
            }
                while (month<3 || month>14);
        
        }
        
        System.out.println("Please enter the day between 1 and 31.");
        day = input.nextInt();
            
            if (day<1 || day>31){
        
                do{
                System.out.println("You have not entered a valid day. Please re-enter your day.");
                day = input.nextInt();
            }
                while (day<1 || day>31);
        
        } 
        m = month;
        q = day;    
        
        h = (q + (26 * (m + 1)) / 10 + k + k/4 + j/4 + 5 * j) % 7;
        
        switch (h){
            case 0: System.out.println("Saturday");break;
            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
            case 5: System.out.println("Thursday");break;
            case 6: System.out.println("Friday");
            
        }
                  
    }
 
}
