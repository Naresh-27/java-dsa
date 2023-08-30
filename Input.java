package Arrays_and_Arraylists;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("enter the size");
//        int n=in.nextInt();
        int[] arr = new int[5];

//        arr[0]=24;
//        arr[1]=454;
//        arr[2]=445;
//        arr[3]=353;
//        arr[4]=144;
//        System.out.println(arr[3]);



        //  Input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        //    Printing output of array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //   Another type of Printing array
//        for (int j : arr) {     //  for every element in array, print the element
//            System.out.print(j + " ");   //  here j represents element of the array
//        }

        //  Simple way of printing
        System.out.println(Arrays.toString(arr));
    }
}
