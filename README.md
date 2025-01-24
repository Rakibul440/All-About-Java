# Java
Java programs are executed in a multi-step process that involves both compilation and interpretation. Here's a breakdown of how it works:

### 1. **Writing the Code (Source Code)**
   - You write the Java program in a file with the `.java` extension.

### 2. **Compilation (Source to Bytecode)**
   - The Java source code is compiled using the Java compiler (`javac`). 
   - The compiler converts the `.java` file into an intermediate form called **bytecode**. The bytecode is stored in a `.class` file. This bytecode is platform-independent, meaning it can run on any system that has a Java Virtual Machine (JVM) installed.
   
   Example:
   ```
   javac MyProgram.java
   ```
   This produces `MyProgram.class`.

### 3. **Execution (Bytecode to Machine Code)**
   - The JVM (Java Virtual Machine) is responsible for executing the bytecode. 
   - The JVM works in two key phases:
     - **Loading**: The JVM loads the `.class` files.
     - **Execution**: The JVM interprets the bytecode and either directly interprets it or compiles it further into native machine code through **Just-In-Time (JIT) compilation**.

     - **JIT Compilation**: The JVM may also use JIT compilation to convert bytecode into machine code at runtime, optimizing performance during the execution of the program.

### 4. **Java Runtime Environment (JRE)**
   - The JRE includes the JVM along with the libraries and other components required for running Java programs. When you run a Java program, you're using the JRE.

### 5. **Output**
   - Once the JVM executes the program, it produces the output as defined by the program (e.g., printed messages, results of calculations, etc.).

### Recap
- **Step 1**: Write Java code (`.java` file).
- **Step 2**: Compile the code (`javac` creates `.class` bytecode).
- **Step 3**: JVM loads and executes bytecode (interprets or JIT compiles it).

The key idea is that Java is platform-independent at the bytecode level. This is the "write once, run anywhere" principle, as the JVM abstracts away the details of the underlying hardware and operating system.