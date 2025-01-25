# Data Types
In Java, **data types**, **variables**, and **literals** are fundamental concepts. Here's a brief overview:

### 1. **Data Types**:
Java has two types of data types:
- **Primitive Data Types**: These are the basic data types and are not objects. They are predefined by the language and are the most efficient way to represent simple values.
  - **byte**: 1 byte, range: -128 to 127
  - **short**: 2 bytes, range: -32,768 to 32,767
  - **int**: 4 bytes, range: -2^31 to 2^31-1
  - **long**: 8 bytes, range: -2^63 to 2^63-1
  - **float**: 4 bytes, used for decimal numbers (single-precision)
  - **double**: 8 bytes, used for decimal numbers (double-precision)
  - **char**: 2 bytes, represents a single character (e.g., 'A', '1')
  - **boolean**: Represents true or false values

- **Non-Primitive (Reference) Data Types**: These refer to objects or arrays and can store complex data.
  - **String**: A sequence of characters.
  - Arrays, Classes, Interfaces, etc.

### 2. **Variables**:
A variable is a container for storing data values. In Java, you need to declare a variable with a specific data type before using it.
- **Syntax**:  
  `dataType variableName;`
  
  For example:
  ```java
  int age;        // variable of type int
  double price;   // variable of type double
  String name;    // variable of type String
  ```

  You can also initialize variables when declaring them:
  ```java
  int age = 25;
  double price = 19.99;
  String name = "John Doe";
  ```

### 3. **Literals**:
A literal is a fixed value that is represented directly in the source code.
- **Integer literals**: `int a = 100;`
- **Floating-point literals**: `double pi = 3.14;`
- **Character literals**: `char letter = 'A';`
- **Boolean literals**: `boolean isJavaFun = true;`
- **String literals**: `"Hello, World!"`

### Example Code:
```java
public class Main {
    public static void main(String[] args) {
        int number = 10;        // integer literal
        double temperature = 25.5; // floating-point literal
        char letter = 'A';      // character literal
        boolean isActive = true; // boolean literal
        String name = "Java";   // string literal

        System.out.println(number);
        System.out.println(temperature);
        System.out.println(letter);
        System.out.println(isActive);
        System.out.println(name);
    }
}
```

