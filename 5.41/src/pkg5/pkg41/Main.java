/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg41;

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
        int h = 0;
        int t = 0;
                
        for (int i=1;i<1000000001;i++){
            int coin = (int)(Math.random()*2);
            if (coin == 1){
               h++;
            }
            else 
                t++;
        }
        System.out.println("Tails "+t+" heads "+h);
    }
    
}
