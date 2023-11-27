package day2;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

















        /*An "if-else" statement is a fundamental concept in programming used for decision-making. It allows the program to execute different code blocks based on certain conditions. Here's a basic explanation:

1. **If Statement**: This is the primary decision-making structure. The program evaluates a condition (typically a comparison between variables or values). If the condition is true, the code block inside the 'if' statement is executed. If the condition is false, the program skips this block.

2. **Else Statement**: This is used in conjunction with an 'if' statement. It specifies a block of code to be executed if the condition in the 'if' statement is false.

Here's a simple example in pseudocode:

```plaintext
if (condition is true) {
    // Code to execute if the condition is true
} else {
    // Code to execute if the condition is false
}
```

In practice, it looks something like this in a real programming language like Python:

```python
if temperature > 30:
    print("It's a hot day.")
else:
    print("It's not a hot day.")
```

In this example, if the value of `temperature` is greater than 30, the program prints "It's a hot day." Otherwise, it prints "It's not a hot day."

The "if-else" structure is essential for making programs adaptable to different situations and inputs.*/
        /*Task: Write a program that asks the user to enter a number
        and then prints out whether the number is even or odd.
Hint: Use the modulus operator (%) to check if the number is divisible by 2.
*/

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Please enter a number from 1 to 10");
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("this is even number");
        }else{
            System.out.println("this is odd number");
        }
        /*Task: Create a program that asks for a student's mark
        (0-100) and classifies it into a grade (A, B, C, D, E, F).
Hint: Use a series of if-else statements to check ranges (e.g., 90-100 for 'A', 80-89 for 'B', etc.).
< less then, > greater then*/

        System.out.println("Please enter your mark");
        int grade = scanner.nextInt();

        if(grade >=90 && grade<=100){
            System.out.println("Your grade is 'A'");
        } else if(grade >=80 && grade<=89){
            System.out.println("Your grade is 'B'");
        }

        /*Leap Year Checker:
Task: Create a program to check whether a given year (input from the user) is a leap year or not.
Hint: A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
*/
        System.out.println("Please enter a year");
        int year = scanner.nextInt();
        if((year%4==0 && year%100 != 0) || (year%400==0)){
            System.out.println(year+ " This is leap year");
        } else{
            System.out.println(year +" This is not leap year");
        }

        /*Simple Calculator:
Task: Develop a basic calculator that asks the user for two numbers
 and an operation (add, subtract, multiply, divide) and then performs the operation.
Hint: Use if-else statements to execute the operation based on the user's choice.*/

        System.out.println("Please enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Enter an operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        if (operation == '+') {
            System.out.println("Result: " + (number1 + number2));
        } else if (operation == '-') {
            System.out.println("Result: " + (number1 - number2));
        } else if (operation == '*') {
            System.out.println("Result: " + (number1 * number2));
        } else if (operation == '/') {
            // Check for division by zero
            if (number2 != 0) {
                System.out.println("Result: " + (number1 / number2));
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operation");
        }

        /*Minimum of Three Numbers:
Task: Write a program that takes three numbers as input and prints out the smallest of the three.
Hint: Compare the first number with the second and the third,
then compare the second and the third if necessary.*/
        System.out.println("please enter three number");
        int digit1 = scanner.nextInt();
        int digit2 = scanner.nextInt();
        int digit3 = scanner.nextInt();

        if (digit1 <= digit2 && digit1 <= digit3) {
            System.out.println("The smallest number is: " + digit1);
        } else if (digit2 <= digit1 && digit2 <= digit3) {
            System.out.println("The smallest number is: " + digit2);
        } else {
            System.out.println("The smallest number is: " + digit3);
        }
    /*Age Group Classifier:
Task: Create a program that asks for a person's age and classifies them into
categories (e.g., toddler, child, teenager, adult).
Hint: Use if-else statements to check the age and categorize accordingly
(e.g., 0-2 years as toddler, 3-12 as child, etc.).*/

        System.out.println("Please enter your age");
        int ageOfPerson = scanner.nextInt();

        if (ageOfPerson >= 0 && ageOfPerson <= 2) {
            System.out.println("You are a toddler");
        } else if (ageOfPerson >= 3 && ageOfPerson <= 12) {
            System.out.println("You are a child");
        } else if (ageOfPerson >= 13 && ageOfPerson <= 19) {
            System.out.println("You are a teenager");
        } else if (ageOfPerson >= 20) {
            System.out.println("You are an adult");
        } else {
            System.out.println("Invalid age");
        }

        /*Basic Authentication:
Task: Write a simple program that simulates a login process.
Ask the user for a username and password, and compare them to pre-stored values.
Hint: If the username and password match the stored values,
print a welcome message; otherwise, indicate that the login failed.*/

        final String storedUsername = "admin";
        final String storedPassword = "password123";

        System.out.println("Please enter username and password");
        String username = scanner.next();
        String password = scanner.next();

        if (username.equals(storedUsername) && password.equals(storedPassword)) {
            System.out.println("Login successful. Welcome!");
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }

        /*emperature Converter:
Task: Develop a program that converts temperature from Fahrenheit
to Celsius or vice versa, based on user input.
Hint: Ask the user which conversion they want to perform and use the
appropriate formula. For Celsius to Fahrenheit, use F =9/5C+32
Fahrenheit to Celsius, use C =9/5F-32


*/





    }
}
