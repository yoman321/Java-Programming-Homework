/*
5.18 Pattern D
 */
package pkg5.pkg18.d;

/**
 *
 * @author Utilisateur
 */
public class D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create the loop for patterb D.
        for (int i=1;i<7;i++){
            for (int j=1;j<i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<8-i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        
    }
    
}
