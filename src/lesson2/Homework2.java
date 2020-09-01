package lesson2;

import org.jetbrains.annotations.NotNull;
import sun.security.smartcardio.SunPCSC;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int i;

        printTask((int) 1);
        int[] arr = new int[8];
        String[] strArr = new String[10];
        printArr(stepByStep(8);
        FillArr(arr);
        printArr(factoryArr( 12));
    }



    public static void main(String[] args){

            int sample[] = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};


            for (int i = 0; i < sample.length; i++) {
                if (sample[i] == 0) {
                    sample[i] = 1;
                } else sample[i] = 0;
            }
            System.out.println(Arrays.toString(sample));
            }


            public static void stepByStep ( int[] arr){


                String[] stringsArr = new String[8];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] *= 3;
                }
                System.out.println(Arrays.toString(new String[]{arr[i] + " "}));

//public static void FillArr(int[] arr) {
//    for (int i = 1; i < arr.length; i++) {
//        arr[i] = arr[i - 1] + 3;
           }


        public static int[][] factoryArr ( int n){
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                arr[i][i] = 1;
                arr[i][n - 1 - i] = 1;
            }
            return arr;
        }

        public static int maxValue ( int[] arr){
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

    public static boolean checkBalance(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i]; /*находим сумму всех элементов из задачи №6 дз№2*/
        }
        if (summ % 2 != 0) {
            return false;
        }
        int sumLeft = 0;
        int i = 0;
        int summLeft;
        while (sumLeft < summ / 2) {
            summLeft += arr[i];
            i++;
        }
        return summLeft == summ / 2;
    }
}

