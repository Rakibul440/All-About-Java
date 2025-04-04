
class Rectangle{
    private double length;
    private double breadth;

    public void setLength(double l){
        if(l>=0){
            length = l;
        }else{
            length = 0;
        }
    }
    public void setBreadth(double b){
        if(b>=0){
            breadth = b;
        }else{
            breadth = 0;
        }
    }

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public double Area(){
        return getLength() * getBreadth();
    }

    public double Perimeter(){
        return 2 * (getLength() + getBreadth());
    }

    public boolean isSquare(){
        if(getBreadth() == getLength()){
            return true;
        }else{
            return false;
        }
    }
}

public class DataHiding {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        rc.setLength(12);
        rc.setBreadth(10);

        System.out.println(rc.Area());
        System.out.println(rc.Perimeter());
        System.out.println(rc.isSquare());
    }
}
