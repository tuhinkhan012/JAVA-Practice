/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.with.even.odd;

import java.util.Scanner;

/**
 *
 * @author Mohsin E Nur
 */
public class PrimeWithEvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        if(num%2 == 0){
            System.out.println("Number is not prime.");
        }else {
            boolean c = true;
            for(int i=3;i*i<=num;i+=2) {
                if(num%i==0)
                    System.out.println("Number is not prime.");
                   
            }
            if(c==true) System.out.println("Number is prime.");
           
        }
        
        if(num % 2 == 0){
            System.out.println("Number is Even");
        }else System.out.println("Number is Odd");
    }
    
}
