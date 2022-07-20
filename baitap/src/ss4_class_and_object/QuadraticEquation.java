package ss4_class_and_object;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(-2);
        quadraticEquation.setB(4);
        quadraticEquation.setC(7);

        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("phuong trinh vo nghiem ");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("phuong trinh co nghiem kep " + -quadraticEquation.getB() / (quadraticEquation.getA() * 2));
        } else
            System.out.println("phuong trinh co 2 nghiem " + quadraticEquation.getRoot1() + "\t\t" + quadraticEquation.getRoot2());
    }
}
