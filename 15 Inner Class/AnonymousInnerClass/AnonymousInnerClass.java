abstract class MyLady{
   abstract public void callLady();
}

interface Her{
   public void callHer();
}

class Beloved{
    String name = "Isabela";

    void Display(){

        MyLady Rr = new MyLady(){
            public void callLady() {System.out.println(name + ", Where are you??");};
        };
    
        Her Sr = new Her(){
            public void callHer(){System.out.println("Love you my "+ name);}
        };

        Rr.callLady();
        Sr.callHer();
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Beloved myLove = new Beloved();
        myLove.Display();
    }
}
