# Loops
In Java, loops are used to execute a block of code repeatedly based on a condition. There are several types of loops in Java, each serving a specific purpose for different situations. The four main types of loops in Java are:

1. **For Loop**
2. **While Loop**
3. **Do-While Loop**
4. **Enhanced For Loop (for-each loop)**

Let’s go over each type of loop in detail:

---

###  1. **For Loop**
The `for` loop is generally used when the number of iterations is known beforehand. It consists of three parts:
- **Initialization**: Initializes a variable before the loop starts.
- **Condition**: The loop continues as long as this condition evaluates to `true`.
- **Update**: This part updates the loop variable after each iteration.

#### Syntax:
```java
for (initialization; condition; update) {
    // code block to be executed
}
```

#### Example:
```java
public class ForLoopExample {
    public static void main(String[] args) {
        // Loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
```

**Output:**
```
1
2
3
4
5
```

#### Explanation:
- `int i = 1`: Initializes the loop variable `i` to 1.
- `i <= 5`: The loop runs as long as `i` is less than or equal to 5.
- `i++`: Increments the loop variable `i` by 1 after each iteration.

---

### 2. **While Loop**
The `while` loop is used when you want to repeat an action as long as a specific condition is `true`. The condition is checked before entering the loop, so if the condition is `false` initially, the code inside the loop may not execute at all.

#### Syntax:
```java
while (condition) {
    // code block to be executed
}
```

#### Example:
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        
        // Loop to print numbers from 1 to 5
        while (i <= 5) {
            System.out.println(i);
            i++;  // Increment i
        }
    }
}
```

**Output:**
```
1
2
3
4
5
```

#### Explanation:
- The condition `i <= 5` is checked before each iteration. As long as it's `true`, the loop continues.
- `i++` increases the value of `i` after each iteration.

---

### 3. **Do-While Loop**
The `do-while` loop is similar to the `while` loop, but it checks the condition **after** the code block is executed. This guarantees that the code inside the loop will execute at least once, even if the condition is `false` initially.

#### Syntax:
```java
do {
    // code block to be executed
} while (condition);
```

#### Example:
```java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        
        // Loop to print numbers from 1 to 5
        do {
            System.out.println(i);
            i++;  // Increment i
        } while (i <= 5);
    }
}
```

**Output:**
```
1
2
3
4
5
```

#### Explanation:
- The code inside the `do` block runs first, and then the condition `i <= 5` is checked.
- Since the condition is checked after the loop body, the loop will always run at least once.

---

### 4. **Enhanced For Loop (For-Each Loop)**
The enhanced `for` loop (also known as the "for-each" loop) is used to iterate over arrays or collections like lists, sets, or other collections in Java. It simplifies the syntax when you don't need to access the index of the elements but simply want to loop through them.

#### Syntax:
```java
for (Type variable : arrayOrCollection) {
    // code block to be executed
}
```

#### Example with Array:
```java
public class ForEachLoopExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Loop to print each number in the array
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
```

**Output:**
```
1
2
3
4
5
```

#### Example with List:
```java
import java.util.List;
import java.util.ArrayList;

public class ForEachLoopWithList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // Loop to print each name in the list
        for (String name : names) {
            System.out.println(name);
        }
    }
}
```

**Output:**
```
Alice
Bob
Charlie
```

#### Explanation:
- The enhanced `for` loop iterates over each element in the array or collection and assigns it to the variable (`number` or `name` in the examples).

---

### Breaking and Continuing in Loops

- **`break`**: Exits the loop entirely, regardless of the condition.
  
  Example with `break`:
  ```java
  for (int i = 1; i <= 5; i++) {
      if (i == 3) {
          break;  // Exit loop when i is 3
      }
      System.out.println(i);
  }
  ```

  **Output:**
  ```
  1
  2
  ```

- **`continue`**: Skips the current iteration and moves to the next iteration of the loop.

  Example with `continue`:
  ```java
  for (int i = 1; i <= 5; i++) {
      if (i == 3) {
          continue;  // Skip iteration when i is 3
      }
      System.out.println(i);
  }
  ```

  **Output:**
  ```
  1
  2
  4
  5
  ```

---

### When to Use Each Type of Loop:
1. **For Loop**: Use when you know the number of iterations in advance (e.g., iterating through a fixed-size array).
2. **While Loop**: Use when you don't know the number of iterations in advance but know the condition for continuing (e.g., keep reading until end of file).
3. **Do-While Loop**: Use when you want to ensure the loop runs at least once, regardless of the condition (e.g., asking for user input).
4. **Enhanced For Loop**: Use when iterating over collections or arrays when you don't need the index of the elements.

### Conclusion:
Loops are fundamental in programming and allow you to execute repetitive tasks efficiently. Understanding when and how to use the different types of loops in Java—such as the traditional `for` loop, the conditional `while` loop, the post-execution `do-while` loop, and the simplified enhanced `for-each` loop—will make your code more readable and efficient.