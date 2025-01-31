# Merging And Masking

Bit **merging** and **masking** are common operations when manipulating individual bits in data, often used for tasks like encoding, compression, or managing flags and bit fields.

Let's go through these concepts:

### 1. **Bit Merging**

Bit merging involves combining multiple smaller sets of bits into one larger set, effectively packing multiple values into a single variable. This can be useful when you need to store multiple pieces of information compactly.

#### Example: Merging Two 4-bit Values into an 8-bit Value
Imagine you have two 4-bit values:
- `a = 0101` (binary) (which is `5` in decimal)
- `b = 1100` (binary) (which is `12` in decimal)

To **merge** these two values into a single 8-bit value, you can use bitwise operations.

```java
int a = 5;  // 0101 in binary
int b = 12; // 1100 in binary

// Merge `a` and `b` into a single 8-bit value
int merged = (a << 4) | b;  // Shift `a` left by 4 bits and OR with `b`

System.out.println("Merged: " + Integer.toBinaryString(merged));  // Output: 01011100 (binary) -> 92 (decimal)
```

#### Explanation:
- `a << 4`: Shifts `a` left by 4 bits, so `0101` becomes `01010000` (in binary).
- `a << 4 | b`: The bitwise OR combines `01010000` with `1100` (which is `00001100`), resulting in `01011100`.

So, the merged result is `01011100` (which is `92` in decimal).

### 2. **Bit Masking**

Bit masking is the process of using a **mask** (a bit pattern) to isolate, modify, or check specific bits in a value. It's commonly used for:
- **Extracting** specific bits.
- **Setting** certain bits to `1` or `0`.
- **Flipping** specific bits.

A **mask** is typically a number where some bits are set to `1` (the bits you want to keep or manipulate), and others are set to `0` (the bits you want to ignore).

#### Common Bit Masking Operations:

- **AND Masking (`&`)**: Use an AND operation with a mask to extract specific bits.
- **OR Masking (`|`)**: Use an OR operation with a mask to set specific bits to `1`.
- **XOR Masking (`^`)**: Use XOR to toggle specific bits.
- **NOT Masking (`~`)**: Inverts bits to flip specific bits in a number.

#### Example 1: Extracting Specific Bits Using a Mask

Suppose you have an 8-bit value `01101011` (which is `107` in decimal) and you want to extract the last 4 bits.

```java
int value = 107;   // 01101011 in binary
int mask = 0x0F;   // 00001111 in binary (mask for the last 4 bits)

int result = value & mask;  // Perform bitwise AND

System.out.println("Extracted bits: " + Integer.toBinaryString(result));  // Output: 1011 (binary) -> 11 (decimal)
```

#### Explanation:
- `mask = 0x0F` (which is `00001111` in binary) has `1`s in the positions of the bits we want to extract.
- `value & mask`: The AND operation will keep the last 4 bits of `value` and set the rest to `0`.

In this case, the result is `1011` (binary) or `11` (decimal), which is the last 4 bits of the original value.

#### Example 2: Setting Specific Bits Using a Mask

Suppose you want to **set the 3rd bit** (from the right) of the number `value = 1100` (which is `12` in decimal) to `1`, even if it’s already `0`.

```java
int value = 12;    // 1100 in binary
int mask = 0x04;   // 0100 in binary (mask to set the 3rd bit)

int result = value | mask;  // Perform bitwise OR

System.out.println("Modified value: " + Integer.toBinaryString(result));  // Output: 11100 (binary) -> 28 (decimal)
```

#### Explanation:
- `mask = 0x04` (which is `0100` in binary) targets the 3rd bit.
- `value | mask`: The OR operation sets the 3rd bit of `value` to `1`.

The result is `11100` (binary) or `28` (decimal), where the 3rd bit is now `1`.

#### Example 3: Toggling Specific Bits Using a Mask

If you want to **toggle** (flip) a specific bit, you can use the XOR (`^`) operator.

```java
int value = 12;    // 1100 in binary
int mask = 0x04;   // 0100 in binary (mask to toggle the 3rd bit)

int result = value ^ mask;  // Perform bitwise XOR

System.out.println("Toggled value: " + Integer.toBinaryString(result));  // Output: 1000 (binary) -> 8 (decimal)
```

#### Explanation:
- `mask = 0x04` (which is `0100` in binary) targets the 3rd bit.
- `value ^ mask`: The XOR operation flips the 3rd bit of `value`.

The result is `1000` (binary) or `8` (decimal), where the 3rd bit has been toggled from `1` to `0`.

### Summary of Bitwise Operations in Masking and Merging:
- **Bit Merging**: Combines smaller bit fields into a larger one using shifts and bitwise OR.
- **Bit Masking**:
  - **Extract bits**: Use bitwise AND with a mask.
  - **Set bits**: Use bitwise OR with a mask.
  - **Toggle bits**: Use bitwise XOR with a mask.
  - **Clear bits**: Use bitwise AND with the complement of a mask.
  - **Flip bits**: Use bitwise NOT.

Bitwise operations are efficient and very useful when dealing with hardware-related programming, embedded systems, or when performance is critical.

