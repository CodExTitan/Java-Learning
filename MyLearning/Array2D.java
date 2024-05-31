package udemycourseL;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[] [] grades =  new int[3] [4];

        grades[0] [0] = 82;
        grades[0] [1] = 72;
        grades[0] [2] = 92;
        grades[0] [3] = 69;

        grades[1] [0] = 72;
        grades[1] [1] = 62;
        grades[1] [2] = 78;
        grades[1] [3] = 89;

        grades[2] [0] = 82;
        grades[2] [1] = 62;
        grades[2] [2] = 92;
        grades[2] [3] = 88;

        System.out.println("\tGon" + Arrays.toString(grades[0]));
        System.out.println("\tMon" + Arrays.toString(grades[1]));
        System.out.println("\tRon" + Arrays.toString(grades[2]));

        //Another smart way for 2D array code is:
        int[] [] grades2 = {
                {72, 74, 84, 94},
                {72, 74, 84, 94},
                {72, 74, 84, 94},
        };
        System.out.println("\n\tHarry [" + grades2[0][0] + " " + grades2[0][1] + " " + grades2[0][2] + " " + grades2[0][3] +"]" );
        System.out.println("\tGarry [" + grades2[1][0] + " " + grades2[1][1] + " " + grades2[1][2] + " " + grades2[1][3] +"]" );
        System.out.println("\tLarry [" + grades2[2][0] + " " + grades2[2][1] + " " + grades2[2][2] + " " + grades2[2][3] +"]");
    }
}
