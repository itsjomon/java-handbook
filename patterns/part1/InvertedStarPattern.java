/*
print Inverted Star pattern

* * * * 
* * *
* *
*

 */

package patterns.part1;

public class InvertedStarPattern {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
