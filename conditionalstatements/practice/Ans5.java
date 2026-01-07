package conditionalstatements.practice;

import java.util.Scanner;

public class Ans5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // if( year % 4 == 0) {
        //     if( year % 100 == 0) {
        //         if( year % 400 == 0) {
        //             System.out.println(year+" is a leap year");
        //         } else {
        //             System.out.println(year+" is not a leap year");
        //         }
        //     } else {
        //         System.out.println(year+" is a leap year");
        //     }
        // } else {
        //     System.out.println(year+" is not a leap year");
        // }



        if( year % 400 == 0) { // divisible by 400 is also divisible by 100 and 4
            System.out.println(year+" is a leap year");
        } else if (year % 100 == 0) {
            System.out.println(year+" is not a leap year");
        } else if (year % 4 == 0) { // not centurian
            System.out.println(year+" is a leap year");
        } else {
            System.out.println(year+" is not a leap year");
        }



        // boolean x = (year % 4) == 0;
        // boolean y = (year % 100) != 0;
        // boolean z= ((year % 100 == 0) && (year % 400 == 0));
        
        // if(x && (y || z)) {
        //     System.out.println(year+" is a leap year");
        // } else {
        //     System.out.println(year+" is not a leap year");
        // }

        sc.close();
    }
}
