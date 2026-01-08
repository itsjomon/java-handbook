package loops;

import java.util.Scanner;

public class SunOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum+=i;
            i++;
        }
        System.out.println(sum);
        
        sc.close();
    }
}

// Print sum of first n natural numbers