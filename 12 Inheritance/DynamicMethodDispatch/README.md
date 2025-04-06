
## 🔸 What is Dynamic Method Dispatch in Java?

**Dynamic Method Dispatch** (also known as **runtime polymorphism**) is a mechanism in Java that **resolves a method call to the correct overridden method at runtime**, **not** compile time.

This happens **when a superclass reference points to a subclass object**, and the method that gets executed depends on the **actual object type**, not the reference type.

---

## 🔹 Why is it Called “Dynamic”?

It’s called **dynamic** because the method that gets called is determined **dynamically at runtime**, **not** during compilation.

---

## 🔹 Syntax Overview

```java
Superclass obj = new Subclass();
obj.overriddenMethod();  // Which method is called depends on the actual object type
```

---

## 🔹 Example: Dynamic Method Dispatch

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();  // Animal reference, Dog object
        a.sound();      // Output: Dog barks

        a = new Cat();  // Animal reference, Cat object
        a.sound();      // Output: Cat meows
    }
}
```

> Even though the reference `a` is of type `Animal`, the actual method that gets executed depends on whether the object is a `Dog` or `Cat`.

---

## 🔹 How Does It Work Internally?

- The compiler checks if the method exists in the **reference type** (superclass).
- The JVM determines the actual method implementation to run at **runtime** using the **virtual method table (vtable)**.

---

## 🔹 Key Requirements for Dynamic Method Dispatch

| Requirement | Explanation |
|-------------|-------------|
| Inheritance | There must be a superclass-subclass relationship. |
| Method Overriding | Subclass must override a method from the superclass. |
| Reference Type | A superclass reference must point to a subclass object. |

---

## 🔹 What Cannot Be Dispatched Dynamically?

| Feature            | Reason |
|--------------------|--------|
| Static Methods     | Resolved at **compile time** (method hiding) |
| Final Methods      | Cannot be overridden |
| Private Methods    | Not inherited, can't be overridden |
| Constructors       | Not inherited, not polymorphic |

---

## 🔹 Real-Life Analogy

Imagine an interface **RemoteControl** with a method `pressPowerButton()`. Whether you're using a **TV remote** or **AC remote**, when you press the power button, **each device behaves differently**—that's dynamic behavior based on the actual object!

---

## 🔹 Benefits of Dynamic Method Dispatch

- Promotes **flexibility and extensibility** in code.
- Enables **runtime polymorphism**, essential for frameworks, libraries, and APIs.
- Makes code easier to maintain and scale using **abstraction** and **inheritance**.

---

## 🔹 Summary

| Concept                  | Description |
|--------------------------|-------------|
| Type                     | Runtime Polymorphism |
| Based on                 | Overridden methods |
| Reference type           | Superclass |
| Actual object type       | Subclass |
| When resolved            | At runtime |
| Enables                  | Flexible and dynamic method behavior |

---

