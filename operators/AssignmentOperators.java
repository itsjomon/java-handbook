package operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        // a = a + 10;
        a += 10; // Faster execution 
        int b = 5;
        b *= 5; // Faster execution
        System.out.println(a); // 20
        System.out.println(b); // 25

    }
}

/*
Assignment Operators

| Operator | Description              |
|----------|--------------------------|
| =        | Assignment               |
| +=       | Add and assign           |
| -=       | Subtract and assign      |
| *=       | Multiply and assign      |
| /=       | Divide and assign        |
| %=       | Modulus and assign       |
 */
