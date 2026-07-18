abstract class Animal{
    void legs()
    {
    System.out.println("All animals have 4 legs");
    }

    abstract void eat();
    abstract void sound();
}

class Cat extends Animal{
@Override
    void eat(){
        System.out.println("Meal eating");
    }

    void sound(){
        System.out.println("Bow Bow");
    }
}

class Tiger extends Animal{
    @Override
        void eat(){
            System.out.println("Grass eating");
        }
    
        void sound(){
            System.out.println("oooo oooo");
        }
    }
public class abclass {
    public static void main(String[] args) {
         Cat c=new Cat();
        Tiger t=new Tiger();
        
        c.eat(); c.sound(); c.legs();
        t.eat(); t.sound(); t.legs();
    }
}
 

 