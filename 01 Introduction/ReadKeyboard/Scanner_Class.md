The **`Scanner`** class in Java is a part of the `java.util` package, and it is primarily used for getting input from the user. The `Scanner` class makes it easier to read different types of inputs, such as strings, numbers, and characters, from various input sources like the keyboard, files, etc.

### Key Features of `Scanner` Class:
- Can read input from various sources (keyboard, file, etc.).
- Can parse and tokenize the input into different data types (e.g., integers, strings).
- Supports various input types like `nextInt()`, `nextDouble()`, `nextLine()`, etc.

### Importing the `Scanner` Class:
To use the `Scanner` class, you need to import it at the beginning of your program:
```java
import java.util.Scanner;
```

### Basic Usage of `Scanner` Class:
Let's look at how to use the `Scanner` class to read different types of input.

### Example 1: Reading a String Input
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Reads a whole line of text

        // Display the entered name
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner
        scanner.close();
    }
}
```
### Explanation:
- **`scanner.nextLine()`**: Reads the entire line entered by the user (including spaces).
  
---

### Example 2: Reading an Integer
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Reads an integer

        // Display the entered integer
        System.out.println("You are " + age + " years old.");

        // Close the scanner
        scanner.close();
    }
}
```
### Explanation:
- **`scanner.nextInt()`**: Reads an integer input from the user.

---

### Example 3: Reading a Double
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a decimal number
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();  // Reads a decimal (double)

        // Display the entered double value
        System.out.println("Your height is " + height + " meters.");

        // Close the scanner
        scanner.close();
    }
}
```
### Explanation:
- **`scanner.nextDouble()`**: Reads a floating-point number (double).

---

### Example 4: Reading a Boolean
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a boolean value
        System.out.print("Do you like programming? (true/false): ");
        boolean likesProgramming = scanner.nextBoolean();  // Reads a boolean

        // Display the entered boolean value
        if (likesProgramming) {
            System.out.println("That's awesome! Keep coding.");
        } else {
            System.out.println("Maybe give it a try again later!");
        }

        // Close the scanner
        scanner.close();
    }
}
```
### Explanation:
- **`scanner.nextBoolean()`**: Reads a boolean value (`true` or `false`).

---

### Example 5: Reading Multiple Inputs of Different Types
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter multiple types of data
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        // Display the collected information
        System.out.println("Name: " + firstName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");

        // Close the scanner
        scanner.close();
    }
}
```
### Explanation:
- **`nextLine()`**, **`nextInt()`**, **`nextDouble()`**: Used together to read different types of input from the user. 
- **Note**: When using `nextInt()` or `nextDouble()` followed by `nextLine()`, there can be issues because the newline character (which the user hits after entering a number) is left in the input buffer. To avoid this, you may need to add an additional `nextLine()` call after reading numbers.

---

### Example 6: Handling Input Mismatch Exceptions
If the user enters the wrong type of input (e.g., entering text when an integer is expected), the program will throw an exception. You can handle this using a `try-catch` block.

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();  // Will throw InputMismatchException if input is not an integer
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        scanner.close();
    }
}
```
### Explanation:
- **`try-catch`**: Catches an exception if the user provides invalid input (e.g., a string when an integer is expected).

---

### Example 7: Skipping the Next Line (`nextLine()` behavior after `nextInt()`/`nextDouble()`)
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Skip the newline character after the number
        scanner.nextLine();  // Consume the newline left by nextInt()

        // Read a string after the integer
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Output the results
        System.out.println("Name: " + name + ", Age: " + age);

        scanner.close();
    }
}
```
### Explanation:
- **`scanner.nextLine()` after `nextInt()`**: It’s important to call `nextLine()` after reading numeric input to consume the leftover newline character in the input buffer.

---

### Commonly Used Methods in `Scanner` Class:
- **`next()`**: Reads the next token (a word) from the input.
- **`nextLine()`**: Reads the whole line (including spaces).
- **`nextInt()`**: Reads an integer.
- **`nextDouble()`**: Reads a double value.
- **`nextBoolean()`**: Reads a boolean value (`true` or `false`).
- **`hasNext()`**: Returns `true` if there is another token in the input.
- **`hasNextLine()`**: Returns `true` if there is another line in the input.

### Conclusion:
The `Scanner` class is an essential tool in Java for getting input from users. It provides a variety of methods to handle different types of input (strings, numbers, booleans). When using it, be mindful of how methods like `nextInt()` and `nextLine()` interact, and ensure you handle exceptions for invalid input.