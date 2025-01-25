# Literals
In Java, **literals** are fixed values that are directly written in the source code. They represent constant values that cannot change during the execution of a program. These can be numbers, characters, boolean values, or strings, and they correspond to specific types in the language.

### Types of Literals in Java:

1. **Integer Literals**:
   Integer literals represent whole numbers (without decimals). You can use different number systems for integer literals:

   - **Decimal (Base 10)**: Just a regular number.
     ```java
     int x = 42;  // Decimal literal
     ```
   
   - **Hexadecimal (Base 16)**: Prefixed with `0x` or `0X`.
     ```java
     int x = 0x2A;  // Hexadecimal literal (equivalent to decimal 42)
     ```
   
   - **Octal (Base 8)**: Prefixed with `0`.
     ```java
     int x = 052;  // Octal literal (equivalent to decimal 42)
     ```
   
   - **Binary (Base 2)**: Prefixed with `0b` or `0B` (Java 7 and above).
     ```java
     int x = 0b101010;  // Binary literal (equivalent to decimal 42)
     ```

2. **Floating-Point Literals**:
   These literals represent numbers with decimal points (i.e., fractional numbers).

   - **float**: Use `f` or `F` at the end to denote that the literal is of type `float`.
     ```java
     float f1 = 3.14f;   // Floating-point literal (float)
     ```
   
   - **double**: A double is the default for floating-point numbers, so the `f` or `F` is not required.
     ```java
     double d1 = 3.14;  // Floating-point literal (double)
     ```

3. **Character Literals**:
   A character literal represents a single character enclosed in single quotes. It can be any Unicode character.

   ```java
   char letter = 'A';  // Character literal
   char number = '7';  // Character literal
   char symbol = '$';  // Character literal
   ```

   Special escape sequences can also be used to represent characters, such as:
   - `'\n'`: Newline
   - `'\t'`: Tab
   - `'\''`: Single quote
   - `'\\'`: Backslash

4. **String Literals**:
   String literals represent sequences of characters enclosed in double quotes. Strings are a class in Java (part of `java.lang`), so they are considered reference types (not primitive types).

   ```java
   String greeting = "Hello, World!";  // String literal
   String empty = "";  // Empty string literal
   ```

5. **Boolean Literals**:
   The boolean literal represents one of two values: `true` or `false`.

   ```java
   boolean isJavaFun = true;  // Boolean literal
   boolean isEmpty = false;   // Boolean literal
   ```

6. **Null Literal**:
   The `null` literal represents the absence of a value or object. It can be assigned to any reference type (e.g., objects, arrays, strings).

   ```java
   String str = null;  // Null literal, representing no object
   ```

### Example Code Using Different Literals:
```java
public class Main {
    public static void main(String[] args) {
        // Integer literals
        int decimal = 42;           // Decimal
        int hex = 0x2A;             // Hexadecimal
        int octal = 052;            // Octal
        int binary = 0b101010;      // Binary
        
        // Floating-point literals
        float piFloat = 3.14f;      // Float literal
        double piDouble = 3.14159;  // Double literal
        
        // Character literals
        char letter = 'A';          // Single character
        char symbol = '$';          // Another character
        
        // String literals
        String greeting = "Hello, Java!";
        String emptyString = "";    // Empty string
        
        // Boolean literals
        boolean isJavaFun = true;
        boolean isCompleted = false;
        
        // Null literal
        String nullString = null;

        // Printing the values
        System.out.println("Decimal: " + decimal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Octal: " + octal);
        System.out.println("Binary: " + binary);
        System.out.println("Float: " + piFloat);
        System.out.println("Double: " + piDouble);
        System.out.println("Character: " + letter);
        System.out.println("Symbol: " + symbol);
        System.out.println("Greeting: " + greeting);
        System.out.println("Empty String: " + emptyString);
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Is Completed? " + isCompleted);
        System.out.println("Null String: " + nullString);
    }
}
```

### Summary of Java Literals:
- **Integer literals**: Can be written in decimal, hexadecimal, octal, or binary.
- **Floating-point literals**: Represent decimal numbers, can be `float` or `double`.
- **Character literals**: A single character enclosed in single quotes.
- **String literals**: A sequence of characters enclosed in double quotes.
- **Boolean literals**: Represent `true` or `false`.
- **Null literal**: Represents the absence of a value or object.

