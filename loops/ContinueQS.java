package loops;

import java.util.Scanner;

public class ContinueQS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your number (0 to exit): ");
            int n = sc.nextInt();
            
            // Check for exit condition first
            if (n == 0) {
                System.out.println("Exiting program...");
                break;
            }
            
            if (n % 10 == 0) {
                continue;  // Skip multiples of 10
            }
            
            System.out.println("Number was: " + n);
        } while (true);
        
        sc.close();
    }
}

// Display all numbers entered by user except multiples of 10
