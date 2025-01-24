# UseRadix Method
The `useRadix(int radix)` method in the `Scanner` class allows you to set the **radix** (base) for interpreting integer input. The radix specifies the base of the numeral system used when parsing integers. For example:

- **Radix 10** is the standard decimal (base-10) system.
- **Radix 2** is binary (base-2).
- **Radix 8** is octal (base-8).
- **Radix 16** is hexadecimal (base-16).

### Syntax:
```java
public Scanner useRadix(int radix)
```

- **`radix`**: The base (radix) to be used when parsing integers. It must be an integer between 2 and 36, inclusive.

### Default Radix:
By default, `Scanner` uses the decimal system (radix 10) for interpreting integer input.

### Example of `useRadix` in Action:

#### Example 1: Reading a Hexadecimal Number (Radix 16)
```java
import java.util.Scanner;

public class ScannerRadixExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Set the radix to hexadecimal (base 16)
        scanner.useRadix(16);
        
        System.out.print("Enter a hexadecimal number: ");
        int hexNumber = scanner.nextInt();  // Reads an integer in base 16

        System.out.println("The number you entered (in decimal) is: " + hexNumber);
        
        // Close the scanner
        scanner.close();
    }
}
```
#### Input:
```
Enter a hexadecimal number: 1A
```

#### Output:
```
The number you entered (in decimal) is: 26
```

### Example 2: Reading a Binary Number (Radix 2)
```java
import java.util.Scanner;

public class ScannerRadixExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set the radix to binary (base 2)
        scanner.useRadix(2);

        System.out.print("Enter a binary number: ");
        int binaryNumber = scanner.nextInt();  // Reads an integer in base 2

        System.out.println("The number you entered (in decimal) is: " + binaryNumber);

        // Close the scanner
        scanner.close();
    }
}
```

#### Input:
```
Enter a binary number: 1101
```

#### Output:
```
The number you entered (in decimal) is: 13
```

### Important Notes:
- The radix can range from **2 to 36**. If you try to set a radix outside of this range, `IllegalArgumentException` will be thrown.
- When using a custom radix, the input string should conform to that base (e.g., only digits `0-9` and letters `a-f` for hexadecimal).
  
### Example 3: Radix Outside the Valid Range (Throws Exception)
```java
import java.util.Scanner;

public class ScannerRadixExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Set an invalid radix (greater than 36)
            scanner.useRadix(40);  // This will throw an exception
            
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid radix! Radix must be between 2 and 36.");
        }

        scanner.close();
    }
}
```

#### Output:
```
Invalid radix! Radix must be between 2 and 36.
```

### Summary:
- The `useRadix(int radix)` method in `Scanner` allows you to specify the base for interpreting integer input.
- Radix values range from 2 (binary) to 36 (alphanumeric system).
- Setting the radix is useful when reading numbers in non-decimal formats like binary, octal, or hexadecimal.