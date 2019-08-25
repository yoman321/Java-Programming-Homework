/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg11;

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
        int year, month;
        
        System.out.println("Enter a year and month in number with 0 being January");
        year = input.nextInt();
        month = input.nextInt();
        
      
      if (month >= 0 && month <= 11){  
        switch (month) {
            case 0 : System.out.println(year+ "has 31 days in january");break;
            case 1 :
                if((year%4==0)&&(year%100 !=0) || (year%400==0)){ 
                    
                System.out.println(year+ "has 29 days in Febuary");break;
                }
                
                else 
                    System.out.println(year+ "has 28 days in Febuary"); break;
        
                case 2 : System.out.println(year+ "has 31 days in March");break;
                case 3 : System.out.println(year+ "has 30 days in April");break;
                case 4 : System.out.println(year+ "has 31 days in May");break;
                case 5 : System.out.println(year+ "has 30 days in June");break;
                case 6 : System.out.println(year+ "has 31 days in July");break;
                case 7 : System.out.println(year+ "has 31 days in August");break;
                case 8 : System.out.println(year+ "has 30 days in September");break;
                case 9 : System.out.println(year+ "has 31 days in Ocotober");break;
                case 10 : System.out.println(year+ "has 30 days in November");break;
                case 11: System.out.println(year+ "has 31 days in December");break;
            
        
             }
        
                    
        
        }
    else
          System.out.println("The month you have entered does not exist.");
    }
    
}
