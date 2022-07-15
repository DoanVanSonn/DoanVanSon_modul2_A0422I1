package ss3_array_and_method;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int arr1[] = {1, 2, 3, 4};
        int length2 = arr.length + arr1.length;
        int arr2[] = new int[length2];
        int pop = 0;
        for (int element : arr
        ) {
            arr2[pop] = element;
            pop++;

        }
        for (int element : arr1
        ) {
            arr2[pop] = element;
            pop++;
        }

        System.out.println("Mảng sau khi nối là : " + Arrays.toString(arr2));
    }
}
