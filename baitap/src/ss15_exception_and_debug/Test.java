package ss15_exception_and_debug;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        do{
            try {
                System.out.print("Input side 1: ");
                double side1= Double.parseDouble(scanner.nextLine());
                System.out.print("Input side 2: ");
                double side2= Double.parseDouble(scanner.nextLine());
                System.out.print("Input side 3: ");
                double side3= Double.parseDouble(scanner.nextLine());
                Triangle triangle= new Triangle(side1, side2, side3);
                System.out.println("primeter : "+ triangle.getPerimeter());
                break;
            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }while (true);
    }

}


