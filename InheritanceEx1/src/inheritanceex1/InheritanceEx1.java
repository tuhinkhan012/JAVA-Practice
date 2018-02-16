package inheritanceex1;


public class InheritanceEx1 extends Animal {


    public static void main(String[] args) {
          Animal obj = new Animal();
          Dog obj1 = new Dog();
          Cat obj2 = new Cat();
          
          obj.eat();
          obj1.bark();
          obj1.color();
          obj2.meu();
          obj2.colors();
          
          

    }
    
}
