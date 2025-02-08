## **Methods in Java – Detailed Explanation**

### **What is a Method in Java?**
A **method** in Java is a block of code that performs a specific task. It helps in **code reusability**, improves **modularity**, and makes the program easier to manage.

### **Types of Methods in Java**
Java methods are categorized into:
1. **Predefined Methods (Built-in Methods)** – Provided by Java libraries (e.g., `Math.sqrt()`, `System.out.println()`).
2. **User-defined Methods** – Created by programmers to perform specific operations.

---

## **1. Declaring a Method**
A method is defined using the following syntax:

```java
returnType methodName(parameters) {
    // Method body
    return value; // (if returnType is not void)
}
```

### **Example of a Simple Method**
```java
public int add(int a, int b) {
    return a + b;
}
```

Here:
- `public` → Access modifier (makes the method accessible from other classes).
- `int` → Return type (method returns an integer value).
- `add` → Method name.
- `(int a, int b)` → Parameters (input values to the method).
- `return a + b;` → Returns the sum of `a` and `b`.

---

## **2. Calling a Method**
Methods must be **called (invoked)** to execute. Example:

```java
public class Test {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Test obj = new Test(); // Creating an object
        int sum = obj.add(10, 20); // Calling the method
        System.out.println("Sum: " + sum); // Output: Sum: 30
    }
}
```

---

## **3. Types of User-Defined Methods**
### **(A) Methods with No Parameters and No Return Value**
```java
public void greet() {
    System.out.println("Hello, Welcome!");
}
```
- No parameters (`()` is empty).
- `void` return type (does not return a value).
- Call this method using:
  ```java
  obj.greet();
  ```

### **(B) Methods with Parameters but No Return Value**
```java
public void displayMessage(String message) {
    System.out.println("Message: " + message);
}
```
- Takes a `String` as a parameter.
- Call this method using:
  ```java
  obj.displayMessage("Java is awesome!");
  ```

### **(C) Methods with Parameters and Return Value**
```java
public int multiply(int a, int b) {
    return a * b;
}
```
- Returns an `int` result.
- Call this method using:
  ```java
  int result = obj.multiply(5, 4);
  System.out.println(result); // Output: 20
  ```

### **(D) Methods with No Parameters but Return Value**
```java
public int getNumber() {
    return 100;
}
```
- Returns `100` when called.

---

## **4. Method Overloading (Same Name, Different Parameters)**
Java allows multiple methods with the **same name** but **different parameters**.

```java
public class OverloadExample {
    // Method with one parameter
    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    // Method with two parameters
    public void display(String s, int b) {
        System.out.println("String: " + s + ", Integer: " + b);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display(5); 
        obj.display("Hello", 10);
    }
}
```
**Output:**
```
Integer: 5
String: Hello, Integer: 10
```
**Why use overloading?** It increases code flexibility and readability.

---

## **5. Method Overriding (Redefining a Method in Subclass)**
In **inheritance**, a subclass can override a method of the superclass.

### **Example of Overriding**
```java
class Parent {
    public void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child class method");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); // Output: Child class method
    }
}
```
**Key Points:**
- The `@Override` annotation ensures the method is correctly overridden.
- The subclass method **replaces** the parent class method.

---

## **6. Static Methods (No Need for an Object)**
A **static method** belongs to the class and can be called without creating an object.

```java
class StaticExample {
    public static void greet() {
        System.out.println("Hello from static method!");
    }

    public static void main(String[] args) {
        StaticExample.greet(); // Directly calling the static method
    }
}
```
**Output:**
```
Hello from static method!
```
**Why use static methods?**
- Useful for utility methods (e.g., `Math.max()`, `Math.sqrt()`).
- No need to create objects.

---

## **7. Final Methods (Cannot be Overridden)**
A method marked as **final** cannot be overridden in a subclass.

```java
class A {
    public final void show() {
        System.out.println("Final method");
    }
}

class B extends A {
    // This would cause an error:
    // public void show() { System.out.println("Cannot override!"); }
}
```
**Why use final methods?**  
To **prevent modifications** in subclasses.

---

## **8. Recursive Methods (A Method Calling Itself)**
Recursion is when a method **calls itself**.

```java
public class Factorial {
    public int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println(obj.factorial(5)); // Output: 120
    }
}
```
**How it works:**  
`factorial(5)` → `5 * factorial(4)` → `4 * factorial(3)` → ... → `1 * factorial(0) = 1`.

---

## **9. Abstract Methods (Must be Implemented in Subclass)**
An **abstract method** has **no body** and must be implemented in a subclass.

```java
abstract class Animal {
    abstract void makeSound(); // Abstract method
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.makeSound(); // Output: Woof Woof!
    }
}
```
**Why use abstract methods?**  
- Enforces **method implementation** in subclasses.

---

## **10. Synchronized Methods (Thread-Safe)**
A **synchronized** method ensures that only **one thread** executes it at a time.

```java
class SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
```
Used in **multithreading** to avoid **race conditions**.

---

## **Conclusion**
Methods in Java play a crucial role in structuring and organizing code. Key takeaways:
- **Types:** Built-in & User-defined methods.
- **Concepts:** Method overloading, overriding, recursion, abstract, and static methods.
- **Modifiers:** `final`, `synchronized`, and `static`.

