package introductiontojava;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        System.out.println("nhập số cần đọc");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        if (number<10){
            switch (number){
                case 0: System.out.println("zero");
                break;
                case 1: System.out.println("one");
                break;
                case 2: System.out.println("two");
                break;
                case 3: System.out.println("three");
                break;
                case 4: System.out.println("four");
                break;
                case 5: System.out.println("five");
                break;
                case 6: System.out.println("six");
                break;
                case 7: System.out.println("seven");
                break;
                case 8: System.out.println("eight");
                break;
                case 9: System.out.println("nine");
                break;
            }
        }
        else if (number<20){
            int z= number%10;
            switch (z){
                case 0: System.out.println("ten");
                    break;
                case 1: System.out.println("eleven");
                    break;
                case 2: System.out.println("twelfth");
                    break;
                case 3: System.out.println("thirteen");
                    break;
                case 4: System.out.println("fourteen");
                    break;
                case 5: System.out.println("fifteen");
                    break;
                case 6: System.out.println("sixteen");
                    break;
                case 7: System.out.println("seventeen");
                    break;
                case 8: System.out.println("eighteen");
                    break;
                case 9: System.out.println("nineteen");
                    break;
            }

        }
    }
}
