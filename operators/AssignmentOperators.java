package operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        // a = a + 10;
        a += 10; //faster execution 
        int b = 5;
        b *= 5; //faster execution
        System.out.println(a); // 20
        System.out.println(b); // 25

    }
}

/*
Assignment Operators

| Operator | Description              | Example   |
|----------|--------------------------|-----------|
| =        | Assignment               | a = b     |
| +=       | Add and assign           | a += b    |
| -=       | Subtract and assign      | a -= b    |
| *=       | Multiply and assign      | a *= b    |
| /=       | Divide and assign        | a /= b    |
| %=       | Modulus and assign       | a %= b    |

*/