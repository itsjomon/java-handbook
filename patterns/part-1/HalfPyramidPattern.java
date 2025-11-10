/*
print Half Pyramid pattern

1
1 2
1 2 3
1 2 3 4
 */

public class HalfPyramidPattern {
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
		System.out.println();
        }
	}
}

// ---------------------------------------------------

/*
1
2 3
4 5 6
7 8 9 10
 */

// public class HalfPyramidPattern {
//     public static void main(String[] args) {
//         int num = 1;
        
//         for (int i = 1; i <= 4; i++) { 
//             for (int j = 1; j <= i; j++) { 
//                 System.out.print(num + " ");
//                 num++; 
//             }
//             System.out.println();
//         }
//     }
// }