package ss3_array_and_method;

import java.util.Scanner;

public class InsertTheElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int numbers = scanner.nextInt();
        int[] arr = new int[numbers];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < numbers; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập phần tử k = ");
        int k = scanner.nextInt();

        int arrIndex = arr.length - 1;
        int tempIndex = arr.length;
        int[] tempArr = new int[tempIndex + 1];
        boolean inserted = false;

        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > k) {
                tempArr[i] = arr[arrIndex--];
            } else {
                if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
                } else {
                    tempArr[i] = arr[arrIndex--];
                }
            }
        }
        for (int i = 0; i < tempArr.length; i++) {
            System.out.println(tempArr[i]);

        }
    }
}
