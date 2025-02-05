# String
In Java, the `String` class is a part of the `java.lang` package and is one of the most fundamental and widely used classes. The way the `String` class works "behind the scenes" involves several interesting concepts, especially related to **immutability**, **string interning**, and **efficient memory usage**. Here's a breakdown of how the `String` class is designed internally:

### 1. **Immutability**
- Strings in Java are **immutable**, meaning once a `String` object is created, its value cannot be changed. Any modification (such as concatenation or replacement) creates a **new String** object rather than modifying the original one.
- Immutability allows strings to be **shared safely** among different parts of a program without worrying about unexpected modifications.

#### How it works:
- When you perform operations like `str = str + "new"`, a new `String` object is created, and the old string is left unchanged.
  
For example:
```java
String str1 = "Hello";
String str2 = str1 + " World"; // This creates a new String object
```
In the background, `str1 + " World"` results in the creation of a new `String` object that contains `"Hello World"`. The original `str1` still holds `"Hello"`.

### 2. **String Pool (Interning)**
- Java maintains a special pool of strings called the **String Pool** (also known as the **String Literal Pool**). When you create a string using a string literal (e.g., `"Hello"`), Java checks the String Pool to see if that string already exists.
- If the string is already in the pool, Java uses the existing string object instead of creating a new one. This helps save memory, as duplicate string literals are not created.
  
#### How it works:
```java
String s1 = "Hello";
String s2 = "Hello"; // This references the same object in the String Pool
System.out.println(s1 == s2); // Outputs: true
```

If a string is created dynamically (e.g., `new String("Hello")`), it’s not automatically placed in the String Pool. You can use the `intern()` method to explicitly add a string to the pool.

```java
String s1 = new String("Hello");
String s2 = s1.intern(); // This places "Hello" into the String Pool
```

### 3. **String Representation and Internal Structure**
Internally, a `String` object in Java is backed by a **char array**. The `String` class uses an array of `char` values to store the characters in the string. In older versions of Java, it was a `char[]` array, but starting from Java 9, `String` uses a `byte[]` array and an encoding scheme for improved memory usage (UTF-16 by default).

#### Older versions (before Java 9):
In versions prior to Java 9, the internal structure of `String` looked like this:
```java
private final char[] value;
```
Where `value` is a `char[]` that holds the characters of the string.

#### Java 9 and later:
In Java 9 and beyond, the internal representation has been optimized to use a `byte[]` array with **encoding**, reducing memory consumption:
```java
private final byte[] value;
```
This means that instead of using two bytes per character (which was required for UTF-16 encoding), strings are now more efficient, especially for characters that can fit within a single byte (such as ASCII characters).

### 4. **String Hashing and Performance**
Java strings are **hashed** for performance reasons, especially when used in hash-based collections like `HashMap`. The hash code for a string is computed by multiplying each character’s Unicode value by prime numbers and combining them. This allows fast lookups in hash-based data structures.

```java
public int hashCode() {
    int h = hash;
    if (h == 0 && value.length > 0) {
        char val[] = value;
        for (int i = 0; i < value.length; i++) {
            h = 31 * h + val[i];
        }
        hash = h;
    }
    return h;
}
```
In this code, the `hashCode` method uses the **multiplying-by-31 technique**, which is a well-known method for efficiently generating hash codes.

### 5. **String Comparisons**
When comparing two strings, the `String` class uses the `equals()` method to compare the values (characters) of the strings, and `==` to compare object references (memory addresses). Here's how it works:

- `==` checks if two `String` objects are the **same object** in memory.
- `equals()` checks if two strings have the **same characters** (value equality), regardless of whether they are the same object or not.

### 6. **String Concatenation Efficiency**
- Concatenating strings using the `+` operator is **not efficient** in a loop because it creates many intermediate `String` objects.
- Internally, string concatenation with `+` uses a `StringBuilder` (or `StringBuffer` if thread-safe operations are required) to improve performance, avoiding the creation of unnecessary temporary `String` objects.

For example, the following code:
```java
String str = "Hello";
for (int i = 0; i < 10; i++) {
    str = str + " World";
}
```
Will be optimized to use a `StringBuilder` behind the scenes:
```java
StringBuilder sb = new StringBuilder("Hello");
for (int i = 0; i < 10; i++) {
    sb.append(" World");
}
String str = sb.toString();
```

### 7. **String Methods and Performance**
- Many of the methods in the `String` class (like `substring()`, `toLowerCase()`, `toUpperCase()`, etc.) create new `String` objects due to immutability.
- For example, calling `substring()` on a string returns a new string, not a reference to part of the original string, because the original string cannot be modified.

```java
String str = "Hello, World!";
String sub = str.substring(7, 12); // This creates a new String "World"
```

### Conclusion:
Behind the scenes, Java's `String` class is designed for both **memory efficiency** and **performance** through the use of:
- **String Pool** (interning),
- **Immutability** for thread safety and predictability,
- Optimized internal storage (`char[]` or `byte[]`),
- **Efficient hashing** for fast comparisons in hash-based collections.

