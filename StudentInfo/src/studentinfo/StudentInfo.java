package studentinfo;
import java.util.Arrays;
import java.util.Scanner;


public class StudentInfo {
    public static void main(String[] args){
     System.out.println("Enter the id number:");
        Scanner s = new Scanner(System.in);
        String number = s.nextLine();
        myMethod (number);

    }
    public static void myMethod(String number) {
      String m ="";
      m = m+"year:" +number.substring(0,4)+"_";
      
      switch(number.substring(4,5)){
          case "1":
              m+="Semester: " + "SUMMER"+ "_";
              break;
          case "2":
              m+="Semester: " + "FALL"+ "_";
              break;
          default:
              m+="Semester: " + "SPRING"+ "_";
              break;
      }
      m+="Student Id: "+number.substring(5, number.length());
    for(String a:m.split("_",0)){
        System.out.println(a);
        
    }
    }
}