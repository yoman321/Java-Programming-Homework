/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg20;

/**
 *
 * @author Utilisateur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count,i,j;
        count = 0;
        boolean is_prime;
        for (i=2;i<=1000;i++){
            is_prime = true;
            for(j=2;j<=(int)Math.sqrt(i);j++){
                if(i%j==0){
                   is_prime = false;
                   
                }
            }
            if (is_prime){
                System.out.print(i+" ");
                count++;
                if(count%8==0){
           System.out.println();
            }
        }
       
       } 
    }
    
}
