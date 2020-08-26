package lesson2;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {

        int sample[] = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        String[] strArr = new String[10];

        for (int i = 0; i < sample.length; i++) {
            System.out.println(sample[i] + " ");

            sample[i] ++;
        }


        System.out.println(Arrays.toString(sample));
    }
}



