/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

/**
 *
 * @author Utilisateur
 */

public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count, i;
        final int line = 10;
        
        count = 0;
        
        for (i = 100; i <=200; i++){
            if (i % 5 == 0 ^ i % 6 == 0){
                count++;
                
                if (count % line == 0)
                    System.out.println(i);
                else
                    System.out.println(i + " ");
            }
                
        }
    }
}


