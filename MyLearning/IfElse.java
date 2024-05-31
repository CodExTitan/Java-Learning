package udemycourseL;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me: Hi Java, did I score better in biology?");
        int chemistryGrade = scanner.nextInt();
        int biologyGrade = scanner.nextInt();

        if (biologyGrade > chemistryGrade) {
            System.out.println("Java: You got a great biology!");
        } else {
            System.out.println("Java: No, you did not score better in biology!");
        }

        System.out.println("\nMe: Hi Java, did we make money?");
        double sales = scanner.nextDouble();
        double costs = scanner.nextDouble();

        if (sales > costs) {
            System.out.println("Java: Yes, we made money!");
        } else {
            System.out.println("Java: No, we did not make money!");
        }

        System.out.println("\nMe: Hi Java, is the temperature colder than our target?");
        double temperature = scanner.nextDouble();
        double targetTemperature = scanner.nextDouble();

        if (temperature < targetTemperature) {
            System.out.println("Java: Yes, the temperature is colder than our target.");
        } else {
            System.out.println("Java: No, the temperature is not colder than our target.");
        }

        System.out.println("\nMe: Hi Java, am I driving slower than the speed limit?");
        int currentSpeed = scanner.nextInt();
        int speedLimit = scanner.nextInt();

        if (currentSpeed < speedLimit) {
            System.out.println("Java: Yes, you are driving slower than the speed limit.");
        } else {
            System.out.println("Java: No, you are not driving slower than the speed limit.");
        }

        System.out.println("\nMe: Hi Java, am I old enough to retire?");
        int age = scanner.nextInt();
        int retirementAge = scanner.nextInt();

        if (age >= retirementAge) {
            System.out.println("Java: Yes, you are old enough to retire.");
        } else {
            System.out.println("Java: No, you are not old enough to retire, You still have " + (retirementAge - age) + " years to retire.");
        }

        System.out.println("\nMe: Hi Java, did I get the best possible grade?");
        char myGrade = scanner.next().charAt(0);
        char bestGrade = scanner.next().charAt(0);

        if (myGrade == bestGrade) {
            System.out.println("Java: Yes, you got the best possible grade!");
        } else {
            System.out.println("Java: No, you did not get the best possible grade.");
        }

        System.out.println("\nMe: Are the two words the same?");
        String word = scanner.next();
        String secondWord = scanner.next();

        if (word.equals(secondWord)) {
            System.out.println("Java: Yes, the two words are the same.");
        } else {
            System.out.println("Java: No, the two words are different.");
        }

        System.out.println("\n Me: Are the two words different?");
        String thirdWord = scanner.next();
        String fourthWord = scanner.next();

        if (!thirdWord.equals(fourthWord)) {
            System.out.println("Java: Yes, the two words are different.");
        } else {
            System.out.println("Java: No, the two words are the same.");
        }

        scanner.close();
    }
}