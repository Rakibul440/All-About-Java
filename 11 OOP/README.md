# Object-Oriented Programming

### **Object-Oriented Programming (OOP) in Java**

Object-Oriented Programming (OOP) is a programming paradigm that organizes software design around objects rather than functions and logic. Java is a **pure object-oriented language** (except for primitive types) and follows four main principles of OOP:

## **1. Principles of OOP in Java**

### **1.1 Encapsulation**
Encapsulation is the mechanism of wrapping data (variables) and methods (functions) together as a single unit. It helps in data hiding and security.

#### **Example of Encapsulation**
```java
class Student {
    private String name;  // Private variable (data hiding)

    // Setter method to set value
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get value
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John"); 
        System.out.println(s.getName()); // Output: John
    }
}
```

### **1.2 Inheritance**
Inheritance allows a class to acquire the properties and behavior of another class. It promotes reusability.

#### **Example of Inheritance**
```java
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Inherited method
        dog.bark();      // Own method
    }
}
```

### **1.3 Polymorphism**
Polymorphism allows objects to be treated as instances of their parent class. It enables method overloading and overriding.

#### **Method Overloading (Compile-time Polymorphism)**
```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(5, 10));      // Calls int version
        System.out.println(obj.add(5.5, 10.5));  // Calls double version
    }
}
```

#### **Method Overriding (Runtime Polymorphism)**
```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cat(); // Upcasting
        a.makeSound(); // Calls Cat's makeSound() method
    }
}
```

### **1.4 Abstraction**
Abstraction hides implementation details and only shows the necessary features.

#### **Abstract Class Example**
```java
abstract class Vehicle {
    abstract void start(); // Abstract method (without implementation)

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start(); // Car's implementation
        v.stop();  // Inherited method
    }
}
```

#### **Interface Example**
```java
interface Animal {
    void eat(); // Abstract method
}

class Cow implements Animal {
    public void eat() {
        System.out.println("Cow eats grass");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cow();
        a.eat();
    }
}
```

---

## **2. OOP Features in Java**

### **2.1 Classes and Objects**
A **class** is a blueprint for objects, while an **object** is an instance of a class.

#### **Example**
```java
class Car {
    String brand;
    int speed;

    void showDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.speed = 120;
        c1.showDetails();
    }
}
```

### **2.2 Constructors**
Constructors initialize an object when it is created.

#### **Example**
```java
class Car {
    String brand;
    
    // Constructor
    Car(String b) {
        brand = b;
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW");
        c1.display();
    }
}
```

### **2.3 Static Keyword**
- `static` variables and methods belong to the class, not instances.

#### **Example**
```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
    }
}
```
**Output:**
```
Count: 1
Count: 2
Count: 3
```

---

## **3. Advantages of OOP in Java**
✅ Code Reusability (using Inheritance)  
✅ Encapsulation (Security & Data Hiding)  
✅ Polymorphism (Flexibility & Maintainability)  
✅ Abstraction (Reduces Complexity)  
