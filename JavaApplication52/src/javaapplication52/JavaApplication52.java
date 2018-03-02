package javaapplication52;

import java.util.Arrays;
import java.util.Scanner;
import static javaapplication52.str.substring;


public class JavaApplication52 {

    public static void main(String[] args) {
        System.out.println("Enter 13 digit id number:");
        Scanner s = new Scanner(System.in);
        String number = s.nextLine();
        myMethod (number);
         
    }
    static void myMethod(String number){
       String n="";
       n = n+"year" +number.substring(0,3)+"_"; 
       String[] splitedNumber = s.split("");
    
        if(fourNumber==0){
            System.out.println("semister :spring");
        
        }
        else if(fourNumber==1){
            System.out.println("semister :summer");
        
        }
        else if(fourNumber==2){
            System.out.println("semister: fall");
        
        }
        else{
          System.out.println("No match found!");
        }
        n+="Student Id: "+number.substring(5,number.length());
        for(String m:s.split("_",0)){
        System.out.println(m);
    }
    
    }
    
}
