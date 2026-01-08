package loops;

public class ReverseNumber2 {
        public static void main(String[] args) {
        int n = 10899;
        int reversed = 0;

        while( n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n /= 10; // n = n / 10;
        }
        System.out.println(reversed);
    }
}

// Reverse the given number
// n = 10899