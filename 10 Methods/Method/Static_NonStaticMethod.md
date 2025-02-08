### **Static vs. Non-Static Methods in Java** 🚀  

In Java, **methods** can be classified as **static** and **non-static** based on how they are associated with the class and objects. Let's break them down with examples.

---

## **1. Static Methods**  

### **Definition:**  
A **static method** belongs to the **class itself**, not to any specific object. You can call it **without creating an object**.

### **Syntax:**
```java
class Example {
    static void show() { // Static method
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        Example.show(); // Calling without an object
    }
}
```
**Output:**
```
This is a static method.
```

### **Key Features of Static Methods:**
✅ Belongs to the class, not an instance (object).  
✅ Can be called using the class name.  
✅ Cannot access **non-static** (instance) variables or methods directly.  
✅ Can be used for **utility functions** (e.g., `Math.sqrt()`).  

---

### **2. Non-Static Methods (Instance Methods)**  

### **Definition:**  
A **non-static method** is tied to an **object** of the class. You must create an **instance (object)** to call it.

### **Syntax:**
```java
class Example {
    void display() { // Non-static method
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        Example obj = new Example(); // Creating an object
        obj.display(); // Calling non-static method
    }
}
```
**Output:**
```
This is a non-static method.
```

### **Key Features of Non-Static Methods:**
✅ Belongs to an **instance** (object).  
✅ Requires an **object** to be called.  
✅ Can access both **static and non-static members** of the class.  
✅ Used when **data varies per object** (e.g., employee details, bank account info).  

---

## **3. Differences Between Static and Non-Static Methods**

| Feature           | Static Method  | Non-Static Method |
|------------------|---------------|------------------|
| **Belongs to**   | Class          | Object (instance) |
| **Called using** | `ClassName.method()` | `object.method()` |
| **Can access static variables?** | ✅ Yes | ✅ Yes |
| **Can access non-static variables?** | ❌ No | ✅ Yes |
| **Requires object?** | ❌ No | ✅ Yes |
| **Can be overridden?** | ❌ No | ✅ Yes |
| **Common Use Case** | Utility methods (e.g., `Math.pow()`) | Object-specific operations |

---

## **4. Example Demonstrating Static vs. Non-Static Methods**

```java
class Example {
    static int staticVar = 10; // Static variable
    int nonStaticVar = 20; // Non-static variable

    // Static method
    static void staticMethod() {
        System.out.println("Static method called.");
        System.out.println("StaticVar: " + staticVar);
        // System.out.println(nonStaticVar); ❌ Error: Cannot access non-static variables
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("Non-static method called.");
        System.out.println("StaticVar: " + staticVar); // ✅ Allowed
        System.out.println("NonStaticVar: " + nonStaticVar);
    }

    public static void main(String[] args) {
        // Calling static method
        Example.staticMethod(); // ✅ Called without an object

        // Calling non-static method
        Example obj = new Example();
        obj.nonStaticMethod(); // ✅ Requires an object
    }
}
```
**Output:**
```
Static method called.
StaticVar: 10
Non-static method called.
StaticVar: 10
NonStaticVar: 20
```

---

## **5. When to Use Static vs. Non-Static Methods?**
| Scenario | Use Static Method | Use Non-Static Method |
|----------|----------------|------------------|
| If the method **does not depend on instance variables** | ✅ | ❌ |
| If the method **modifies or uses instance variables** | ❌ | ✅ |
| If you need a **utility function** (e.g., `Math.pow()`) | ✅ | ❌ |
| If the method behavior **varies per object** | ❌ | ✅ |

---

## **6. Can a Static Method Call a Non-Static Method?**
❌ **No, a static method cannot call a non-static method directly.**
```java
class Example {
    void nonStaticMethod() {
        System.out.println("Non-static method called.");
    }

    static void staticMethod() {
        // nonStaticMethod(); ❌ Error: Cannot call non-static method directly
    }
}
```
✅ **Solution:** Create an object and call it.
```java
static void staticMethod() {
    Example obj = new Example();
    obj.nonStaticMethod(); // ✅ Now it works
}
```

---

## **7. Can a Non-Static Method Call a Static Method?**
✅ **Yes, a non-static method can call a static method directly.**
```java
class Example {
    static void staticMethod() {
        System.out.println("Static method called.");
    }

    void nonStaticMethod() {
        staticMethod(); // ✅ Static method can be called directly
    }
}
```

---

### **Summary**
- **Static methods** → Belong to the **class**, don’t need an object, can only access static variables.  
- **Non-static methods** → Belong to an **instance (object)**, can access both static and non-static members.

