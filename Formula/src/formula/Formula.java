package formula;

public class Formula {

    public static void main(String[] args) {
        myMethod(5,3);
    }
    static void myMethod(int a,int b){
        int result=a*a+2*a*b+b*b;
        System.out.println(result);
    }
    
}
