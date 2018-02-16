package encapsulationex2;


public class EncapsulationEx2 {


    public static void main(String[] args) {
        
        
         Student obj = new Student ();
         
         obj.setSt_name("Tuhin");
         obj.setId(12345);
         obj.setBlood_Group("A+");
         
         System.out.println("Name:"+obj.getSt_name());
         System.out.println("ID:"+obj.getId());
         System.out.println("Blood group:"+obj.getBlood_Group());
    }
    
}









