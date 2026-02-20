package patterns.part1;

public class HalfPyramidPattern {
	public static void main(String[] args) {
		// Pattern 1:
		for(int line = 1; line <= 4; line++) {
			for(int num = 1; num <= line; num++) {
				System.out.print(num + " ");
			}
		System.out.println();
        }

		// Pattern 2:
		for(int line = 1; line <= 4; line++) {
			for(int num = 1; num <= line; num++) {
				if(num % 2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("1 ");
				}
			}
		System.out.println();
		}

		// Pattern 3:
		for(int line = 1; line <= 4; line++) {
			for(int space = 1; space <= 4 - line; space++) {
				System.out.print("  ");
			}
			for(int num = 1; num <= line; num++) {
				System.out.print(num + " ");
			}
		System.out.println();
		}
	}
}

/*
print the following Half-Pyramid patterns:

Pattern 1:
1
1 2
1 2 3
1 2 3 4

Pattern 2:
1 
1 0 
1 0 1 
1 0 1 0 

Pattern 3:
      1 
    1 2 
  1 2 3 
1 2 3 4 
 */