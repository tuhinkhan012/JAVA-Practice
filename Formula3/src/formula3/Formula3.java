package formula3;

public class Formula3 {

    public static void main(String[] args) {
        myMethod(26,21);
    }
    static void myMethod(int a,int b){
        int result=a*a*a+3*a*a*b+3*a*b*b+b*b*b;
        System.out.println(result);
    }
    
}
