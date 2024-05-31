package udemycourseL;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class worksheet5point11 {
    public static void main(String[] args) {
        System.out.println("-----------------------Let's play Rolling Java.---------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 'yes' to start:");

        String word = sc.nextLine();
        System.out.println(word);
        if (word.equals("yes")) {
            System.out.println("Great, here are the rules:\n");
            System.out.println("- If you roll a 6, the game stops.");
            System.out.println("- If you roll a 4, nothing happens.");
            System.out.println("- otherwise, you get 1 point.\n");
            System.out.println("You must collect at least 3 points to win. Now Enter anything to roll: ");
        sc.nextLine();
        }
       /* int diceRoll = 0;
        while (true) {
            sc.nextLine();
            int diceRoll
            System.out.println(diceRoll);

        }
*/

    }

}
