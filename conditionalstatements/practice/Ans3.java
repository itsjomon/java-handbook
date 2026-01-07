package conditionalstatements.practice;

import java.util.Scanner;

public class Ans3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week number (1-7): ");
        int day = sc.nextInt();
        
        switch(day) {
            case 1: // day == 1
                System.out.println("Monday");
                break;
            case 2: // day == 2
                System.out.println("Tuesday");
                break;
            case 3: // day == 3
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            case 7: 
                System.out.println("Sunday");
                break;
            default: 
                System.out.println("Invalid input! Please enter week number between 1 - 7.");
        }

        sc.close();
    }
}
