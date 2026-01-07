package conditionalstatements;

import java.util.Scanner;

public class IncomeTaxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inc  = sc.nextInt();
        int tax;

        if (inc < 500000) {
            tax = 0;
        }
        else if (inc >= 500000 && inc < 1000000) {
            tax = (int) (inc * 0.2);
        }
        else {
            tax = (int) (inc * 0.3);
        }
        System.out.println("your tax is: " + tax);
        sc.close();
    }
}


/*
Income Tax Calculator

income < 5L
0% tax

income between 5-10L
20% tax

income > 10L
30% tax
 */