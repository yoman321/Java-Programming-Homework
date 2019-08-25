/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg21;

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
       String num1, num2;
       
       
       System.out.println("Please enter an insurance number in the format DDD-DD-DDD");
       
       num1 = input.nextLine();
      
       
       if (num1.length()==11 && num1.charAt(3)=='-'&& num1.charAt(6) == '-' && Character.isDigit(num1.charAt(0))) {
           System.out.println("This SSN is valid");
       }
           else 
           System.out.println("This SSn number is invalid");
       }
        
    }
    

