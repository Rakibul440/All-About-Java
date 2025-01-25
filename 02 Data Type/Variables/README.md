# Variables
In Java, a **variable** is essentially a storage location that has a data type and a name, used to store values during the execution of a program. Let's break down the essential details about variables in Java.

### 1. **Declaring Variables**:
To declare a variable in Java, you need to specify the **data type** followed by the **variable name**. Optionally, you can initialize the variable at the same time.

#### Syntax:
```java
dataType variableName;
```

For example:
```java
int age; // Declaring an integer variable named 'age'
String name; // Declaring a string variable named 'name'
```

You can also **initialize** a variable when declaring it:
```java
int age = 25; // Declaring and initializing 'age' to 25
String name = "John"; // Declaring and initializing 'name' to "John"
```

### 2. **Types of Variables**:
Java has different kinds of variables, based on where they are declared and how they are used. Here are the main types:

#### a. **Instance Variables (Non-Static Fields)**:
These variables are associated with an instance of the class (i.e., an object). Each object has its own copy of instance variables.

- Declared **inside** a class but **outside** any methods, constructors, or blocks.
- They have **default values** if not explicitly initialized (e.g., `0` for `int`, `null` for `String`).

Example:
```java
class Person {
    String name;  // Instance variable
    int age;      // Instance variable
    
    // Constructor to initialize the variables
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

#### b. **Class Variables (Static Fields)**:
These are declared with the `static` keyword and are shared among all instances of the class. There is only one copy of these variables for all objects of the class.

Example:
```java
class Counter {
    static int count = 0;  // Class variable

    Counter() {
        count++;
    }
}
```

#### c. **Local Variables**:
These variables are declared inside a method, constructor, or block and can only be accessed within that scope. They do not have default values and must be initialized before use.

Example:
```java
void displayInfo() {
    int x = 10; // Local variable
    System.out.println(x);
}
```

#### d. **Parameters (Method Arguments)**:
These are special variables that are passed to methods when called. They act as placeholders for values that are provided by the caller.

Example:
```java
void greet(String name) {  // 'name' is a parameter
    System.out.println("Hello, " + name);
}
```

### 3. **Naming Rules for Variables**:
In Java, variable names must follow these rules:
- They can consist of letters, digits, underscores (`_`), and dollar signs (`$`).
- They must start with a letter, an underscore, or a dollar sign (but not a digit).
- Java is case-sensitive, so `age`, `Age`, and `AGE` are different variables.
- Reserved keywords (like `int`, `class`, `public`) cannot be used as variable names.

### 4. **Variable Initialization**:
A variable can be initialized at the time of declaration or later in the code. It's important that local variables must be initialized before use.

Example of initialization:
```java
int number = 100; // initialization at the time of declaration
String greeting;
greeting = "Hello, World!"; // initialization after declaration
```

### 5. **Variable Scope**:
- **Local variables** are accessible only within the method, constructor, or block where they are declared.
- **Instance variables** are accessible within the entire object, and can be accessed by any method in the class (as long as it's within the same object).
- **Class variables** are accessible within the entire class and can be accessed by any method, even without creating an instance of the class (using `ClassName.variableName`).

### Example of Variable Usage:

```java
public class Main {
    static int count = 0; // Class variable (shared by all instances)

    int num; // Instance variable

    public static void main(String[] args) {
        Main obj1 = new Main();
        obj1.num = 10; // Instance variable for obj1
        System.out.println("obj1 num: " + obj1.num);

        Main obj2 = new Main();
        obj2.num = 20; // Instance variable for obj2
        System.out.println("obj2 num: " + obj2.num);
        
        // Class variable, shared by all instances
        count++;
        System.out.println("Class variable count: " + count);
        
        // Local variable
        int sum = obj1.num + obj2.num;  // Local variable in main method
        System.out.println("Sum of num from both objects: " + sum);
    }
}
```

### Summary:
- **Instance variables** belong to an object and are accessed via that object.
- **Class variables** are shared across all instances of a class.
- **Local variables** exist only inside methods and must be initialized before use.
- **Parameters** are passed to methods and act like local variables within that method.

