//simple exercice about switch in java
package javaapplication4;

import java.util.Scanner;
//to import Scanner

public class JavaApplication4 {
    
   
    
    public static void main(String[] args) { 
        Scanner read =new Scanner(System.in);
        
         
      int choice,num1,num2,num3,result;
          
 System.out.println("1 add too numbers");
 System.out.println("2 get he subsctract of too numbers");
 System.out.println("3 get the squer of  number");
  choice = read.nextInt();
  switch (choice){
      
      case 1:{
          System.out.println("1 add too numbers");
          System.out.println("enter the numbers");
          num1 =read.nextInt();
          num2 =read.nextInt(); 
          result =( num1  + num2);
          System.out.println(result);
      }
          break;
      case 2 :{
          System.out.println("2 get he subsctract of too numbers");
             System.out.println("enter the numbers");
          num1 =read.nextInt();
          num2 =read.nextInt(); 
          result =( num1 - num2);
          System.out.println(result); 
      }
          break;
      case 3:{
          System.out.println("3 get the squer of  number");
             System.out.println("enter positive number");
             
          num1  = read.nextInt();
          result =(num1 * num1);
          if (num1>0)
          //num2 =read.nextInt(); 
          
          
          System.out.println(result); 
         
      }
          break;
      default: {  
      System.out.println("wrrong choicr");
      }     
  
                  
      }
  }
        
        
        
        
    }
    

