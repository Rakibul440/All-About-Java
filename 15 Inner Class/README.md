# Inner Classes
In Java, **inner classes** are classes that are defined within another class. They are a powerful feature that helps logically group classes that are only used in one place, increasing encapsulation and readability.

---

### 🔹 Types of Inner Classes in Java

Java provides **four** types of inner classes:

1. **Non-static Nested Class (Inner Class)**
2. **Static Nested Class**
3. **Local Inner Class (Inside a Method)**
4. **Anonymous Inner Class**

---

### 1. Non-static Nested Class (Regular Inner Class)

A regular inner class is a non-static class defined within another class. It has access to all members (including private) of the outer class.

```java
class Outer {
    private String message = "Hello from Outer";

    class Inner {
        void display() {
            System.out.println(message); // Can access private members of Outer
        }
    }

    void callInner() {
        Inner inner = new Inner();
        inner.display();
    }
}
```

**Usage:**
```java
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();
inner.display();
```

---

### 2. Static Nested Class

A static nested class is a static class defined inside another class. It **cannot access** non-static members of the outer class directly.

```java
class Outer {
    static int data = 50;

    static class StaticNested {
        void display() {
            System.out.println("Data is " + data);
        }
    }
}
```

**Usage:**
```java
Outer.StaticNested nested = new Outer.StaticNested();
nested.display();
```

---

### 3. Local Inner Class (Defined Inside a Method)

This inner class is defined inside a method and can only be instantiated and used within that method. It can access final or effectively final local variables of the method.

```java
class Outer {
    void outerMethod() {
        int number = 10;

        class LocalInner {
            void display() {
                System.out.println("Number is " + number);
            }
        }

        LocalInner local = new LocalInner();
        local.display();
    }
}
```

---

### 4. Anonymous Inner Class

This is a class with **no name** and is used to **instantiate a class or interface** (usually abstract or interface) on the fly.

```java
abstract class Animal {
    abstract void sound();
}

class Demo {
    public static void main(String[] args) {
        Animal a = new Animal() {
            void sound() {
                System.out.println("Roar");
            }
        };
        a.sound();
    }
}
```

Or for interfaces:
```java
interface Greeting {
    void sayHello();
}

Greeting g = new Greeting() {
    public void sayHello() {
        System.out.println("Hello!");
    }
};
g.sayHello();
```

---

### 🔸 Why Use Inner Classes?

- Encapsulation: Hide internal logic.
- Logical Grouping: Group related classes.
- Code Clarity: Make code easier to read and maintain.
- Can access outer class members directly (non-static ones only for non-static inner classes).

---

