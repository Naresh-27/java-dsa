package Arrays_and_Arraylists;

import java.util.Arrays;
import java.util.Scanner;

public class Array_of_Objects {
    public static void main(String[] args) {
        String[] str = new String[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <str.length ; i++) {
            str[i]=in.next();
        }

        //  Modifying the array
        str[3]="Rakesh";

        System.out.println(Arrays.toString(str));
    }
}
