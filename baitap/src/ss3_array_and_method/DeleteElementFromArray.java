package ss3_array_and_method;

import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int numbers, i, changes;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            numbers = scanner.nextInt();
        } while (numbers <= 0);

        int A[] = new int[numbers];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < numbers; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên X: ");
        int X = scanner.nextInt();


        for (changes = i = 0; i < numbers; i++) {
            if (A[i] != X) {
                A[changes] = A[i];
                changes++;
            }
        }

        numbers = changes;


        System.out.println("Mảng còn lại sau khi xóa phần tử " + X + " là: ");
        for (i = 0; i < numbers; i++) {
            System.out.print(A[i] + "\t");
        }

    }

}
