package udemycourseL;

import java.util.Scanner;

public class ForLoopExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10
        // TODO: Write a for loop that prints numbers from 1 to 10
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        int i;
        System.out.println("The numbers are:");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int length = i;
        System.out.println("\n2. The length of the i is " + length +"\n");

        // Example 2: Print "Hello, world!" 5 times
        // TODO: Write a for loop that prints "Hello, world!" 5 times

        System.out.println("3. Enter the word");
        String word = sc.nextLine();
        for (i = 1; i <= 5; i++) {
            System.out.println(word);
        }

        // Example 3: Print the multiplication table of 5 up to 10
        // TODO: Write a for loop that prints the multiplication table of 5 up to 10 (5 x 1, 5 x 2, ..., 5 x 10)
        System.out.println("\n4. Enter the value");
        int value = sc.nextInt();
        for (i = 1; i <= 11; i++) {
            System.out.println("The value is "+ i * value);
        }

        // Example 4: Print the numbers from 10 to 1 in reverse order
        // TODO: Write a for loop that prints numbers from 10 to 1 in reverse order
        System.out.println("\n5. Reversing the number from 10 - 1");
        for (i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Example 5: Print the first 10 even numbers
        // TODO: Write a for loop that prints the first 10 even numbers
        System.out.println("\n6. First 10 even numbers are: ");
        for (i = 0; i <= 20; i+=2) {
            System.out.println(i);

        }
    }
}
