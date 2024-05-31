package udemycourseL;
import java.util.Scanner;

public class worsksheet5point5 {
    public static void main(String[] args) {
        System.out.println("\nI hear you like to count by threes");
        System.out.println("Jimmy: It depends");
        System.out.println("Oh, ok..");

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPick a number to count by: ");
        int n = sc.nextInt();

        System.out.println("\nPick a number to count from: ");
        int x = sc.nextInt();

        System.out.println("\nPick a number to count to: ");
        int y = sc.nextInt();

        for (int i = x; i < y; i+=n) {
            System.out.println(i);
        }



    }
}

/*
        System.out.println("Pick a number to count by");

        int n = sc.nextInt();

        System.out.println("Pick a number to count by");
        int k = sc.nextInt();

        System.out.println("Pick a number to count to");
        int m = sc.nextInt();

        for (int i = k ; i <= m; i+= n) {
            System.out.println(i + " ");
        }
        sc.close();

    }
}
*/