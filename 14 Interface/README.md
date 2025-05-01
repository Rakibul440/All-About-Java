# Interface

In Java, **an interface** is a reference type similar to a class that is used to define a **contract** or a set of **abstract methods** that other classes must implement. It is a key concept in Java for achieving **abstraction** and **multiple inheritance**.

---

### 🔹 What Is an Interface?

- An interface contains method **declarations** (not implementations).
- A class that **implements** an interface must provide the method bodies for all the methods declared in the interface.
- Interfaces can also contain **constants**, **default methods**, **static methods**, and **private methods** (Java 8+).

---

### 🔹 Syntax:

```java
interface Vehicle {
    void start();   // abstract method
    void stop();    // abstract method
}
```

### 🔹 Implementing an Interface:

```java
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
}
```

---

### 🔹 Key Features:

| Feature | Description |
|--------|-------------|
| **Abstraction** | Interfaces provide a way to define behavior without specifying implementation. |
| **Multiple Inheritance** | A class can implement multiple interfaces, allowing a form of multiple inheritance. |
| **Loose Coupling** | Interfaces allow code to be more modular and flexible. |
| **Polymorphism** | A reference of an interface type can point to any object that implements it. |

---

### 🔹 Java Interface vs Abstract Class:

| Feature               | Interface                          | Abstract Class                    |
|----------------------|------------------------------------|-----------------------------------|
| Methods              | Only abstract (until Java 8)       | Can have both abstract and concrete |
| Inheritance          | Multiple interfaces allowed         | Only single inheritance            |
| Fields               | `public static final` (constants)  | Can have instance variables        |
| Access Modifiers     | Methods are `public abstract` by default | Can have any modifier        |

---

### 🔹 Default and Static Methods (Java 8+):

```java
interface MyInterface {
    default void sayHello() {
        System.out.println("Hello from default method");
    }

    static void sayStatic() {
        System.out.println("Hello from static method");
    }
}
```

---

### 🔹 Functional Interfaces (Java 8+):

An interface with a **single abstract method** is called a *functional interface*. Used in **lambda expressions**.

```java
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

Calculator add = (a, b) -> a + b;
```

---

### 🔹 Example in Real Use:

```java
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

public class Main {
    public static void main(String[] args) {
        Drawable d = new Circle(); // polymorphism
        d.draw(); // Output: Drawing Circle
    }
}
```

---

