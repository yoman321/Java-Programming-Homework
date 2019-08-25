package finalproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilisateur
 */
public class Book {
   private String bookName;
  private  String authorLastName;
   private int year;        
   private int saleNumbers[];
     
    public Book (String newBookName, String newAuthorLastName, int newYear){
       bookName = newBookName;
       authorLastName = newAuthorLastName;
       year = newYear;
       saleNumbers= new int[6];
           
       }
   public Book (String newBookName, String newAuthorLastName, int newYear, int soldBooks[]){
           bookName = newBookName;
           authorLastName = newAuthorLastName;
           year = newYear;
           saleNumbers= new int[6];
           for (int i=0; i<soldBooks.length; i++){           
             saleNumbers[i]=soldBooks[i];
           
           }
           
           
   }
    
   public String getBookname(){
       return bookName;
   }
   public String getAuthorLastName(){
       return authorLastName;
   }
   public int getYears(){
       return year;
   }
   public void setBookName (String newBookName){
      bookName = newBookName;
   }
   public void setAuthorLastName(String newAuthorLastName){
       authorLastName = newAuthorLastName;
   }
   public void setYears(int newYears){
       year = newYears;
   }
 
 public void setSalesNumbers (int[] sn){
   for (int i=0;i<saleNumbers.length;i++){
       saleNumbers[i] = sn[i];
   }
}  
public void setSalesNumbers (int numbersOfBooksSold, int month){
    saleNumbers[month] = numbersOfBooksSold;
    }
public int getSaleNumbers(int month){
    return  saleNumbers[month];
}
public int getTotal (){
    int sum=0;
    for (int i=0;i<saleNumbers.length;i++){       
       sum += saleNumbers[i];  
    }
     return sum;   
   }
   
}

    
    

