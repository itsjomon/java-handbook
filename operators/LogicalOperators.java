package operators;

public class LogicalOperators {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //logical and
        System.out.println((3>2) && (5>0)); // true
        System.out.println((3<2) && (4>1)); // false

        //logical or
        System.out.println((3>2) || (5>0)); // true
        System.out.println((3<2) || (4>1)); // true
        System.out.println((1>2) || (4<1)); // false

        //logical not
        System.out.println(!(5>0)); // false
    }
}

/*
Logical Operators

| Operator | Description   | Example         |
|----------|---------------|-----------------|
| &&       | Logical AND   | a > 5 && b < 10 |
| ||       | Logical OR    | a > 5 || b < 10 |
| !        | Logical NOT   | !isTrue         |

&& (Logical AND)
| Statement 1 | Statement 2 | Result |
|-------------|-------------|--------|
| T           | T           | T      |
| T           | F           | F      |
| F           | T           | F      |
| F           | F           | F      |

|| (Logical OR)
| Statement 1 | Statement 2 | Result |
|-------------|-------------|--------|
| T           | T           | T      |
| T           | F           | T      |
| F           | T           | T      |
| F           | F           | F      |

! (Logical NOT)
| Statement | Result |
|-----------|--------|
| T         | F      |
| F         | T      |

 */
