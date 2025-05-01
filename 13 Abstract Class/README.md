# Abstractn Class
In Java, an **abstract class** is a class that **cannot be instantiated** on its own and is meant to be **inherited by other classes**. It can contain **abstract methods** (methods without a body) as well as **concrete methods** (methods with a body).

---

### 🔹 **Key Points about Abstract Classes**
1. Declared using the `abstract` keyword.
2. Can have both abstract and non-abstract methods.
3. Cannot be instantiated directly.
4. Can have constructors, fields, and static methods.
5. Used when you want to provide a common base with some shared implementation and enforce subclasses to implement specific methods.

---

### 🧱 **Syntax**
```java
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Sleeping...");
    }
}
```

```java
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
```

---

### 🚫 **Why can't you instantiate an abstract class?**
Because it's incomplete by design. It may contain abstract methods that **don’t have an implementation**, so Java prevents you from creating objects of such a class.

---

### ✅ **When to use an abstract class**
- When you have a base class that should **not be instantiated on its own**.
- When subclasses **must implement** certain behaviors, but some shared code should also be provided.
- When you want to provide **partial implementation** to subclasses.

---

### 🔄 **Abstract class vs Interface**
| Feature | Abstract Class | Interface |
|--------|----------------|-----------|
| Methods | Can have both abstract and concrete methods | Only abstract methods (before Java 8), default/static methods allowed from Java 8 |
| Fields | Can have fields | Only constants (`public static final`) |
| Constructors | Yes | No |
| Inheritance | Single inheritance only | Can be implemented by multiple interfaces |
| Usage | Partial implementation | Contract for behavior |

---

### 🧪 Example in Practice

```java
abstract class Shape {
    abstract double area();
    void display() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Shape s = new Circle(5);
        s.display();  // Output: Calculating area...
        System.out.println("Area: " + s.area());  // Output: Area: 78.53981633974483
    }
}
```

---
