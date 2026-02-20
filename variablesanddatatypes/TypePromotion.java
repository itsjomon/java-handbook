package variablesanddatatypes;

public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b)); // Print the ASCII value of the character 'b'
        System.out.println((int)(a));
        System.out.println(b-a); // The char variables 'a' and 'b' are promoted to int before subtraction, and the result is of type int. The output will be the difference in their ASCII values, which is 1.

        int e = 10;
        float f = 5.5f;
        long g = 25;
        double h = 30;
        double result = e + f + g + h; // The whole expression is promoted to double because of the presence of double variable 'h'. The result will be of type double.
        System.out.println(result);

        byte c = 5;
        byte d = (byte) (c*2); // The expression c*2 promotes c to int, and the result is of type int. To assign it back to a byte variable d, we need to cast it back to byte. The output will be 10.
        System.out.println(d);
    }
}

/*
Type Promotion in Expressions:
1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
2. If one operand is long, float, or double the whole expression is promoted to long, float, or double respectively.

Example:
byte b = 5;
b = b*2; // This will cause an error because b*2 is promoted to int, and you cannot assign an int to a byte without casting. To fix this, you can cast the result back to byte:
byte b = 5;
b = (byte) (b*2); // This will work because we are explicitly casting the result back to byte.
 */
