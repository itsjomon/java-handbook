package loops;

import java.util.Scanner;

public class ContinueQS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("enter your number: ");
            int n = sc.nextInt();

            if ( n % 10 == 0) {
                continue;
            }
            System.out.println("number was : " + n);
        } while (true);

        // sc.close(); // Scanner is not closed here because the loop runs forever (unreachable code)
    }
}

// Display all numbers entered by user except multiples of 10

// Continue Statement
