/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg15;

/**
 *
 * @author luoph
 */
import java.util.Scanner;
import static java.lang.System.out;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input the Scanner.
        Scanner input = new Scanner(System.in);
        
        //Create the array.
        int[] list = new int[10];
        
        //Tell the user the function of this program.
        out.println("This program is made to eliminates duplicates in an array.");
        
        //Ask the user to input the numbers.
        out.print("Please input 10 integers : ");
        for (int index=0; index<list.length; index++){
            list[index] = input.nextInt();
        }
        //Call a void method to print out the result.
        printEliminateDuplicates(eliminateDuplicates(list));
    }
    //Create a void method to print out the results.
    public static void printEliminateDuplicates (int[] eliminateDuplicateList){
        
        out.print("The distinct numbers are : ");
        for (int index=0; index<eliminateDuplicateList.length; index++){
            if (eliminateDuplicateList[index] != 0){
                out.print(eliminateDuplicateList[index]+" ");
            } 
        }
    }
    //Create a method to eliminates duplicates.
    public static int[] eliminateDuplicates (int[] list){
        
        //Create another array.
        int[] duplicatesEliminated = new int[10];
        
        //Create the variaables.
        boolean notDuplicate;
        
        //Create a loop to eliminate duplicate.
        for (int indexOld=0; indexOld<list.length; indexOld++){
            notDuplicate = true;
            
            for (int indexNew=0; indexNew<list.length; indexNew++){
                if (list[indexOld] == duplicatesEliminated[indexNew]){
                    notDuplicate = false;
                }
                
            }
            if (notDuplicate){
                duplicatesEliminated[indexOld] = list[indexOld];
            }
            
        }
        return duplicatesEliminated;
    }   
}
