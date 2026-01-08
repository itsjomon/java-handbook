package loops.practice;

import java.util.*;

public class Ans3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("factorial doest exist for negative numbers");
        } else {
            long f = 1;

            for (int i = 1; i <= n; i++) {
                f *= i;
            }

            System.out.println("factorial of " + n + " is " + f);
        }
        sc.close();
    }
}
