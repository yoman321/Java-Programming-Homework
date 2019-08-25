/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg22;

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
        
       System.out.println("Enter 2 strings number");
       num1 = input.nextLine();
       num2 = input.nextLine();
       
       if (num1.contains(num2)){
           System.out.println("Number1 and Number 2 have the same content");
       }
                   else
           System.out.println("Number 1 and Number 2 do not have the same content");
           
       }
        
    }
    

