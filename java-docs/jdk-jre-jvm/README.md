# Java: JDK vs JRE vs JVM  

Java applications rely on three essential components, each with a distinct purpose:

- **JDK (Java Development Kit):** Provides the tools and libraries needed to **develop** Java programs. Includes the **JRE**, compiler (`javac`), debugger, and other development tools.
- **JRE (Java Runtime Environment):** Required to **run** Java programs. Includes the **JVM** and standard Java class libraries.
- **JVM (Java Virtual Machine):** Executes Java **bytecode** on any platform. Converts bytecode into machine-specific code, manages memory, and ensures code safety.

> **Note:** Java bytecode is platform-independent, but JVM implementations are platform-dependent for each operating system.

## JDK (Java Development Kit)

The **JDK** is required for building Java applications.

**Includes**
- Java compiler (`javac`)
- Debugger & developer tools (`jdb`, `jar`, `javadoc`, etc.)
- **JRE** = JVM + libraries

**Used For**
- Writing `.java` files  
- Compiling to `.class` bytecode  
- Debugging, documenting, packaging apps  

> Developers need JDK. End users do not.

## JRE (Java Runtime Environment)

The **JRE** provides everything needed to **run** Java programs.

**Contains**
- **JVM**
- Standard Java class libraries

**Used For**
- Loading bytecode  
- Verifying bytecode  
- Running Java applications  

> The JRE cannot compile Java code. It only runs it.

## JVM (Java Virtual Machine)

The **JVM** is responsible for executing Java bytecode on any machine.

**Responsibilities**
- Converts bytecode to machine-specific code  
- Executes Java applications  
- Manages memory and garbage collection  
- Ensures bytecode safety (verification)  
- Provides runtime optimizations (JIT), **JIT** Compiler improves performance by converting frequently executed bytecode into **native machine code at runtime**.

**Execution Flow**
1. ClassLoader loads `.class` files  
2. Bytecode Verifier ensures safety  
3. Interpreter or JIT translates bytecode  
4. Execution engine runs native code  

## JDK vs JRE vs JVM

| Component | What It Is | Purpose | Includes | Platform Dependency |
|----------|------------|----------|-----------|----------------------|
| **JDK** (Java Development Kit) | Full development kit | Develop, compile, debug Java programs | JRE + development tools (`javac`, `jar`, `javadoc`) | Yes |
| **JRE** (Java Runtime Environment) | Runtime environment | Run Java applications | JVM + standard libraries | Yes |
| **JVM** (Java Virtual Machine) | Execution engine | Executes Java bytecode | Part of JRE/JDK | Yes (varies per OS) |
