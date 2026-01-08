package loops;

import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " not a prime number");
            }
        }

        sc.close();
    }
}

// Check if a number is prime or not
// prime: 2, 3, 5, 7, 11, etc...