/* Display each digit of the number
 * Count Digits of a Number
 * Find a number is Armstrong or not
 * Reverse a number
 * Check a number palindrome or not
 */
/*
 * An Armstrong number (also known as a Narcissistic number) is a number that is equal to the sum of its own digits, 
 * each raised to the power of the number of digits in the number.
 */

import java.util.Scanner;

public class NumberChecking {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter any positive number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();

        int yourInputNumber = number , num = number; 
        int reverseNumber = 0;
        int totalDigit = 0;
        int armstrongNumber = 0;


        // Display Digit
        System.out.println("Digits in " + yourInputNumber + " are :-");
        while (num>0) {
            int reminder = num % 10;
            num /= 10;
            totalDigit += 1;
            System.out.print(reminder + "\t");
        }
        System.out.println("");
        System.out.println("Total digits in " + yourInputNumber + " are : " + totalDigit);


        // check Armstrong and Reverse the number
        int count = totalDigit;

        while (number>0) {
            int reminder = number % 10;
            number /= 10;
            int powOf10 = 1;
            int powOfDigit = 1;
    
            for(int i = totalDigit - 1; i > 0; i--){
                powOf10 *= 10;
            }
            for(int i = count ; i > 0; i--){
                powOfDigit *= reminder;
            }
    
            reverseNumber += (reminder * powOf10);
            armstrongNumber += powOfDigit;
            totalDigit--;
        }
     
        System.out.println("Reverse number of " + yourInputNumber + " is : " + reverseNumber);

        if(yourInputNumber == armstrongNumber){
            System.out.println(yourInputNumber + " is an Armstrong number");
        }
        else if (yourInputNumber == reverseNumber){
            System.out.println(yourInputNumber + " is an Palindrome number");
        }
        else{
            System.out.println(yourInputNumber + " is nither an Armstrong nor a Palindrome number");
        }

    }
}
