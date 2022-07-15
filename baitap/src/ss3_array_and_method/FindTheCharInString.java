package ss3_array_and_method;

import java.util.Scanner;

public class FindTheCharInString {
    public static void main(String[] args) {
        String[] str=" Doan Van Son".split("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào kí tự cần tìm kiếm :");
        char c = scanner.next().charAt(0);
        int count=0;
        for (int i = 0; i < str.length; i++) {
if (str[i].charAt(0)==c){
    count++;
}
        }
        System.out.println("so lan lap lai la "+ count);


    }
}
