# Practice Questions (Variables and Data Types)

- **Qs 1.** In a program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers.

  (**Hint:** Average of N numbers is sum of those numbers divided by N)

- **Qs 2.** In a program, input the side of a square. You have to output the area of the square.

  (**Hint:** area of a square is (side x side))

- **Qs 3.** Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.

  (**Add on:** You can also try adding 18% gst tax to the items in the bill as an advanced problem)

- **Qs 4.** What will be the type of result in the following Java code?

  ```java
  byte b = 4;
  char c ='a';
  short s = 512;
  int i = 1000;
  float f = 3.14f;
  double d = 99.9954;
  
  result = (f * b) + (i % c) - (d * s);
  
  // (Hint: Look at the largest data type among these)

  // Answer: In the mentioned code, the result variable will be of `double` type because of type conversion
  ```

- **Qs 5.** (Advanced) Will the following statement give any error in Java?

  ```java
  int $ = 24;

  // Answer: No, the statement will not give any error. Names of variables are called identifiers in Java. Identifier rule says, identifiers can start with any alphabet or underscore (“_”) or dollar (“$”). According to the rule the given variable name is a valid identifier.
  ```