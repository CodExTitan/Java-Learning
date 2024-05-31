package udemycourseL;

import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weather: ");

        String weather = sc.nextLine();

        if (weather.equals("rainy")) {
            System.out.println("Bring an umbrella!");
        } else if (weather.equals("sunny")) {
            System.out.println("It's a nice day for a walk.");
        } else {
            System.out.println("Not sure what to do in this weather.");
        }


        System.out.println("\nEnter your score:");
        int score = sc.nextInt();
        sc.nextLine();

        if (score >= 80) {
            System.out.println("You got an A!");
        } else if (score >= 70) {
            System.out.println("You got an B!");
        } else if (score >= 60) {
            System.out.println("You got an C!");
        } else if (score >= 50) {
            System.out.println("You got an D!");
        } else {
            System.out.println("You got an E!");
        }

        System.out.println("\nEnter your Name:");
        String Name = sc.nextLine();
        if (Name.equals("Lovish Haider")) {
            System.out.println("You are the founder of CodExTitan!");
        } else if (!Name.equals("Lovish Haider")) {
            System.out.println("You are an employee of Lovish Haider!.");
        } else {
            System.out.println("You are an employee.");
        }
    }
}
/*
        // CEO: System.out.println("You're the boss!");
        // manager: System.out.println("You're in charge of a team.");
        // Otherwise: System.out.println("You're an employee.");

        char grade = 'B';

        // A: System.out.println("Excellent work!");
        // B: System.out.println("Good job!");
        // C: System.out.println("You did okay.");
        // D: System.out.println("Hey, you still passed!");
        // Otherwise: System.out.println("You failed :(");
        
    }
}
*/