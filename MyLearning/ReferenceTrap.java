package udemycourseL;

import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {

        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = staffLastYear;
        /*if you set one string value to another string then try to update value of any string the value will be updated
        to both strings this is what we call reference trap  */
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
/* Solution to the reference trap is

   String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
   String[] staffThisYear = staffLastYear;

   for(int i = 0; i< staffLastYear.length; i++) {
       staffThisYear[i] = staffLastYear[i];
   }
   staffThisYear[i] = "Abby";

   System.out.println("Staff Last Year " + Arrays.toString(staffLastYear));
   System.out.println("Staff This Year " + Arrays.toString(staffThisYear)):
 */
