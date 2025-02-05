import java.util.Scanner;

public class FindRadix {
    public static void main(String[] args) {
        String number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        number = sc.nextLine();
        sc.close();

        if(number.matches("[0-1]*")){
            System.out.println("It's a binary number and Radix : 2");
        }
        else if(number.matches("[0-7]*")){
            System.out.println("It's a octal number and Radix : 8");
        }
        else if(number.matches("[0-9]*")){
            System.out.println("It's a decimal number and Radix : 10");
        }
        else if(number.matches("[0-9A-F]*")){
            System.out.println("It's a hexa-decimal number and Radix : 16");
        }
        else {
            System.out.println("Invalid number");
        }
    }
}
