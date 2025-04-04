
class Cylinder{
    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI * radius * height;
    }

    public double circumference(){
        return  2 * Math.PI * radius;
    }

    public double totalSurfaceArea(){
        return 2 * lidArea() +  circumference() * height;
    }

    public double volume(){
        return lidArea() * height;
    }
}

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c = new Cylinder() ;
        c.height = 10;
        c.radius = 7;

        System.out.println(c.lidArea());
    }
}
