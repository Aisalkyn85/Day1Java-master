package day2;

import java.util.Scanner;

public class IfElse1 {
   public static void main (String[] ars){
       /*if(condition id true){
       code to execute with condition is true
       }else{
       condition is false
       }*/
       /*Task: Write a program that asks the user to enter a number
        and then prints out whether the number is even or odd.*/
       // 2%10=2
       //2/10=0.02

       Scanner scanner = new Scanner(System.in);
     /* System.out.println("Please enter number");
      int number = scanner.nextInt();
       //int number = 7;

      if(number%2==0){
           System.out.println("this is even number");
       }else{
           System.out.println("this is odd number");
       }*/

       /*Task: Create a program that asks for a student's mark
        (0-100) and classifies it into a grade (A, B, C, D, E, F).
Hint: Use a series of if-else statements to check ranges (e.g., 90-100 for 'A', 80-89 for 'B', etc.).
< less then, > greater then*/
       // for && operator both condition has to be true
       // for || operator one of the condition has to ve true to block to execute

      /* System.out.println("Please enter your mark");
       int grade = scanner.nextInt();

       if(grade>= 90 && grade <=100){ // both condition has to be true in case to execute inside of block
           System.out.println("You grade is 'A'");
       }else if(grade >=80 && grade <=89){
           System.out.println("Your grade is 'B'");
       }else if(grade >70 && grade <= 79){
           System.out.println("Your grade is 'C'");
       }else {
           System.out.println("Your grade is 'D'");
       }*/

       /*Leap Year Checker:
Task: Create a program to check whether a given year (input from the user) is a leap year or not.
Hint: A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
*/
       // || or condition. in this condition, one of the condition will be true, code in the block iwll execute
       // == equal; != not equal

    /*   System.out.println("Please enter year");
       int year = scanner.nextInt();
       if((year%4==0 && year%100 != 0) || (year%400 ==0)){
           System.out.println("This is leap year");

       }else{
           System.out.println("This is not leap year");
       }*/

     // Please create a program (Input from the user) take three digits, and print from small to large
       // 3,4,5 3 is smallest number, 4 second small, 5 large number
       // 8.06 pm
       // you will use &&
     /*  import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers:");

        int digit1 = scanner.nextInt();
        int digit2 = scanner.nextInt();
        int digit3 = scanner.nextInt();

        if (digit1 <= digit2 && digit1 <= digit3) {
            System.out.println("The smallest number is: " + digit1);
            if (digit2 <= digit3) {
                System.out.println("Second smallest: " + digit2);
                System.out.println("Largest: " + digit3);
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

        scanner.close();
    }
}

       }*/

       /*Age Group Classifier:
Task: Create a program that asks for a person's age and classifies them into
categories (e.g., toddler, child, teenager, adult).
Hint: Use if-else statements to check the age and categorize accordingly
(e.g., 0-2 years as toddler, 3-12 as child, etc.).*/
       System.out.println("Please enter your age");
       int ageOfPerson = scanner.nextInt();

       if(ageOfPerson >=0 && ageOfPerson <=2){
           System.out.println("this is toddler");
       }
       else if(ageOfPerson >=3 && ageOfPerson <=12){
           System.out.println("this is child");
       } else if (ageOfPerson >=13 && ageOfPerson <=19){
           System.out.println("this is teenager");
       }
       else if(ageOfPerson >= 20){
           System.out.println("This is adult");
       }else{
           System.out.println("this is invalid number");
       }


   }
}
