
public class Circle {
 
    public double radius;
    public double area(double radius){
        double area = Math.PI * radius * radius ;
        return area;
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println(obj.area(10));
    }
}
