class Outer{
    int number = 10;

    void method(){
        class Local{
            int age = 22;
            String name = "Rakibul Islam";
            
            void callLocal(){System.out.println("Hey, It's "+ name + " of " + age +" years old!");}
        }

        Local lock = new Local();
        lock.callLocal();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer out = new Outer();

        out.method();
    }
}
