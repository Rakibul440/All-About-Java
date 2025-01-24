import java.lang.*;
import java.util.*;

public class Sum
{
	public static void main(String arg[])
	{
		int num1, num2, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		result = num1 + num2;
		System.out.println("Sum of "+ num1 + " and " + num2 + " is : " + result);
	}
}