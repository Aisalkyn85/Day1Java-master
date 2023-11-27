package day3;

import java.util.Scanner;

public class ElseIfContinue {

    public static void main(String[]args){
        /*The modulus operator '%' is used in programming language to find the
        * remainder. 10%3=9= 1(modulus)  20/9=2= 2(remainder)
        *
        * */

        // Please create a program (Input from the user) take three digits, and print from small to large
        // 3,4,5 3 is smallest number, 4 second small, 5 large number

       Scanner scaner = new Scanner(System.in);
      /*  System.out.println("Please enter three numbers");
        int number1 = scaner.nextInt();
        int number2 = scaner.nextInt();
        int number3 = scaner.nextInt();

        if(number1 <= number2 && number1 <=number3){
            System.out.println("this is smallest number "+number1);
            if(number2 <=number3){
                System.out.println("second smallest number "+number2);
                System.out.println("largest number "+number3);
            }else{
                System.out.println("second smallest "+number3);
                System.out.println("largest "+2);
            }
        }
        else if(number2 <= number1 && number2 <=number3){
            System.out.println("this is smallest number "+number2);
            if(number1 <= number3){
                System.out.println("second smallest number "+number1);
                System.out.println("largest number "+number3);
            }else{
                System.out.println("second smallest number "+number3);
                System.out.println("largest number "+number1);
            }
        }else{
            System.out.println("the smallest number "+number3);
            if(number1 <= number2){
                System.out.println("second smallest "+number1);
                System.out.println("largest number "+number2);
            }else{
                System.out.println("second smallest "+number2);
                System.out.println("Largest "+number1);
            }
        }*/

   /* Traffic Light Simulator: Write a program that simulates a traffic light.
    The program takes a color (red, yellow, green) as input and gives an output like
    "stop", "caution", or "go".*/

      /*  System.out.println("Please give a color: red, yellow or green");
        String color = scaner.next();
        if(color.equalsIgnoreCase("red")){
            System.out.println("Please stop");
        }else if(color.equalsIgnoreCase("green")){
            System.out.println("Please enter go");
        }else if(color.equalsIgnoreCase("yellow")){
            System.out.println("be ready");
        }else{
            System.out.println("Invalid entry");
        }*/
        /*Time of Day Greeting: Write a program that displays a different greeting
        based on the time of day (morning, afternoon, evening, night)
        entered by the user.*/

      /*  System.out.println("Please give me day: morning, afternoon, evening, night");
        String day = scaner.next();
        if(day.equalsIgnoreCase("morning")){
            System.out.println("Good morning: it is morning");
        }else if(day.equalsIgnoreCase("afternoon")){
            System.out.println("Good afternoon: it is afternoon");
        }else if(day.equalsIgnoreCase("evening")){
            System.out.println("good eveining: it is evening");
        }else if(day.equalsIgnoreCase("night")){
            System.out.println("good night: it is night");
        }else{
            System.out.println("invalid data");
        }*/

/*Simple Calculator:
Task: Develop a basic calculator that asks the user for two numbers
 and an operation (add, subtract, multiply, divide) and then performs the operation.
Hint: Use if-else statements to execute the operation based on the user's choice.*/
      /*  System.out.println("Please give two numbers");
        int number1 = scaner.nextInt();
        int number2 = scaner.nextInt();

        System.out.println("Please chose operation{+,-,*,/}");
        char operation = scaner.next().charAt(0);

        if(operation =='+'){
            System.out.println("Result "+(number1+number2));
        }else if(operation =='-'){
            System.out.println("Relust "+(number1-number2));
        }else if(operation =='*'){
            System.out.println("Result "+(number1*number2));
        }
        else if(operation=='/'){
            if(number2 != 0){ // if number not equal to 0
                System.out.println("Result "+number1/number2);
            }else{
                System.out.println("cannot divide by 0");
            }
        }else{
            System.out.println("Invalid number");
        }*/

        /*Username and Password Validation:
Task: Write a program that checks if the entered username and password meet
specific criteria (e.g., username isn't empty and password length is at least
8 characters).*/
       /* System.out.println("Please enter username");
        String username  = scaner.next();
        System.out.println("Please enter password");
        String password = scaner.next();
        if(!username.isEmpty() && password.length() >=8){
            System.out.println("your username and password is valid");
        }else{
            System.out.println("Your username and password is not valid");
            if(username.isEmpty()){
                System.out.println("username cannot be emplty");
            }if(password.length()<8){
                System.out.println("password must be at least 8 characters");
            }
        }*/

/*Weather Advice Based on Temperature and Weather Condition:
Task: Write a program that gives clothing advice based on the temperature
 and whether it is raining or sunny (e.g., "Wear a coat" if below 15°C or
 "Take an umbrella" if it's raining).*/

        System.out.println("Please enter temperature in Rarenheit");
        int farenheit = scaner.nextInt();
        System.out.println("Please enter weather condition: cold, sunny, raining");
        String weatherCondition = scaner.next();
        if(farenheit <15 && weatherCondition.equalsIgnoreCase("cold")){
            System.out.println("it is cold, please wear coat");
        }else if(farenheit <20 && weatherCondition.equalsIgnoreCase("raining")){
            System.out.println("Please take an umbrella, it is raining");
        }else if(farenheit> 75 && weatherCondition.equalsIgnoreCase("sunny")){
            System.out.println("Please take swimsuit, it is sunny");
        }else{
            System.out.println("invalid data");
        }




    }


}
