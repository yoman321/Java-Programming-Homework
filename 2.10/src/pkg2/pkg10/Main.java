/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2.pkg10;
import java.util.Scanner;
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
        Scanner input = new Scanner(System.in);
        double ft,it,Q,M;
        
        System.out.println("Please enter the the values for the final temperature, initial temperature, and the mass of water");
        ft = input.nextDouble();
        it = input.nextDouble();
        M = input.nextDouble();
        
        Q = M * (ft-it)* 4184;
        
        System.out.println("The value of Q is "+Q);
    }
    
}
