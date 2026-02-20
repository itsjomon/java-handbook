package variablesanddatatypes;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String input = sc.next();
        // System.out.println(input);

        // String input = sc.nextLine();
        // System.out.println(input);

        // int num = sc.nextInt();
        // System.out.println(num);

        long num = sc.nextLong();
        System.out.println(num);
        
        sc.close();
    }
}

/*
Input in java:

next        - for single word input
nextLine    - for multiple words and sentences
nextInt     - for integer input
nextByte    - for byte input
nextFloat   - for float input
nextDouble  - for double input
nextBoolean - for boolean input (true/false)
nextShort   - for short input
nextLong    - for long integer input
 */
