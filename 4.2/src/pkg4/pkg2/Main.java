/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg2;

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
        // TODO code application logic her
        Scanner input = new Scanner(System.in);
        final double radius = 6371.01;
        
        System.out.println("This program is made to compute the great circle distance between two points.");
        System.out.println("Enter all your values in degrees.");
        
        // As the user for input in degrees
        System.out.print("Please enter your coordinates in (x1 , y1) form :");
        String FIRST_COORDINATES =  input.nextLine();
        System.out.print("Please enter your second coordinates in (x2 , y2) from :");
        String SECOND_COORDINATES = input.nextLine();
        
        //Program the answer to be read on a single line.
        int k = FIRST_COORDINATES.indexOf(',');
        String x1 = FIRST_COORDINATES.substring(0,k);
        String y1 = FIRST_COORDINATES.substring(k+1);
        
        int h = SECOND_COORDINATES.indexOf(',');
        String x2 = SECOND_COORDINATES.substring(0,h);
        String y2 = SECOND_COORDINATES.substring(h+1);
        
        //Change the string into double values.
        double x1c = Double.parseDouble(x1);
        double y1c = Double.parseDouble(y1);
        double x2c = Double.parseDouble(x2);
        double y2c = Double.parseDouble(y2);
        
        //Change the values for degrees to radians.
        double x1r = (Math.toRadians(x1c));
        double x2r = (Math.toRadians(x2c));
        double y1r = (Math.toRadians(y1c));
        double y2r = (Math.toRadians(y2c));
        
        //Formula to compute this distance. d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        double distance = radius  * Math.acos(Math.sin(x1r) * Math.sin(x2r) + Math.cos(x1r) * Math.cos(x2r) * Math.cos(y1r - y2r));
        
        System.out.println("The distance shall be of "+distance);
        
        
    }
    
}
