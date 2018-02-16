package exceptionhandling;


public class ExceptionHandling {


    public static void main(String[] args) {
           
            int j=0;
            int i=12;
            
            
         try{
             System.out.println(i/j);
         
         }catch(Exception e){
             System.out.println(e);
         }
         int a=2 , b=1;
         System.out.println("result is:"+(a+b));
    }
    
    
}
