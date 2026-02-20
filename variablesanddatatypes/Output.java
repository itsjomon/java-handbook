package variablesanddatatypes;

public class Output {
    public static void main(String[] args) {
        System.out.print("Hello World! 1"); // Prints "Hello World! 1" without moving to a new line
        
        System.out.println("Hello World! 2"); // Prints "Hello World! 2" and moves to the new line
        System.out.println("Hello World 3");
        
        System.out.print("Hello World! 4\n"); // Prints "Hello World! 4" and moves to the new line
        System.out.print("Hello World! 5\n");

        System.out.print("Hello World! 6\nHello Earth!"); // Adds a new line inside the string
    }
}

/*
Output Methods:

In Java, there are two primary methods for outputting text to the console: System.out.print() and System.out.println().

System.out.print() prints text without moving to a new line.

System.out.println() prints text and moves to a new line after printing.

You can also include a newline character (\n) in a string to move to a new line when using System.out.print().
 */
