package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // int A = 10;
        // int B = 10;
        // System.out.println(A==B);  // true
        // System.out.println(A!=B);  // false

        int A = 10;
        int B = 5;
        System.out.println(A==B);  // false
        System.out.println((A > B)); // true
        System.out.println((B > A)); // false
        System.out.println((B >= A)); // false
        
    }
}

/*
Relational Operators

| Operator | Description                | Example     |
|----------|----------------------------|-------------|
| ==       | Equal to                   | a == b      |
| !=       | Not equal to               | a != b      |
| >        | Greater than               | a > b       |
| <        | Less than                  | a < b       |
| >=       | Greater than or equal to   | a >= b      |
| <=       | Less than or equal to      | a <= b      |

*/