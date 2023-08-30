package Arrays_and_Arraylists;

import java.util.Arrays;

public class Passing_in_Fun {
    public static void main(String[] args) {
        int[] num={2,1,4,7,3,6,};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int[] nar){
        nar[3]= 999;
    }
}
