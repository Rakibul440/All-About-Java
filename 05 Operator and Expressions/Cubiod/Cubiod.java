package Cubiod;

import java.util.Scanner;

public class Cubiod {
    public static void main(String[] args) {

        float length , breadth, height, area_F$Ba, area_R$L, area_B$T, totalArea, volume;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length, height and breadth of the cubiod: ");
        length = sc.nextFloat();
        height = sc.nextFloat();
        breadth = sc.nextFloat();
        sc.close();

        area_F$Ba = 2*(length*height);
        area_R$L = 2*(breadth*height);
        area_B$T = 2*(length*breadth);

        totalArea = area_B$T + area_F$Ba + area_R$L;
        volume = length * height * breadth;

        System.out.println("Total area of the cuboid is "+totalArea);
        System.out.println("Volume of the cubiod is "+volume);
 
    }
}
