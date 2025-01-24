import java.lang.*;
import java.util.*;

public class BinaryToDecimal
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		sc.useRadix(2); // 2 for base two number system(binary), input should be a binary number
		System.out.println("Enter a binary number : ");
		int decimalNum = sc.nextInt();
		System.out.println("Decimal of you input is " + decimalNum);
	}
}