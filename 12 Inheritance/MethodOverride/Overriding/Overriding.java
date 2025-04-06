class Super{
    public void display(){
        System.out.println("Display Super class");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Display Sub class");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Super su = new Super();
        su.display();

        Sub s = new Sub();
        s.display();

        Super sb2 = new Sub(); // Call it's own object's class display() although reference is Super class
        sb2.display(); //Dynamic Method Dispatch
    }
}
