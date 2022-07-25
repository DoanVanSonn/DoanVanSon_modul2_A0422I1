package ss6_inhertance.circle_and_cylinder;

import ss6_inhertance.circle_and_cylinder.Cylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3, "pink", 12);
        System.out.println("dien tich hinh tron la" + cylinder.volume());
    }
}
