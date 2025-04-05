
class Rectangle{
    private double length;
    private double breadth;

    //constructors

    public Rectangle(){
        length = 1;
        breadth = 1;
    }

    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }

    public Rectangle(double s){
        length = breadth = s;
    }

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(10,11);
        System.out.println(rc.getLength());
        System.out.println(rc.getBreadth());
    }
}
