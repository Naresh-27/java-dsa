package Arrays_and_Arraylists;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        /*
          1 2 3
          4 5 6
          7 8 9
     */

        int[][] arr = new int[3][3];
        System.out.println(arr.length);        // no of rows
//        int [][] arr2D=  {
//                           {1, 2, 3},  //  0th index
//                           {4, 5, 6},   // 1 index
//                           {7, 8, 9}};  // 2 index



//      Input
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {          // for each column in every row
                arr[row][col] = in.nextInt();
            }
        }

//        // Output
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {          // for each column in every row
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

//        // Simple way of printing
//        for (int row = 0; row <arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //   Enhanced for loop
        for (int [] a : arr){    // for every element in arr
            System.out.println(Arrays.toString(a));
        }
    }
}
