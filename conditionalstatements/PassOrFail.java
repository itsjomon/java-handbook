package conditionalstatements;

public class PassOrFail {
    public static void main(String[] args) {
        int marks = 54;

        String reportcard = (marks >= 33)? "pass" : "fail";
        System.out.println(reportcard);
    }
}

// check if a student will pass or fail using ternary operator
// marks >= 33 : pass
// marks < 33 : fail