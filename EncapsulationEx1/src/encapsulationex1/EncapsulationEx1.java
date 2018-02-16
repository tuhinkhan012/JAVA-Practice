package encapsulationex1;


public class EncapsulationEx1 {

    public static void main(String[] args) {
        
        
        SEU obj = new SEU();
        
        obj.setStudent(800);
        obj.setRoom(40);
        obj.setTeacher(18);
        
        System.out.println("St number:"+obj.getStudent());
        System.out.println("Room number:"+obj.getRoom());
        System.out.println("Tch number:"+obj.getTeacher());
        
        
    }
    
}
