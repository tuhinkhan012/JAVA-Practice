package formula2;


public class Formula2 {


    public static void main(String[] args) {
        myMethod(4,7);
    }
    static void myMethod(int a, int b){
        int result=(a+b)/2*(a+b)/2-(a-b)/2*(a-b)/2;
        System.out.println(result);
    }
    
}
