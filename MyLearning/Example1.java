package udemycourseL;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gryffinder score: ");
        System.out.println("Enter ravenclaw score: ");

        int gryffinder = sc .nextInt(); //400
        int ravenclaw = sc.nextInt(); ;  //200

        int margin = gryffinder - ravenclaw;
        if (margin >= 300) {
            System.out.println("gryffinder takes the house of cup");
        }
        else if (margin >= 0) {
            System.out.println("gyrffinder takes the second place");
        }
        else if (margin >= - 100) {
            System.out.println("gyrffinder takes the third place");
        }
        else {
            System.out.println("gyrffinder takes the fourth place");

            sc.close();
        }
    }
}
