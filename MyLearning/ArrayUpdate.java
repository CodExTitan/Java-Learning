package udemycourseL;

import java.util.Arrays;

public class ArrayUpdate {
    public static void main(String[] args) {
        String[] cafe = {"Espresso", "Iced Coffee", "Macchiato"};
        cafe[2] = "americano";

        //updating array and adding new elements
        String[] newcafe = new String[5];
        for (int i = 0; i < cafe.length; i++) {
            newcafe[i] = cafe[i];
        }
        newcafe[3] = "Latte";
        newcafe[4] = "Cappu ccino";
            System.out.println(Arrays.toString(newcafe));
        //updating array values

        String[] flavours = {"Sweet", "Sour", "Bitter"};
        flavours[0] = "Sour";
        flavours[1] = "Sweet";
        System.out.println(Arrays.toString(flavours));
    }
}
