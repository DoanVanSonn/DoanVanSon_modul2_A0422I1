package ss1_introduction_to_java;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhâp số tiền USD: ");
        usd = sc.nextDouble();
        double convert = usd * vnd;
        System.out.println("giá trị VND " + convert);
    }
}
