package variablesanddatatypes;

public class TypeCasting {
    public static void main(String[] args) {
        float a = 25.12f;
        int b = (int) a;  // float -> int (truncates the decimal part)
        System.out.println(b); // This will print the truncated value: 25

        char ch = 'a';
        int number = ch; // char -> int (ASCII value of 'a' is 97)
        System.out.println(number); // Print the ASCII value of the character 'a'
    }
}

// Type Casting is also known as narrowing/explicit conversion.
