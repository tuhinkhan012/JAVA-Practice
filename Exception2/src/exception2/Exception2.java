package exception2;

public class Exception2 {


    public static void main(String[] args) {
       
        int i=4;
        int j=0;
        
        
        try{
            System.out.println(i/j);
        }catch(Exception e){
            System.out.println("called catch");
            System.out.println(e);
        }
        finally{
            System.out.println(i*4);
        }
    }
    
}
