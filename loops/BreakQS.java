package loops;

import java.util.Scanner;

public class BreakQS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("enter your number: ");
            int n = sc.nextInt();
            
            if ( n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);

        sc.close();
    }
}

// Keep entering numbers till user enters a multiple of 10