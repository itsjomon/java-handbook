/*
print Character pattern

A
B C
D E F
G H I J
 */

public class CharacterPattern {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i =1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

// ---------------------------------------------------

/*
A
A B
A B C
A B C D
 */

// public class CharacterPattern {
//     public static void main(String[] args) {
//         for (int i =1; i <= 4; i++) {
//             char ch = 'A';
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(ch + " ");
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }