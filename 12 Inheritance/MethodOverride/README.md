## 🔸 What is Method Overriding?

**Method Overriding** is when a **subclass provides its own implementation** of a method that is already defined in its **superclass**.

This is a form of **runtime polymorphism**, because the method that gets executed is determined at **runtime**, based on the object type.

---

## 🔹 Key Points of Method Overriding

| Feature                    | Description                                                                 |
|----------------------------|-----------------------------------------------------------------------------|
| Inheritance                | Must be a parent-child (superclass-subclass) relationship.                  |
| Same Method Signature      | Method name and parameter list must be exactly the same.                    |
| Return Type                | Must be the same or a **covariant type** (child class of the return type).  |
| Access Modifier            | Cannot be more restrictive than the overridden method.                      |
| Final/Static/Private       | These methods **cannot be overridden**.                                     |
| @Override Annotation       | Optional but recommended to indicate overriding.                            |

---

## 🔹 Example of Method Overriding

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog(); // Polymorphism
        a.makeSound();        // Output: Dog barks
    }
}
```

> ✅ Even though the reference is of type `Animal`, the method of `Dog` is executed.

---

## 🔹 Access Modifier Rules

- You **cannot reduce** the visibility of the method while overriding.

```java
// Superclass
public class A {
    protected void display() { }
}

// Subclass
public class B extends A {
    // Error if you try: private void display() { } ❌
    public void display() { } // ✔️ More visible
}
```

---

## 🔹 Return Type Rules

- The return type must be **same** or **covariant** (i.e., subclass of the original return type).

```java
class Animal {
    Animal getAnimal() {
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Dog getAnimal() { // Covariant return type
        return new Dog();
    }
}
```

---

## 🔹 Static, Final, and Private Methods

| Modifier      | Can it be Overridden? |
|---------------|------------------------|
| `static`      | ❌ No (it gets hidden, not overridden) |
| `final`       | ❌ No |
| `private`     | ❌ No (not visible to subclass) |

```java
class A {
    static void greet() {
        System.out.println("Hello from A");
    }
}

class B extends A {
    static void greet() {
        System.out.println("Hello from B");
    }
}
```

> This is **method hiding**, not overriding.

---

## 🔹 Using `super` Keyword

You can call the parent class version of the method using `super`.

```java
class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    void show() {
        super.show(); // Calls Parent's show
        System.out.println("Child show");
    }
}
```

---

## 🔹 Real-Life Analogy

Imagine a **general class** like `Vehicle` with a method `startEngine()`. A `Car` and a `Bike` will both **override** this method to provide their own way of starting the engine.

---

## 🔹 Summary Table: Overloading vs Overriding

| Feature             | Overloading                          | Overriding                            |
|---------------------|--------------------------------------|----------------------------------------|
| Inheritance         | Not required                         | Required (inheritance necessary)       |
| Method Signature    | Must be different                    | Must be the same                       |
| Return Type         | Can be different                     | Same or covariant                      |
| Access Modifier     | No restriction                       | Cannot reduce visibility               |
| Polymorphism Type   | Compile-time (static)                | Runtime (dynamic)                      |
| `@Override`         | Not used                             | Recommended                            |

---

