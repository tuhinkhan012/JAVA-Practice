package myassignment1;

public class MyAssignment1 {

    public static void main(String[] args) {
        char grade;
        int score=80;
        if(score>=80){
          grade='A';
        }
       else if(score>=70){
          grade='B';
        }
       else if(score>=60){
            grade='C';
    }
       else if(score>=50){
          grade='D';
        }
       else{
         grade='F';
       }
        System.out.println("Score:"+score+"Grade:"+grade);
    }
    
}
