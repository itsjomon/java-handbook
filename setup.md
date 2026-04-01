# Setup Java Locally

A quick guide to **installing Java**, setting up your environment, and running Java programs.

## Install JDK

1. Download the **Java Development Kit (JDK)** from [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/).  
2. Follow the installation instructions for your operating system.

## Set JAVA Environment Variable

Setting up the `JAVA_HOME` environment variable is essential for compiling and running Java programs.

- Follow this guide: [Setting Environment in Java](https://www.geeksforgeeks.org/java/setting-environment-java/)  

After setup, verify installation by running:

```bash
java -version
javac -version
```
## Running Java Code

- Using VS Code
    - Install the **Java Extension Pack** (by Microsoft) from the Extensions tab.
    - Open your `.java` file.
    - Click "Run" or use shortcut `Ctrl` + `F5` to execute.

- Using Command Line

    ```bash
    javac Main.java   # Compile
    java Main         # Run
    ```

> [!IMPORTANT]
> Important: The filename must match the public class name. For example, if your class is `public class Main`, save the file as `Main.java`. Java is case-sensitive.
