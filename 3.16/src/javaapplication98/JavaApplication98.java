/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication98;

/**
 *
 * @author Utilisateur
 */
import java.util.Scanner;
public class JavaApplication98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        
        int xVariable = (int) (Math.random()*2);
        int yVariable = (int) (Math.random()*2);
        
        if (xVariable==0 && yVariable==0)
            System.out.println("(100.200)");
        
        else if (xVariable==1 && yVariable==0)
                System.out.println("(-100,200)");
        
        else if (xVariable==1 && yVariable==1)
                System.out.println("(-100,-200)");
        
        else if (xVariable==0 && yVariable==1)
                System.out.println("(100,-200)");
                
    }
}