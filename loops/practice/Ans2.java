package loops.practice;

import java.util.*;

public class Ans2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of total inputs: ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while(n > 0) {
            int currNum = sc.nextInt();

            if (currNum % 2 == 0){
                evenSum = evenSum + currNum;
            } else {
                oddSum = oddSum + currNum;
            }

            n--;
        }
        
        System.out.println("sum of even nums: " + evenSum);
        System.out.println("sum of odd nums: " + oddSum);
        sc.close();
    }
}
