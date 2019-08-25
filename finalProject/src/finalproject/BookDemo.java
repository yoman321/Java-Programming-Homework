/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Utilisateur
 */
import java.util.Scanner;
public class BookDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        String tl, an;
        int y,u;
        int[] bs=new int[6];
        
        Book [] bookArray = new Book [4];
          Scanner input = new Scanner(System.in);
        
        for ( u=0;u<2;u++){
          
            System.out.println("Please enter the title, the author last name, the year that has been published, and the number of sales.");
            tl=input.next();
            an = input.next();
            y = input.nextInt();
           
            for(int j=0; j<6; j++){
                bs[j]=input.nextInt();
               
            
            }
           bookArray[u]=new Book(tl, an, y, bs);  
            
            
        }
        
        for (int k=2;k<4;k++){
           
            System.out.println("Please enter the title, the author last name, the year that has been published, and the number of sales. ");
            tl=input.next();
            an = input.next();
            y = input.nextInt();
            
            for(int j=0; j<6; j++){
                bs[j]=input.nextInt();        
                }
            bookArray[k]=new Book(tl,an,y);
            bookArray[k].setSalesNumbers(bs);
            
        }
        
        // sort the array
        for (int h=0;h<bookArray.length;h++){
            int maxTotal=bookArray[h].getTotal();
            int maxIndex=h;
            for (int c=h+1;c<bookArray.length;c++){
                if ( bookArray[c].getTotal() > maxTotal){
                   maxTotal=bookArray[c].getTotal();
                  maxIndex=c;
                }
            }
            Book temp=bookArray[h];
            bookArray[h]=bookArray[maxIndex];
            bookArray[maxIndex]=temp;
        
        }
        for ( int i=0;i<bookArray.length;i++){
            System.out.println(i+" ) "+bookArray[i].getBookname()+ " written by "+ bookArray[i].getAuthorLastName()+ " published in the year " +bookArray[i].getYears()+ " that has "+ bookArray[i].getTotal()+ " of sales. ");
        }
}
}
