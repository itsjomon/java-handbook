# LOOPS QUESTIONS

- **Qs 1**: How many times 'Hello' is printed?
    ```java
    public class Solution {
        public static void main(String[] args) {
            for(int i = 0; i < 5; i++) {
                System.out.println("Hello");
                i+=2;
            }
        }
    }

    // Ans:  2 times
    ```
    
- **Qs 2**: Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

- **Qs 3**: Write a program to find the factorial of any number entered by the user.

    (**Hint** : factorial of a number n = n*(n-1)*(n-2)*(n-3)*......*1 and exists for positive numbers only. We write factorial as n! <br>
    So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on. <br>
    Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)

- **Qs 4**: Write a program to print the multiplication table of a number N, entered by the user.
    
- **Qs 5**: What is wrong in the following program?
    ```java
    public class Solution {
        public static void main(String[] args) {
            for(int i = 0; i <= 5; i++ ) {
                System.out.println("i = " + i);
            }
            System.out.println("i after the loop = " + i );
        }
    }

    // Ans: i is out of scope after the loop, it cannot be accessed after the loop ends.
    ```