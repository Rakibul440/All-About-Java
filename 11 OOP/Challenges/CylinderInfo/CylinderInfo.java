
class Cylinder{
    private double radius;
    private double height;

    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }

    public void setRadius(double r){
        if(r>0){
            radius = r;
        }else{
            radius = 0;
        }
    }

    public void setHeight(double h){
        if(h>0){
           height = h;
        }else{
           height = 0;
        }
    }

    public void setDimention(double r , double h){
        if(r * h > 0){
            r = radius;
            h = height;
        }else{
            radius = height = 0;
        }
    }

    public Cylinder(){
        radius = height = 1;
    }

    public Cylinder(double r){
        radius = r;
        height = 1;
    }

    public Cylinder(double r, double h){
        radius = r;
        height = h;
    }

    public double volume(){
        double vol = Math.PI * getRadius() * getRadius() * getHeight();
        return vol;
    }

    public double totalSurfaceArea(){
        double totalArea = 2 * Math.PI * getRadius() * (getRadius() + getHeight());
        return totalArea;
    }

    public double curvedSurfaceArea(){
        double curvedArea = 2 * Math.PI * getRadius() * getHeight();
        return curvedArea;
    }


}

public class CylinderInfo {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(10,12);
        System.out.println(Math.floor(cy.volume()) );
    }
}
