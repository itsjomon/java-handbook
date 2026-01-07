package conditionalstatements.practice;

import java.util.Scanner;

public class Ans1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x");
        int x = sc.nextInt();
        
        if(x > 0) {
            System.out.println("x is a positive number");
        }
        else if ( x == 0) {
            System.out.println("x is neither postive nor negative");
        }
        else {
            System.out.println("x is a negative number");
        }

        sc.close();
    }
}
