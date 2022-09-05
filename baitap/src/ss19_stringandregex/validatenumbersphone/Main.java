package ss19_stringandregex.validatenumbersphone;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "\\(\\d{2}\\)-\\(0[\\d]{9}\\)";
        Pattern pattern = Pattern.compile(regex);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter phone number:");
            String sdt = scanner.nextLine();
            if (sdt.trim().equals("")) {
                break;
            }
            System.out.println("Number entered is phone number: " + pattern.matcher(sdt).matches());
        } while (true);
    }
    }
