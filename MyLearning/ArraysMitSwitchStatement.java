package udemycourseL;

public class ArraysMitSwitchStatement {
    public static void main(String[] args) {
       int[][] grades = {
               {83, 73, 93, 84},
               {83, 73, 93, 84},
               {83, 73, 93, 84}
       };

       for (int i = 0; i < grades.length; i++) {

           switch (i) {
               case 0:
                   System.out.print("Harry: "); break;
               case 1:
                   System.out.print("Garry: "); break;
               case 2:
                   System.out.print("Larry: "); break;
           }
           for (int j = 0; j < grades.length; j++) {
               System.out.print("["+ grades[i][j] +" "+ "]");
           }
           System.out.println("\n");
       }
    }
}
