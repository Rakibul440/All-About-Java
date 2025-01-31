package QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        // ax^2 + bx + c = 0
        int a , b , c;
        float root1, root2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a, b and c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();

        float D = (float) Math.sqrt(b*b - 4*a*c); // Discriminant should be positive

        root1 = (-b + D) / (2*a);
        root2 = (-b - D) / (2*a);

        System.out.println("Root1: " + root1);
        System.out.println("Root2: " + root2);
    }
}

