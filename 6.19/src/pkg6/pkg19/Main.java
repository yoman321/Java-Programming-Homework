/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg19;

/**
 *
 * @author Utilisateur
 */
import java .util.Scanner;
import static java.lang.System.out;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Import the Scanner.
        Scanner input = new Scanner(System.in);
        
        //Tell the user the point of this program.
        out.println("This program is made to validate the length of each side of"
                + " a triangle and check the area of the triangle.\n");
        
        //Ask for the input of the 3 sides of the triangles.
        out.println("Please enter the the length of the 3 sides.");
        out.print("Side 1 : ");
        double side1 = input.nextDouble();
        out.print("Side 2 : ");
        double side2 = input.nextDouble();
        out.print("Side 3 : ");
        double side3 = input.nextDouble();
        
        //Give out the answer.
        out.println("The triangle is " +(isValid(side1, side2, side3) ? "valid" : "invalid"));
        
        //Get the area of the triangle if it is valid.
        if (findArea(side1, side2, side3) == 0){
            out.println("Since the triangle is invalid, there is no area.");
        }
        else
            out.println("The area of this triangle is "+findArea(side1, side2, side3));
        
    }
    //Create the method to validate the triangle's sides length.
    public static boolean isValid (double side1, double side2, double side3){
        
        //Take the sum of any two sides and compare it to the third one.
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2){
            return false;
        }
        return true;
    }
    //Create the method to find the area of the triangle.
    public static double findArea (double side1, double side2, double side3){
        
        //Check first if it is a valid triangle.
        if (isValid(side1, side2, side3) == false){
            return 0;
        }
        //Compute the area of the triangle.
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        
        return area;
    }
    
}
