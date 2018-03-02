package result;

import java.util.Scanner;


public class Result {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int value=input.nextInt();
        System.out.println("Value is:"+value);
        if(value>=0 && value<=40){
            System.out.println("F");
        }
        else if(value>=41 && value<=50){
            System.out.println("D");
        }
        else if(value>=51 && value<=60){
                System.out.println("C");
        
        }
        else if(value>=61 && value<=70){
            System.out.println("B");
        
        }
        else if(value>=71 && value<=80){
            System.out.println("A");
        
        }
        else{
    System.out.println("A+");


}
       
    }
    
}
