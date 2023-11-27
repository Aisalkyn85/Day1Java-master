package org.example;

import java.util.Scanner;

public class MinOfThree {


























    /*The modulus operator `%` is used in programming to find the remainder of
    a division operation between two numbers. When you divide a number by another
     number, the modulus operation returns the remainder of that division. Here's
     how it works:

1. **Basic Example**: If you have `a % b`, where `a` and `b` are integers,
 the result is the remainder when `a` is divided by `b`.

   For instance:
   - `10 % 3` would return `1`, because when you divide 10 by 3, the quotient
   is 3 and the remainder is 1.
   - `17 % 5` would return `2`, because the division of 17 by 5 gives a
   quotient of 3 and a remainder of 2.

2. **Special Cases**:
   - If `a` is less than `b`, then `a % b` is `a`.
   - If `a` is a multiple of `b`, then `a % b` is `0`.

3. **Use in Programming**: It's commonly used in programming for tasks
like determining if a number is even or odd (e.g., `number % 2`), looping
through circular structures, or just dealing with periodicity in general.

4. **Language-specific Behavior**: The behavior of the modulus operator
can vary slightly depending on the programming language, especially when
 dealing with negative numbers.

In essence, the modulus operator is a tool for finding the remainder
in a division operation, and it has numerous practical applications
in various fields of computer science and mathematics.*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers");
        int digit19 = scanner.nextInt();
        int digit29 = scanner.nextInt();
        int digit39 = scanner.nextInt();

        if (digit19 <= digit29 && digit19 <= digit39) {
            System.out.println("The smallest number is: " + digit19);
        } else if (digit29 <= digit19 && digit29 <= digit39) {
            System.out.println("The smallest number is: " + digit29);
        } else {
            System.out.println("The smallest number is: " + digit39);
        }

        System.out.println("Please enter three numbers:");

        int digit1 = scanner.nextInt();//3
        int digit2 = scanner.nextInt();//4
        int digit3 = scanner.nextInt();//5

        if (digit1 <= digit2 && digit1 <= digit3) {//3<=4 && 3<=5
            System.out.println("The smallest number is: " + digit1);
            if (digit2 <= digit3) {//4<=5
                System.out.println("Second smallest: " + digit2);
                System.out.println("Largest: " + digit3);//5
            } else {
                System.out.println("Second smallest: " + digit3);
                System.out.println("Largest: " + digit2);
            }
        } else if (digit2 <= digit1 && digit2 <= digit3) {
            System.out.println("The smallest number is: " + digit2);
            if (digit1 <= digit3) {
                System.out.println("Second smallest: " + digit1);
                System.out.println("Largest: " + digit3);
            } else {
                System.out.println("Second smallest: " + digit3);
                System.out.println("Largest: " + digit1);
            }
        } else {
            System.out.println("The smallest number is: " + digit3);
            if (digit1 <= digit2) {
                System.out.println("Second smallest: " + digit1);
                System.out.println("Largest: " + digit2);
            } else {
                System.out.println("Second smallest: " + digit2);
                System.out.println("Largest: " + digit1);
            }
        }

       /* Task: Develop a program that converts temperature from Fahrenheit
        to Celsius or vice versa, based on user input.
                Hint: Ask the user which conversion they want to perform and use the
        appropriate formula. For Celsius to Fahrenheit, use F =9/5C+32
        Fahrenheit to Celsius, use C =9/5F-32*/
        System.out.println("Please chose type of conversion");
        System.out.println("1 choice: temperature in Fahrenheit");
        System.out.println("2 choice: temperature in Celsius");
        System.out.println("Please choose 1 or 2");
        int choice = scanner.nextInt();

        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice.");
        }

        System.out.print("Please enter the temperature: ");
        double temperature = scanner.nextDouble();
        double convertedTemperature;

        if (choice == 1) {
            // Convert from Celsius to Fahrenheit
            convertedTemperature = (9.0 / 5.0) * temperature + 32;
            System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
        } else {
            // Convert from Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5.0 / 9.0;
            System.out.println("Temperature in Celsius: " + convertedTemperature);
        }


   /* Traffic Light Simulator: Write a program that simulates a traffic light.
    The program takes a color (red, yellow, green) as input and gives an output like
    "stop", "caution", or "go".*/
        System.out.println("Please enter a color red, yellow or green");
        String color = scanner.next();
        if(color.equalsIgnoreCase("red")){
            System.out.println("Please stop");
        }else if(color.equalsIgnoreCase("yellow")){
            System.out.println("Please be caution");

        }else if(color.equalsIgnoreCase("green")){
            System.out.println("you can go");
        }else{
            System.out.println("invalid color");
        }
        /*Time of Day Greeting: Write a program that displays a different greeting
        based on the time of day (morning, afternoon, evening, night)
        entered by the user.*/

        System.out.println("Please enter time of the day");
        String timeOfTheDay = scanner.next();
        if(timeOfTheDay.equalsIgnoreCase("Morning")){
            System.out.println("Good morning: it is morning");
        }else if(timeOfTheDay.equalsIgnoreCase("afternoon")){
            System.out.println("Good afternoon: it is afternoon");
        }else if(timeOfTheDay.equalsIgnoreCase("evening")){
            System.out.println("Good evening: it is evening");
        }else if(timeOfTheDay.equalsIgnoreCase("night")){
            System.out.println("Good night: it is night");
        }else{
            System.out.println("invalid input");
        }
        /*Eligibility for Voting: Create a
        program that checks if a person is eligible to vote based on their age.*/

        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        if(age>=21){
            System.out.println("you eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
        /*Username and Password Validation:
Task: Write a program that checks if the entered username and password meet
specific criteria (e.g., username isn't empty and password length is at least
8 characters).*/

        System.out.println("Please enter username");
        String username = scanner.next();
        System.out.println("Please enter password");
        String password = scanner.next();
        if(!username.isEmpty() && password.length()>=8){
            System.out.println("your username and passwordis valid");
        }else{
            System.out.println("Username and password is invalid");
            if(username.isEmpty()){
                System.out.println("Username cannot be empty");
            }if(password.length() < 8){
                System.out.println("password must be at least 8 characters");
            }
        }
        /*Weather Advice Based on Temperature and Weather Condition:
Task: Write a program that gives clothing advice based on the temperature
 and whether it is raining or sunny (e.g., "Wear a coat" if below 15°C or
 "Take an umbrella" if it's raining).*/
        System.out.println("Please enter temperature in Celsius");
        int celsuis = scanner.nextInt();

        System.out.println("please enter weather condition.");
        String weatherCondition = scanner.next();
        if(celsuis < 15 && weatherCondition.equalsIgnoreCase("cold")){
            System.out.println("wear a coat");
        }else if(celsuis < 30 && weatherCondition.equalsIgnoreCase("raining")){
            System.out.println("Please take an umbrella");
        }else if(celsuis > 40 && weatherCondition.equalsIgnoreCase("it is how")){
            System.out.println("take a swimsuit");
        }else{
            System.out.println("Invalid data");
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


    }
}
