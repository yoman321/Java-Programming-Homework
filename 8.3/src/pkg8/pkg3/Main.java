/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.pkg3;

/**
 *
 * @author luoph
 */
import java.util.Arrays;
import static java.lang.System.out;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create the varaible.
        int correctCount;
        
        //Create the array.
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        
        char[] key =  {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        
        int[][] studentGrade = new int[answers.length][2];
            
        //Tell the user the point of this program.
        out.println("This program is made to display in increasing order of "
                + "students with the correct answer.");
        
        //Grade the answers.
        for (int row=0; row<answers.length; row++){
            correctCount=0;
            for (int col=0; col<answers[row].length; col++){
                if (answers[row][col] == key[col]){
                    correctCount++;
                    studentGrade[row][0] = correctCount;
                    studentGrade[row][1] = row;
                }

            }
           
        }
        //TEST
        for (int row=0; row<studentGrade.length; row++){
            for (int col=0; col<studentGrade[row].length; col++){
                out.print(studentGrade[row][col]+" ");
            }
        }
        //TEST Max
        out.println("The max is "+max(studentGrade));
    }
    //Create a method to sort the student's grade array.
    public static int[][] sortGrade (int[][] studentGrade){
        
        //Compare the array index.
        for (int col=0; col<studentGrade[0].length; col++){
            
        }
    }
    //Create a method to find the max of the student's grade array.
    public static int max (int[][] studentGrade){
        
        //Create the variable.
        int max = studentGrade[0][0];
        
        //Get the max of the studentGrade array.
        for (int col=0; col<studentGrade[0].length; col++){
            if (studentGrade[col][0] > max){
                max = studentGrade[col][0];
            }
        }
        return max;
    }
}

