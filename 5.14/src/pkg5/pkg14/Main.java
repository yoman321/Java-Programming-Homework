/*
(Compute the greatest common divisor) Another solution for Listing 5.9 to find
the greatest common divisor of two integers n1 and n2 is as follows: First find d
to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
a divisor for both n1 and n2 in this order. The first such common divisor is the
greatest common divisor for n1 and n2. Write a program that prompts the user to
enter two positive integers and displays the gcd.
 */
package pkg5.pkg14;

/**
 *
 * @author luoph
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input the scanner;
        Scanner input = new Scanner(System.in);
        
        //Tell the user the puropose of this program.
        System.out.println("This programs is made to find "
                + " the Greatest Common Divider (GCD).\n");
        
        //Ask the user to enter his variables.
        System.out.println("Please enter your variables");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        
        //Find the minimum of those variables.
        int d = (n1<n2) ? n1:n2;
        
        //Create the loop to find the GCD.
        while (n1%d!=0 || n2%d!=0){
            d--;
        }
        //Print the result.
        System.out.println("The greatedt common divider between "+n1+" and "+n2+
                " is "+d);
    }
    
}
