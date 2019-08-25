/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg19;

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
        double x1,x2,x3,y1,y2,y3,d1,d2,d3,s,area;
        
          System.out.println("Please enter the values for x1 and x2 and x3");
        x1 = input.nextDouble();
        x2 = input.nextDouble();
        x3 = input.nextDouble();
        
        System.out.println("Please enter the values for y1 and y2 and y3");
        y1 = input.nextDouble();
        y2 = input.nextDouble();
        y3 = input.nextDouble();
        
        
        d1 = Math.pow(Math.pow(x2-x1,2)+ Math.pow(y2-y1, 2), 0.5);
        d2 = Math.pow(Math.pow(x2-x3,2)+ Math.pow(y2-y3, 2), 0.5);
        d3 = Math.pow(Math.pow(x3-x1,2)+ Math.pow(y3-y1, 2), 0.5);
        
        s =(d1+d2+d3)/2;
        
        area = Math.pow(s*(s-d1)*(s-d2)*(s-d3), 0.5);
        
        System.out.println("the area of this triangle is "+area);
        
    }
    
}
