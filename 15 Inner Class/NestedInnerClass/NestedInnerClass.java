class Outer {
    public int x = 10;

    class Inner {
        public int y = 11;
        void innerDisplay(){System.out.println("x : " +x + " y : " + y);}
        void InnerCall(){System.out.println("Hey from inner class!");}
    }

    void outerDisplay(){
        Inner in = new Inner();
        in.InnerCall();
        System.out.println("y from inner is : " + in.y);
    }

}
public class NestedInnerClass {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerDisplay();

        System.out.println("\n-----------------\n\n");
        System.out.println("-----Accessing Inner class------\n");
        // Accessing Inner class
        Outer.Inner into = new Outer().new Inner();
        into.innerDisplay();
        into.InnerCall();
    }
}
