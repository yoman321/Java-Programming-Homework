/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg3;

/**
 *
 * @author Utilisateur
 */import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a,b,c,d,e,f,x,y;
        
        System.out.println("Please enter a value fo a, b, c, d");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        
        if (a*d - b*c == 0){
        System.out.println("This equation has no solution");
        }
       
            x = (e*d-b*f)/(a*d-b*c);
            y = (a*f-e*c)/(a*d-b*c);
            
            System.out.println("The value for x is "+x+" and the value for y is "+y);
    }
    
}
