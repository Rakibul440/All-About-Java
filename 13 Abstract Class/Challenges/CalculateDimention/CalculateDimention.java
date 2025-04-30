abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape {
    public double radius;

    Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override 
    public double area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    public double length;
    public double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double perimeter(){
        return 2 * (length + breadth);
    }

    @Override 
    public double area(){
        return length * breadth;
    }
}

public class CalculateDimention {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(10,20);
        Circle sc = new Circle(3.14);

        System.out.println("Area of this circle is : " + sc.area());
        System.out.println("Area of this Rectangle is : " + rc.area());
    }
}
