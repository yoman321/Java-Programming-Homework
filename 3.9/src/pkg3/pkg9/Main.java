/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg9;

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
        
        int d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
        
        System.out.println("Please enter first 9 digits of your ISBN code.");
        d1 = input.nextInt();
        d2 = input.nextInt();
        d3 = input.nextInt();
        d4 = input.nextInt();
        d5 = input.nextInt();
        d6 = input.nextInt();
        d7 = input.nextInt();
        d8 = input.nextInt();
        d9 = input.nextInt();
        
        if ((d1 >= 0 && d1 < 10) && (d2 >= 0 && d2 < 10) && (d3 >= 0 && d3 < 10) && (d4 >= 0 && d4 < 10) && (d5 >= 0 && d5 < 10)
                && (d6 >= 0 && d6 < 10) &&  (d7 >= 0 && d7 < 10) && (d8 >= 0 && d8 < 10) && (d9 >= 0 && d9 < 10)){
            
        
             d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
      
                if (d10 == 10){
                     System.out.println("Your ISBN code shall be "+d1+d2+d3+d4+d5+d6+d7+d8+d9+"x");
                     
                }
                else 
                    System.out.println("Your ISBN code shall be "+d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
                
        }
        System.out.println("Your digits are invalid.");
          
           
       }
    }
    

