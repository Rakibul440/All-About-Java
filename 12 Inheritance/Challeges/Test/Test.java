
class Parent{
    public Parent(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Class");
    }
}

public class Test {
    public static void main(String[] args) {
        Child ch = new Child();
        
    }
}
