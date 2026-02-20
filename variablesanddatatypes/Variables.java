package variablesanddatatypes;

public class Variables {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        
        String name ="Jomon";
        System.out.println(name);

        a = 50; // In this case the value of a will be updated to 50 and b remains the same as 5, a = 50
        System.out.println(a);

        a = b; // In this case the value of b will be stored in a and b remains the same as 5, a = 5
        System.out.println(a);
    }
}

/*
A variable is a container that holds a value. It has a name and a type. The type of a variable determines what kind of data it can hold, such as integers, floating-point numbers, characters, or strings.

In Java, you must declare a variable before you can use it. The declaration includes the type of the variable and its name. You can also assign a value to the variable at the time of declaration or later in the code.

A literal is a fixed value that is directly written in the code, such as 10, 5, or "Jomon". A variable is a named container that can hold a value, and an identifier is the name given to a variable, method, class, or other entity in Java.

For example, in the expression 2*(a + b), 2 is a literal, while a and b are variables (and identifiers).
 */
