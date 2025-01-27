In Java, arithmetic operators are used to perform mathematical operations such as addition, subtraction, multiplication, division, and modulus. These operators are applied to numeric data types like `int`, `float`, `double`, `long`, etc.

### Arithmetic Operators in Java:

| Operator | Description                 | Example  |
|----------|-----------------------------|----------|
| `+`      | Addition                    | `a + b`  |
| `-`      | Subtraction                 | `a - b`  |
| `*`      | Multiplication              | `a * b`  |
| `/`      | Division (returns quotient) | `a / b`  |
| `%`      | Modulus (returns remainder) | `a % b`  |

### Example of Arithmetic Operators in Java:

```java
public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum); // Output: 15

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference); // Output: 5

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product); // Output: 50

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // Output: 2

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // Output: 0
    }
}
```

### Arithmetic Expressions in Java:
An **expression** in Java is any valid combination of operators, variables, and constants that results in a value. An arithmetic expression involves using the arithmetic operators to manipulate numerical values.

For example, consider the expression:

```java
int result = (a + b) * c / d - e;
```

This expression performs addition, multiplication, division, and subtraction in sequence, following the operator precedence (multiplication and division before addition and subtraction).

### Operator Precedence in Java:
When evaluating an expression, operators are executed based on precedence, and parentheses can be used to change the order of operations. Here’s the order of precedence (highest to lowest):

1. Parentheses `()`
2. Multiplication `*`, Division `/`, Modulus `%`
3. Addition `+`, Subtraction `-`

So in the expression `(a + b) * c / d - e`, the addition will happen first, followed by multiplication and division, and subtraction will be performed last.

