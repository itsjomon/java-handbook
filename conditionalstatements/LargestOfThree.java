package conditionalstatements;

public class LargestOfThree {
    public static void main(String[] args) {
        int A = 1, B = 3, C = 6;

        if (A >= B && A >= C) {
            System.err.println("A");
        }
        else if (B >= C) {
            System.err.println("B");
        }
        else {
            System.err.println("C");
        }
    }
}

// print the largest of 3
// A = 1, B = 3, C = 6