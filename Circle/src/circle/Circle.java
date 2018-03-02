package circle;

public class Circle {
      
    public static void main(String[] args) {
        area(3);
        area(6);
        area(2);
    }
    static  void area(int valueofR){
        double pie=3.1416;
        double areasIS=pie*valueofR*valueofR;
        System.out.println("Area:"+areasIS);
    }
    
}
