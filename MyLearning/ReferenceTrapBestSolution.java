package udemycourseL;

import java.util.Arrays;

public class ReferenceTrapBestSolution {
    public static void main(String[] args) {
        String[] staffThisYear = {"Tommy", "Joel", "Ellie"};
        String[] staffLastYear = Arrays.copyOf(staffThisYear, staffThisYear.length);
        staffLastYear[1] = "Abby";

        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));

    }
}
