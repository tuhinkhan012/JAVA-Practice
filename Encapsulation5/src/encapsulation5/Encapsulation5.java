
package encapsulation5;


public class Encapsulation5 {

    public static void main(String[] args) {
        
        Poem obj = new Poem();
        
        obj.setAuthor_name("Robindronath Thakur");
        obj.setPoetry_name("Gitangoly");
        
        System.out.println("Author Name:"+obj.getAuthor_name());
        System.out.println("Poetry Name:"+obj.getPoetry_name());
        
    }
    
}
