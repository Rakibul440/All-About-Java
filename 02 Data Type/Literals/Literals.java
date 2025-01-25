import java.lang.*;

public class Literals
{
	public static void main(String arg[])
	{
		byte b1 = 10; 	// in decimal
		byte b2 = 0b1010; //10 in binary -- starts with 0b
		byte b3 = 012; 	//10 in octal	-- starts with 0
		byte b4 = 0XA; 	// 10 in Hexadecimal -- starts with 0X
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}

}