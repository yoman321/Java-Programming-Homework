/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg9;

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
        double vf,vi,a;
        
        System.out.println("Please enter the values for vf, vi, and a");
        vf = input.nextDouble();
        vi = input.nextDouble();
        
        a = (vf-vi)/2;
        
        System.out.println("The acceleration is "+a);
                
    }
    
}
