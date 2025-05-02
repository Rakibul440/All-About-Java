class Outer{
    static int x = 10;
    int  y = 21;

    static class Inner{
        void show(){
            System.out.println("X : "+x); //y can't be shown in this static class
                                        // cause y is non-static

        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner Oi = new Outer.Inner();

        Oi.show();
    }
}
