package day4;

import java.util.Scanner;

public class SwitchStatement1 {

    public static void main(String[] args) {
       /* boolean condition = true;
        switch(String.valueOf(condition)) {
            case "true":
                System.out.println("the condition is true");
                break;
            case "false":
                System.out.println("the condition is false");
                break;
        }
                /*Implement a Java method in a User Access Control System that determines a user's access
            level based on multiple boolean conditions. These conditions include isAdmin, isManager, and
            isEmployee. The combination of these boolean values will dictate the level of access granted.*/

        // condition ? result is true : result is false
        // I am girl ? system.out.println("she is girl"): system.out.println("he is boy")

         /*   boolean isAdmin = true;
            boolean isManager = false;
            boolean IsEmployee = true;*/

            Scanner scanner = new Scanner(System.in);
           /*System.out.println("Please enter access code");
            String letter = scanner.next();

            String accessCode = (isAdmin ? "A": "false") + (isManager ? "M":"false") + (IsEmployee ? "E":"false");


            switch(letter){
                case "A":
                    System.out.println("Admin access granted");
                    break;
                case "AE":
                    System.out.println("Admin-employee granted");
                    break;
                case "AME":
                    System.out.println("full access");
                    break;
                case "M":
                    System.out.println("Manager access code");
                    break;
                case "ME":
                    System.out.println("Manager-Employee access granted");
                    break;
                case "E":
                    System.out.println("Employee access granted");
                    break;
                default:
                    System.out.println("No access code");
                    break;

            }*/
            /*Write a Java program to assign a priority (High, Medium, Low)
                 to test cases based on their type (e.g., "Functional", "Performance", "Security")
                  using a switch statement.*/

        /*Explanation: Severity is more about the technical impact of the bug on the software, focusing
        on aspects like functionality, data integrity, and system stability.
Priority is more aligned with business needs and timelines. It’s about how soon the bug should be
fixed considering factors like customer needs, release deadlines, and available resources.*/

       /* System.out.println("Please enter: functional, Performance, Security");
        String word = scanner.next();
        switch(word){
            case "functional":
                System.out.println("priority is High");
                break;

            case "Performance":
                System.out.println("priority is Medium");
                break;

            case "Security":
                System.out.println("priority is high");
                break;

            default:
                System.out.println("Unknown test case");
        }*/
       /* Use a switch statement to select different sets of test data based on the test type
                (e.g., "Regression", "Smoke", "Sanity").*/
        System.out.println("please enter test type: regression, smoke, sanity");
        String testType = scanner.next();
        switch(testType){
            case "Regression":
                System.out.println("Using comprehensive data set for regression testing");
                break;
            case "Smoke":
                System.out.println("using basic data set for smoke testing");
                break;
            case "Sanity":
                System.out.println("using focusing data set sanity testing");
                break;
            default:
                System.out.println("Iinvalid test type");
        }









    }
}
