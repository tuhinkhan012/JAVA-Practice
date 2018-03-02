package abin2;


public class AbIn2 extends Inter2{


    public static void main(String[] args) {
        AbIn2 obj = new AbIn2();
        obj.name();
        obj.fav_car("Honda");
        
     
    }
    @Override
    public void name(){
        System.out.println("Tuhin");
        
    }
   // @overload
    public void fav_car(String name){
        System.out.println("BMW");
    }
    
}
