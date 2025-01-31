package AreaOfTriangle;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        //case 1
        float base, height, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base and height of the triangle: ");
        base = sc.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        height = sc.nextFloat();

        area = (base * height) / 2;
        System.out.println("Area of the triangle is: " + area);
        // sc.close();

        //case 2
        float a, b, c, s, area2;
        System.out.println("Enter the sides of the triangle: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        s = (a + b + c) / 2;

        area2 = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the triangle is: " + area2);
        sc.close();
    }
}