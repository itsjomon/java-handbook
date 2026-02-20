package loops;

public class LoopBasics {
    public static void main(String[] args) {
        
        // while Loop
        // int counter = 1;
        // while(counter <= 100) {
        //     System.out.println("Hello World!");
        //     counter++;
        // }


        // for Loop
        // for(int i=1; i <= 10; i++) {
        //     System.out.println("Hello World!");
        // }


        // do while Loop
        // int counter = 1;
        // do {
        //     System.out.println("Hello World!");
        //     counter++;
        // } while (counter <= 10);


        // Break Statement
        // for (int i=1; i<=5; i++) {
        //     if(i == 3) {
        //         break; // Exit the loop when i is 3
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("Out of the loop");


        // Continue Statement
        for (int i=1; i<=5; i++) {
            if(i == 3) {
                continue; // Skip 3 and continue with the next iteration
            }
            System.out.println(i);
        }
    }
}