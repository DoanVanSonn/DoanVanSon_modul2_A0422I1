package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        System.out.println("==========menu============");
        System.out.println("1.        System.out.println ");
        System.out.println("2.        Customer Management");
        System.out.println("3.        Facility Management");
        System.out.println("4.        Booking Management");
        System.out.println("5.        Promotion Management");
        System.out.println("6.        Exit");
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        do {
            System.out.println("Chọn chức năng : [1- 4]");
            int chon = input.nextInt();
            switch (chon) {
                case 1:
                    EmployeeManagement();
                    break;
                case 2:
                    System.out.println("Customer Management");
                    break;
                case 3:
                    System.out.println("Facility Management");
                    break;
                case 4:
                    System.out.println("Booking Management");
                    break;
                case 5:
                    System.out.println("Promotion Management");
                    break;
                default:
                    System.out.println("exit");
                    cont = false;
                    break;
            }
        } while (cont);
    }

    private static void EmployeeManagement() {
        System.out.println("==========menu============");
        System.out.println("1.        System.out.println ");
        System.out.println("2.        Customer Management");
        System.out.println("3.        Facility Management");
        System.out.println("4.        Return main menu");
    }
}

