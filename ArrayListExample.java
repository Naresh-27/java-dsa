package Arrays_and_Arraylists;


import java.util.Scanner;

import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Syntax
       // ArrayList<datatype> list = new ArrayList(initial size);

        ArrayList<Integer> list = new java.util.ArrayList<>(10);

//        list.add(46);
//        list.add(54);
//        list.add(48);
//        list.add(35);
//        list.add(46);
//        list.add(54);
//        list.add(48);
//        list.add(35);
//        list.add(46);
//        list.add(54);
//        list.add(48);
//        list.add(35);
//
//        System.out.println(list);
//
//        System.out.println(list.contains(list.contains(54)));  // we can check the num present in list or not
//
//        list.set(0,199);     //  we can change the number in list as well
//        System.out.println(list);
//
//        list.remove(2);   //  we can remove the num from list
//        System.out.println(list);
//
        // Input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
