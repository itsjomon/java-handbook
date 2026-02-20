package variablesanddatatypes;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 25;
        long b = a;
        System.out.println(b);
    }
}

/*
Type conversion is also known as Implicit/Widening conversion.

Conversion happens when :
1. type compatible
2. destination type > source type

byte -> short -> int -> float -> long -> double
 */
