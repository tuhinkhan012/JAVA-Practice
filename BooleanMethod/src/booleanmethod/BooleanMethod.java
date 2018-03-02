package booleanmethod;

public class BooleanMethod {

    public static void main(String[] args) {
        myMethod(10);
    }
    public static boolean myMethod(int a){
        if(a>=5 && a>5){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        return false;
    }
    
}
