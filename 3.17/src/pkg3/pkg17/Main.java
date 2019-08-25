/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg17;

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
       
       int programPlay = (int) (Math.random()*3);
       
       System.out.println("Please enter your sign knowing that 0=scissor, 1=rock ,and 2=paper.");
       int yourPlay = input.nextInt();
       
       
       
       if (yourPlay<3 && yourPlay>=0){
           
           switch (programPlay){
               
               case 0: System.out.println("Scissor");break;
               case 1:System.out.println("Rock");break;
               case 2:System.out.println("Paper");break;
               
           }
           switch (yourPlay){
               
           
               case 0: System.out.println("Scissor");break;
               case 1:System.out.println("Rock");break;
               case 2:System.out.println("Paper");break;
               
           }
              String yourPlay1 = Integer.toString(yourPlay);
              String programPlay1 = Integer.toString(programPlay);
               
           
           if (yourPlay>programPlay || (yourPlay==1 && programPlay==3)){
               
               System.out.println("Congratulation! You have won with "+yourPlay1+" agaisnt "+programPlay1);
           }
           else if (yourPlay==programPlay){
                       
               System.out.println("Same sign. No one has won this round");
              
           }
           else               
               System.out.println("Sorry, you have lost while playing "+yourPlay1+" against "+programPlay1);
            
            
       }
       else
           System.out.println("You are not allowed to enter this number.");
    }
    
}
