package variablesanddatatypes;

public class DataTypes {
    public static void main(String[] args) {
        byte b = 8;
        System.out.println("Byte value: " + b); // Byte value: 8

        char ch = 'a';
        System.out.println("Char value: " + ch);

        boolean var = false;
        System.out.println("Boolean value: " + var);

        float price = 10.5f;
        System.out.println("Float value: " + price);

        int num = 25;
        System.out.println("Int value: " + num);

        long largeNum = 123456789L;
        System.out.println("Long value: " + largeNum); // long is for large whole numbers (integers), like 10000000000L

        double preciseNum = 99.99999;
        System.out.println("Double value: " + preciseNum); // double is for decimal numbers with high precision, like 3.14159265358979

        short n = 240;
        System.out.println("Short value: " + n);
    }
}

// Data Types (Primitive and Non-Primitive)

/*
Primitive Data Types:
1. byte    : 1 byte   - Small whole numbers (–128 to 127)
2. short   : 2 bytes  - Medium whole numbers (–32,768 to 32,767)
3. int     : 4 bytes  - Standard whole numbers (~ –2B to 2B)
4. long    : 8 bytes  - Large whole numbers (use L at the end)
5. float   : 4 bytes  - Decimal numbers, less precision (use f)
6. double  : 8 bytes  - Precise decimal numbers (default for decimals)
7. char    : 2 bytes  - Single character (e.g., 'a', 'Z', '@')
8. boolean : 1 byte   - true or false
*/

/*
Non-Primitive Data Types:
1. String     : Sequence of characters (e.g., "Hello")
2. Array      : Collection of elements of the same type
3. Class      : Blueprint for creating objects
4. Object     : Instance of a class
5. Interface  : Abstract type that defines methods to implement
*/