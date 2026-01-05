package variablesanddatatypes.practice;

import java.util.*;

public class Ans1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        double average = (A + B + C) * (1.0) / 3;

        System.out.println("Average is: " + average);
        sc.close();

    }
}
