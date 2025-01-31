# bitwise operators
In Java, **bitwise operators** perform operations on individual bits of integer data types (`byte`, `short`, `int`, and `long`). They are useful for tasks like flag manipulation, setting specific bits, or performing efficient numerical operations.

### List of Bitwise Operators in Java:

1. **AND (`&`)**: 
   - Compares each corresponding bit of two operands. If both bits are `1`, the result is `1`; otherwise, the result is `0`.
   ```java
   5 & 3   // 0101 & 0011 = 0001 -> result is 1
   ```

2. **OR (`|`)**: 
   - Compares each corresponding bit of two operands. If at least one of the bits is `1`, the result is `1`; otherwise, the result is `0`.
   ```java
   5 | 3   // 0101 | 0011 = 0111 -> result is 7
   ```

3. **XOR (`^`)**: 
   - Compares each corresponding bit of two operands. If the bits are different, the result is `1`; if they are the same, the result is `0`.
   ```java
   5 ^ 3   // 0101 ^ 0011 = 0110 -> result is 6
   ```

4. **Complement (`~`)**: 
   - Flips all the bits of the operand (inverts `1` to `0` and `0` to `1`).
   ```java
   ~5      // 0101 -> 1010 -> result is -6 (in 2's complement representation)
   ```

5. **Left Shift (`<<`)**: 
   - Shifts the bits of a number to the left by the specified number of positions. This effectively multiplies the number by `2` for each shift.
   ```java
   5 << 1  // 0101 << 1 = 1010 -> result is 10
   ```

6. **Right Shift (`>>`)**: 
   - Shifts the bits of a number to the right by the specified number of positions. This effectively divides the number by `2` for each shift, with the sign bit (leftmost bit) being preserved for signed numbers.
   ```java
   5 >> 1  // 0101 >> 1 = 0010 -> result is 2
   ```

7. **Unsigned Right Shift (`>>>`)**:
   - Shifts the bits of a number to the right, but without preserving the sign bit (useful for unsigned numbers).
   ```java
   -5 >>> 1  // 11111111111111111111111111111011 >>> 1 -> 01111111111111111111111111111101 -> result is a large positive value
   ```

### Example Code:

```java
public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5;  // 0101
        int b = 3;  // 0011

        // AND
        System.out.println("a & b: " + (a & b));  // 0001 -> 1

        // OR
        System.out.println("a | b: " + (a | b));  // 0111 -> 7

        // XOR
        System.out.println("a ^ b: " + (a ^ b));  // 0110 -> 6

        // NOT (Complement)
        System.out.println("~a: " + (~a));  // 1010 -> -6

        // Left shift
        System.out.println("a << 1: " + (a << 1));  // 1010 -> 10

        // Right shift
        System.out.println("a >> 1: " + (a >> 1));  // 0010 -> 2

        // Unsigned Right shift
        System.out.println("-5 >>> 1: " + (-5 >>> 1));  // Large positive value
    }
}
```

### Explanation of Bitwise Operations:
- **`&` (AND)**: Only sets bits to `1` when both bits are `1`.
- **`|` (OR)**: Sets bits to `1` if either bit is `1`.
- **`^` (XOR)**: Sets bits to `1` if one of the bits is `1`, but not both.
- **`~` (NOT)**: Flips all the bits.
- **`<<` (Left Shift)**: Shifts bits to the left, padding with `0`s on the right.
- **`>>` (Right Shift)**: Shifts bits to the right, preserving the sign bit for signed numbers.
- **`>>>` (Unsigned Right Shift)**: Shifts bits to the right without preserving the sign bit (always pads with `0`s).

These operators are efficient for tasks like manipulating individual bits, checking or modifying flags, and optimizing performance-critical code (like cryptographic algorithms, image processing, etc.).

