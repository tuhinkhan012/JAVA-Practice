package formula4;

public class Formula4 {

    public static void main(String[] args) {
        myMethod(5,6);
    }
    static void myMethod(int a,int b){
        int result;
        result = (a+b)*(a*a-a*b+b*b);
        System.out.println(result);
    }
    
}
