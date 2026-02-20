package patterns.part1;

public class CharacterPattern {
    public static void main(String[] args) {
        // Pattern 1:
        char ch = 'A';
        for (int line = 1; line <= 4; line++) {
            for (int Chars = 1; Chars <= line; Chars++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        // Pattern 2:
        for (int line = 1; line <= 4; line++) {
            char chInLine = (char) ('A' + line - 1);
            for (int charsInLine = 1; charsInLine <= line; charsInLine++) {
                System.out.print(chInLine + " ");
            }
            System.out.println();
        }

        // Pattern 3:
        for(int line = 1; line <= 4; line++) {
            char ch3 = 'D';
            for(int charInLine = 1; charInLine <= line; charInLine++) {
                System.out.print(ch3 + " ");
                ch3--;
            }
            System.out.println();
        }
    }
}

/*
print the following Character patterns:

Pattern 1:
A
B C
D E F
G H I J

Pattern 2:
A 
B B 
C C C 
D D D D

Pattern 3:
D 
D C 
D C B 
D C B A 
 */
