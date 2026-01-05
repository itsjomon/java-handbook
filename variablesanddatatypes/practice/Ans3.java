package variablesanddatatypes.practice;

import java.util.*;

public class Ans3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        System.out.println("Bill is :" + total);

        //Add on - with 18% tax
        float newtotal = total + (0.18f * total);

        System.out.println("Bill with 18% tax: " + newtotal);
        sc.close();

    }
}
