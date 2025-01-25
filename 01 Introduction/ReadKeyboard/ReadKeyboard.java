import java.lang.*;
import java.util.*;

public class ReadKeyboard
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
        int x = sc.nextInt();
		float y = sc.nextFloat();
		sc.nextLine(); // Consume the leftover newline
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("x = " + x);
		System.out.println("y = "+y);
		System.out.println("Welcome " + name);
    }
}