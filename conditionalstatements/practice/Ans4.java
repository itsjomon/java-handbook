package conditionalstatements.practice;

public class Ans4 {
    public static void main(String[] args) {
        int a = 63, b = 36;

        boolean x = ( a < b)? true : false;
        int y = (a > b)? a : b;

        System.out.println(x);
        System.out.println(y);

    }
}

// Value of x = false & y = 63