package ss13_search_algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class FindTheStrHaveTheLargestLength {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String str = sc.nextLine();
        LinkedList<Character> max= new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list= new LinkedList<>();
            list.add(str.charAt(i));

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j)>list.getLast()){
                list.add(str.charAt(j));
            }

            }
        if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
        }
        list.clear();
        }
for (Character ch: max){
    System.out.print(ch);
}
        System.out.println();
    }
}
