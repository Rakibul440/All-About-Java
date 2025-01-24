The **`Scanner`** class in Java provides several methods to read different types of input from various sources, such as keyboard input, files, or other input streams. Below is a comprehensive list of the most commonly used methods in the `Scanner` class:

### 1. **Basic Input Methods**
These methods allow you to read data from the input stream.

- **`next()`**: Scans and returns the next token (word) in the input as a string.
  ```java
  String token = scanner.next();  // Reads the next token (word)
  ```

- **`nextLine()`**: Scans the next line of input (including spaces) and returns it as a string.
  ```java
  String line = scanner.nextLine();  // Reads a full line of input
  ```

- **`nextInt()`**: Scans the next token of the input as an integer.
  ```java
  int num = scanner.nextInt();  // Reads an integer
  ```

- **`nextDouble()`**: Scans the next token of the input as a double.
  ```java
  double num = scanner.nextDouble();  // Reads a double
  ```

- **`nextFloat()`**: Scans the next token of the input as a float.
  ```java
  float num = scanner.nextFloat();  // Reads a float
  ```

- **`nextLong()`**: Scans the next token of the input as a long.
  ```java
  long num = scanner.nextLong();  // Reads a long
  ```

- **`nextShort()`**: Scans the next token of the input as a short.
  ```java
  short num = scanner.nextShort();  // Reads a short
  ```

- **`nextByte()`**: Scans the next token of the input as a byte.
  ```java
  byte num = scanner.nextByte();  // Reads a byte
  ```

- **`nextBoolean()`**: Scans the next token of the input as a boolean (`true` or `false`).
  ```java
  boolean flag = scanner.nextBoolean();  // Reads a boolean
  ```

- **`nextLine()`**: Reads the entire line of input including spaces.
  ```java
  String line = scanner.nextLine();  // Reads the full line of input
  ```

---

### 2. **Checking the Input**
These methods are used to check whether there is another token or line to read.

- **`hasNext()`**: Returns `true` if there is another token in the input.
  ```java
  boolean hasNext = scanner.hasNext();  // Checks if there is another token
  ```

- **`hasNextLine()`**: Returns `true` if there is another line in the input.
  ```java
  boolean hasNextLine = scanner.hasNextLine();  // Checks if there is another line
  ```

- **`hasNextInt()`**: Returns `true` if the next token can be interpreted as an integer.
  ```java
  boolean hasInt = scanner.hasNextInt();  // Checks if next token is an integer
  ```

- **`hasNextDouble()`**: Returns `true` if the next token can be interpreted as a double.
  ```java
  boolean hasDouble = scanner.hasNextDouble();  // Checks if next token is a double
  ```

- **`hasNextBoolean()`**: Returns `true` if the next token can be interpreted as a boolean.
  ```java
  boolean hasBoolean = scanner.hasNextBoolean();  // Checks if next token is a boolean
  ```

---

### 3. **Skipping Input**
These methods allow you to skip certain portions of the input.

- **`skip(String pattern)`**: Skips the next input that matches the given pattern (regular expression).
  ```java
  scanner.skip("[0-9]+");  // Skips numbers in the input
  ```

- **`skip(Pattern pattern)`**: Skips the next input that matches the given `Pattern`.
  ```java
  scanner.skip(Pattern.compile("\\d+"));  // Skips digits
  ```

---

### 4. **Delimiters**
These methods allow you to specify and manage the input delimiters (the characters that separate tokens).

- **`useDelimiter(String pattern)`**: Sets a custom delimiter pattern to split tokens.
  ```java
  scanner.useDelimiter(",");  // Use comma as the delimiter
  ```

- **`useDelimiter(Pattern pattern)`**: Sets a custom delimiter pattern (regular expression) for splitting tokens.
  ```java
  scanner.useDelimiter(Pattern.compile("\\s*,\\s*"));  // Use comma as a delimiter with optional spaces around it
  ```

- **`reset()`**: Resets the delimiter pattern to its default value (whitespace).
  ```java
  scanner.reset();  // Resets the delimiter to default (whitespace)
  ```

---

### 5. **Resource Management**
These methods are used to manage the resource handling of the `Scanner` class.

- **`close()`**: Closes the scanner. After closing, it can no longer be used for reading input.
  ```java
  scanner.close();  // Closes the scanner
  ```

- **`hasNextByte()`**: Returns `true` if the next token is a byte.
  ```java
  boolean hasByte = scanner.hasNextByte();  // Checks if the next token is a byte
  ```

---

### 6. **File Input**
`Scanner` can also be used to read data from files.

- **`Scanner(File source)`**: Constructs a `Scanner` object that reads from a specified file.
  ```java
  File file = new File("example.txt");
  Scanner fileScanner = new Scanner(file);  // Creates a scanner to read from a file
  ```

- **`Scanner(InputStream source)`**: Constructs a `Scanner` object that reads from an `InputStream` (like `System.in`, or a file input stream).
  ```java
  InputStream inputStream = new FileInputStream("example.txt");
  Scanner inputStreamScanner = new Scanner(inputStream);  // Creates a scanner to read from an InputStream
  ```

- **`Scanner(Path source)`**: Constructs a `Scanner` object that reads from a file via a `Path` object.
  ```java
  Path path = Paths.get("example.txt");
  Scanner pathScanner = new Scanner(path);  // Creates a scanner to read from a Path
  ```

---

### 7. **Other Methods**
Other methods provide basic utility for working with input.

- **`findInLine(String pattern)`**: Finds the first input that matches the pattern and returns it as a string.
  ```java
  String match = scanner.findInLine("\\d+");  // Finds the first number in the line
  ```

- **`findInLine(Pattern pattern)`**: Finds the first input matching the pattern and returns it as a string.
  ```java
  String match = scanner.findInLine(Pattern.compile("\\d+"));  // Finds the first match of digits in the line
  ```

- **`next(Pattern pattern)`**: Scans the next token of input that matches the specified pattern.
  ```java
  String token = scanner.next(Pattern.compile("[a-zA-Z]+"));  // Finds the next word
  ```

---

### Summary of Commonly Used Methods:
- **`next()`**: Read the next token (word).
- **`nextLine()`**: Read the entire line of input.
- **`nextInt()`**: Read the next integer.
- **`nextDouble()`**: Read the next double.
- **`nextBoolean()`**: Read the next boolean.
- **`hasNext()`**: Check if there is another token.
- **`hasNextLine()`**: Check if there is another line.
- **`hasNextInt()`**, **`hasNextDouble()`**: Check if the next token is an integer or double.
- **`useDelimiter()`**: Set a custom delimiter for tokenizing input.
- **`close()`**: Close the scanner.

The `Scanner` class is a versatile utility for reading user input and parsing data, and these methods provide flexible ways to handle a variety of input sources and formats.