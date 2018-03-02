package abin;

public class AbIn implements Inter {

    public static void main(String[] args) {
        
        AbIn obj = new AbIn() ;
        obj.eat();
        obj.name();
        obj.travel();
        
        
    }

    @Override
    public void name() {
         System.out.println("Tuhin");
    }

    @Override
    public void eat() {
         System.out.println("Burger");
       
        
    }

    @Override
    public void travel() {
     System.out.println("Cox's Bazar");    }
     
        
    }
    

