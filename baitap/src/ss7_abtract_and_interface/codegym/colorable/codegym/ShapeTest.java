package ss7_abtract_and_interface.codegym.colorable.codegym;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        shape.howToColor();
        System.out.println(shape);
    }
}
