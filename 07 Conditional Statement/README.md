# Conditional Statement
Conditional statements in Java allow you to execute different blocks of code depending on whether a specific condition is true or false. These statements are crucial for controlling the flow of the program based on different conditions.

Here are the main types of conditional statements in Java:

### 1. **if statement**
The `if` statement evaluates a condition (expression) and, if the condition is true, it executes a block of code. If the condition is false, it skips that block of code.

```java
if (condition) {
    // block of code executed if condition is true
}
```

**Example:**

```java
int age = 18;
if (age >= 18) {
    System.out.println("You are an adult.");
}
```

### 2. **if-else statement**
The `if-else` statement is used when you want to execute one block of code if the condition is true, and another block of code if the condition is false.

```java
if (condition) {
    // block of code executed if condition is true
} else {
    // block of code executed if condition is false
}
```

**Example:**

```java
int age = 16;
if (age >= 18) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are not an adult.");
}
```

### 3. **if-else if-else statement**
This is used when there are multiple conditions to check. Each condition is evaluated in sequence, and the block of code corresponding to the first `true` condition is executed. If none of the conditions are true, the final `else` block is executed.

```java
if (condition1) {
    // block of code executed if condition1 is true
} else if (condition2) {
    // block of code executed if condition2 is true
} else {
    // block of code executed if neither condition1 nor condition2 is true
}
```

**Example:**

```java
int marks = 75;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Grade D");
}
```

### 4. **switch statement**
The `switch` statement is an alternative to using many `if-else if` statements. It is used to select one of many code blocks to be executed based on a variable’s value.

```java
switch (expression) {
    case value1:
        // block of code executed if expression == value1
        break;
    case value2:
        // block of code executed if expression == value2
        break;
    // more cases...
    default:
        // block of code executed if no cases match
}
```

The `break` keyword is used to terminate the `switch` statement. If `break` is omitted, the code will continue to execute subsequent `case` blocks (this is called "fall-through").

**Example:**

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

### 5. **ternary operator (conditional operator)**
The ternary operator is a shorthand way of writing an `if-else` statement. It has the following syntax:

```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

This operator evaluates the `condition` and assigns `valueIfTrue` to `variable` if the condition is true, or `valueIfFalse` if the condition is false.

**Example:**

```java
int age = 18;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result);
```

### Key Points:
- **Comparison Operators**: These are used to compare values in conditional statements. Examples include `==`, `!=`, `<`, `>`, `<=`, `>=`.
  
- **Logical Operators**: These are used to combine multiple conditions. Examples include `&&` (AND), `||` (OR), `!` (NOT).

- **Nested Conditional Statements**: You can also nest conditional statements within each other to create more complex decision-making logic.

```java
int a = 5;
int b = 10;
if (a > 0) {
    if (b > 0) {
        System.out.println("Both a and b are positive");
    }
}
```

### Conclusion:
Conditional statements are one of the most important features of Java, allowing you to control the flow of your program based on various conditions. Mastering `if`, `else`, `switch`, and the ternary operator gives you the flexibility to make decisions and execute different code depending on those decisions.