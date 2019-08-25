/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg37;

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
        int number,width;
        
        System.out.println("Please enter a format");
        number = input.nextInt();
        width = input.nextInt();
        System.out.println(format(number,width));
    }
    public static int Len(int number){
        int i,count;
        count = 0;
        if(number/100>0){
            count = 3;
            
        }
        else if(number/10>0){
            count=2;
        }
        else {
            count = 1;
    }
return count;
}
    public static String format(int number, int width){
        int witdh,zeroes;
        for (width-Len(number)>0;w){
       
       
       
       
       
       
            
        }
    }
}