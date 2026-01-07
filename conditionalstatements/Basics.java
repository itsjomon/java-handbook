package conditionalstatements;

public class Basics {
    public static void main(String[] args) {

        // if else statement
        // int age = 16;
        // if (age >= 18) {
        //     System.out.println("adult");
        // }
        // if (age > 13 && age < 18) {
        //     System.out.println("teenager");
        // }
        // else {
        //     System.out.println("not adult");
        // }

        

        // else if statement
        // int age = 16;
        // if (age >= 18) {
        //     System.out.println("adult");
        // }
        // else if (age > 13 && age < 18) {
        //     System.out.println("teenager");
        // }
        // else {
        //     System.out.println("not adult");
        // }



        // Ternary Operator
        // int num = 4;
        // String type = ((num%2) == 0)? "even" : "odd";
        // System.out.println(type);



        // Switch Statement
        // int num = 2;
        // switch(num) {
        //     case 1 : System.out.println("tea");
        //         break;
        //     case 2 : System.out.println("cold water");
        //         break;
        //     case 3 : System.out.println("hot water");
        //         break;
        //     default: System.out.println("nothing");
        // }

        char ch = 'b';
        switch(ch) {
            case 'a' : System.out.println("tea");
                break;
            case 'b' : System.out.println("cold water");
                break;
            case 'c' : System.out.println("hot water");
                break;
            default: System.out.println("nothing");
        }
    }

}