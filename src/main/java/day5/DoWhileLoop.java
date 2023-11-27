package day5;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*Write a program using a while loop to print numbers from 1 to 10.*/
        int num=10;
        int i=0;
        while(i<num){
            System.out.println("I will execute");
            i++;
        }
        /*Use a while loop to calculate the sum of all numbers from 1 to n,
        where n is a user-provided integer.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int input = scanner.nextInt();
        int sum = 0;
        int j=0;
        while(j<=input){
            sum +=j;
            System.out.println(sum);
            j++;
        }
        /*Write a Java program
        that uses a while loop to reverse the digits of a number provided by the user.*/
        System.out.println("please provide with numbers three or more digits");
        int givenNumber = scanner.nextInt();

        int reversed = 0;
        int reminder = 0;
        while(givenNumber != 0){
            reminder=givenNumber%10;
            reversed = reversed*10+reminder;
            givenNumber/=10;
        }
        System.out.println(reversed);

        /*Implement a while loop to calculate the factorial of a given number n.*/
        /*n!=n×(n−1)×(n−2)×…×2×1 for any positive integer n.*/

        System.out.println("Please give us a number");
        int numberOfCustomer = scanner.nextInt();
        // Corrected calculation for factorial
        int factorial = 1;
        int k = 2; // Start from 2, since multiplying by 1 has no effect

        while (k <= numberOfCustomer) {
            factorial *= k; // Multiply factorial by k
            k++;            // Increment k
        }

        System.out.println("Factorial of " + numberOfCustomer + " is: " + factorial);



        /*String Reversal: Use a while loop to reverse a String input by the user.*/

        String name = "Apricot";
        char ch;
        String reverse = "";
        int c = name.length() - 1;  // Start from the last character of the string
        while (c >= 0) {
            ch = name.charAt(c);
            reverse = reverse + ch;
            c--;  // Decrement c to move to the previous character
        }
        System.out.println(reverse);

        //do while
        /*Create a program that asks the user for a password.
        The program should keep asking for the password until the correct
         password is entered.    */


        String password;


        do{
            System.out.println("Please enter a password");
            password = scanner.next();
        }while(!password.equalsIgnoreCase("Apple"));
        System.out.println("Correct Password entered");


        /*Write a program that asks the user how many Fibonacci
        numbers to generate and then generates them using a do-while loop.*/
        /*it is sum of first two numbers 0 + 1 = 1+ 1=2+1=3 */

        System.out.println("How many Fibonacci numbers would you like to generate?");
        int count = scanner.nextInt();

        int firstNumber = 0, secondNumber = 1;
        int n = 0; // Loop counter


        do {
            if (n == 0) {
                System.out.print(firstNumber + " ");
            } else if (n == 1) {
                System.out.print(secondNumber + " ");
            } else {
                int nextNumber = firstNumber + secondNumber;
                System.out.print(nextNumber + " ");
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
            n++;
        } while (n < count);


        /*Write a program that asks the user for a number, then prints
        the multiplication table for that number up to 10 using a do-while loop.*/

      System.out.println("Please enter a number:");
        int numberFromCustomer = scanner.nextInt();

        int p = 1; // Loop counter
        do {
            System.out.println(numberFromCustomer + " * " + p + " = " + (numberFromCustomer * p));
            p++;
        } while (p <= 10); // Ensure the loop runs for values 1 through 10






    }

    }

