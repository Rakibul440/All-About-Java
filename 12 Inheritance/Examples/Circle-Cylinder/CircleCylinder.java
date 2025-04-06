class Circle{
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
//create cylinder class by inheriting circle class
class Cylinder extends Circle{
    public double height;

    public double volume(){
        return area() * height;
    }
}
public class CircleCylinder {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.radius = 10;
        cy.height = 20;
        System.out.println("Volume is : " + cy.volume());
    }
}
