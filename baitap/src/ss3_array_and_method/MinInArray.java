package ss3_array_and_method;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {

        int row, collum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        row = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        collum = scanner.nextInt();

        int arr[][] = new int[row][collum];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collum; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }

        int min = arr[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collum; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Phần tử nhỏ nhất trong ma trận = " + min);
    }
}
