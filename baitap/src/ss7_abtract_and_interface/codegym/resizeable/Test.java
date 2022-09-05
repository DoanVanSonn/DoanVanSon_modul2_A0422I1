package ss7_abtract_and_interface.codegym.resizeable;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(2, 3);
        System.out.println("Ban đầu");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
        double random = Math.random() * (100 - 1 + 1) + 1;
        for (Shape shape : shapes) {
            shape.resize(random);
        }
        System.out.println("sau khi tăng ");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }

    }

}
