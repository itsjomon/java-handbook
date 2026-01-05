package variablesanddatatypes;

public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);

        byte c = 5;
        byte d = (byte) (c*2);
        System.out.println(d);

    }
}

/*
Type Promotion in Expressions
1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
2. If one operand is long, float, or double the whole expression is promoted to long, float, or double respectively.
*/
