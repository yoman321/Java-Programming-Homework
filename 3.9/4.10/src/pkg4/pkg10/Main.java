/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg10;

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
        
        //List the possible asnwers that can be given to the console.
        String possible1 = "yes";
        String possible2 = "no";
        int day = 0;
        
        //Tell the user what the program is going to do.
        System.out.println("This program is made to guess which date the user is born by asking 5 questions.");
        
        //Type the calendar.
        String set1 = 
                " 1 3 5 7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";
        
        String set2 = 
                " 2 3 6 7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31";
        
        String set3 = 
                " 4 5 6 7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31";

        String set4 = 
                " 8 9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31";
        
        //Ask the questions to the user.
        System.out.println(set1);
        System.out.print("Can you find you birthday here : ");
        String answer1 = input.nextLine();
        
        if (answer1.equals(possible1))
            day += 1;      
        
        System.out.println(set2);
        System.out.print("Can you find your birthday here : ");
        String answer2 = input.nextLine();
        
        if (answer2.equals(possible1))
            day += 2 ;
        
        System.out.println(set3);
        System.out.print("Can you find your birthday here : ");
        String answer3 = input.nextLine();
        
        if (answer3.equals(possible1))
            day += 4;
        
        System.out.println(set4);
        System.out.print("Can you find your birthday here : ");
        String answer4 = input.nextLine();
        
        if (answer4.equals(possible1))
            day += 8;
        
        System.out.println(set5);
        System.out.print("Can you find your birthday here : ");
        String answer5 = input.nextLine();
        
        if (answer5.equals(possible1))
            day +=16;
        
        //Give the birthday date after running the program.
        System.out.println("Your birthday is the "+day);    
        }
        
    }
    
    

