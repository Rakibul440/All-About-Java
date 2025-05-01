abstract class Animal{
    Animal() {
        System.out.println("Animal type is being scanned...");
    }

    abstract void bark();
}

class Cat extends Animal{
    @Override
    void bark(){
        System.out.println("Meow, meow !");
    }
}



public class AbstractExample{
    public static void main(String[] args){
        Cat mini = new Cat();
        mini.bark();
    }
}