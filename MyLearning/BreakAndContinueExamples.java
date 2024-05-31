package udemycourseL;

public class BreakAndContinueExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break)
        // TODO: Write a loop that prints numbers from 1 to 10, but stops when the number 5 is reached using the 'break' statement

        System.out.println("Break");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        // Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue)
        // TODO: Write a loop that prints numbers from 1 to 10, but skips the number 5 using the 'continue' statement
        System.out.println("\nContinue");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        // TODO: Write a loop that finds the smallest number greater than 20 that is divisible by 3 using the 'break' statement
        System.out.println("\nfinding smallest num: ");
        for (int num = 20; num < 30; num++) {
            if (num % 3 == 0) {
                System.out.println(num);
                break;
            }
        }

        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        // TODO: Write a loop that prints all even numbers from 1 to 20, skipping odd numbers using the 'continue' statement
        System.out.println("\nFinding even number: ");
        for(int num = 1; num <=20; num++) {
            if (num % 2 != 0) {
            continue;
            }
                System.out.println(num);
        }

    }
}
