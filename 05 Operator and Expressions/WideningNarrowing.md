# widening And narrowing
In Java, **widening** and **narrowing** refer to the processes of **type conversion** between primitive data types. These conversions are necessary because different primitive types have different sizes and ranges. 

### 1. **Widening Conversion (Implicit Type Casting)**

**Widening** refers to **automatically converting** a smaller data type to a larger one. This happens automatically in Java because it’s a **safe** conversion, meaning there’s no risk of losing data. This is known as **implicit type casting**.

Widening occurs when:
- A **smaller** data type is converted to a **larger** data type.
- The range of the destination type is greater than or equal to the range of the source type.

#### Examples of Widening:
- **byte → short → int → long → float → double**

For example:
```java
public class WideningExample {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;     // byte to short (widening)
        int i = s;       // short to int (widening)
        long l = i;      // int to long (widening)
        float f = l;     // long to float (widening)
        double d = f;    // float to double (widening)

        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
    }
}
```

### Output:
```
Byte value: 10
Short value: 10
Int value: 10
Long value: 10
Float value: 10.0
Double value: 10.0
```

In this example:
- **`byte`** is automatically converted to **`short`**.
- **`short`** is converted to **`int`**.
- **`int`** is converted to **`long`**.
- **`long`** is converted to **`float`**.
- **`float`** is converted to **`double`**.

### 2. **Narrowing Conversion (Explicit Type Casting)**

**Narrowing** refers to **manually converting** a larger data type to a smaller one. This type of conversion **isn't safe** and **may result in loss of data** (for example, when converting from `double` to `int`, the fractional part will be lost). 

To perform narrowing, you need to **explicitly cast** the larger data type to the smaller one. This is done using **casting syntax**: `(target_type)`.

#### Examples of Narrowing:
- **double → float → long → int → short → byte**

For example:
```java
public class NarrowingExample {
    public static void main(String[] args) {
        double d = 123.45;
        float f = (float) d;  // double to float (narrowing)
        long l = (long) f;    // float to long (narrowing)
        int i = (int) l;      // long to int (narrowing)
        short s = (short) i;  // int to short (narrowing)
        byte b = (byte) s;    // short to byte (narrowing)

        System.out.println("Double value: " + d);
        System.out.println("Float value: " + f);
        System.out.println("Long value: " + l);
        System.out.println("Int value: " + i);
        System.out.println("Short value: " + s);
        System.out.println("Byte value: " + b);
    }
}
```

### Output:
```
Double value: 123.45
Float value: 123.45
Long value: 123
Int value: 123
Short value: 123
Byte value: 123
```

In this example:
- **`double`** is explicitly cast to **`float`**.
- **`float`** is cast to **`long`**.
- **`long`** is cast to **`int`**.
- **`int`** is cast to **`short`**.
- **`short`** is cast to **`byte`**.

#### Important Notes:
- **Data Loss**: Narrowing conversions can lead to data loss (e.g., converting `long` to `int` might cause the loss of large values).
- **Manual Intervention**: In narrowing, the programmer must handle any potential issues like overflow or truncation.

### Key Differences Between Widening and Narrowing:
| Aspect             | Widening (Implicit)                      | Narrowing (Explicit)                          |
|--------------------|-----------------------------------------|----------------------------------------------|
| **Direction**       | From a smaller type to a larger type    | From a larger type to a smaller type         |
| **Casting**         | No explicit casting needed              | Requires explicit casting (e.g., `(int)`)    |
| **Risk**            | No data loss                            | Risk of data loss (e.g., precision loss)    |
| **Safety**          | Safe, no risk of losing data            | Risky, may lose information                 |
| **Types**           | byte → short → int → long → float → double | double → float → long → int → short → byte  |

### Example of Data Loss in Narrowing:
If we try to convert a large `double` to an `int`, the fractional part and possibly some of the integer part may be lost.

```java
public class DataLossExample {
    public static void main(String[] args) {
        double d = 12345.6789;
        int i = (int) d;  // narrowing conversion
        System.out.println("Original double value: " + d); // 12345.6789
        System.out.println("Narrowed int value: " + i);    // 12345
    }
}
```

### Output:
```
Original double value: 12345.6789
Narrowed int value: 12345
```

In this case, the fractional part `.6789` is lost when narrowing from `double` to `int`.

### Summary:
- **Widening**: Automatically converts a smaller type to a larger type without data loss. It’s done implicitly and is safe.
- **Narrowing**: Converts a larger type to a smaller type but may result in data loss (like truncating decimal values or overflowing ranges). It requires explicit casting and needs to be handled carefully.

