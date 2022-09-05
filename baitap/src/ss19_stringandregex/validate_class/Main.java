package ss19_stringandregex.validate_class;

public class Main {
    public static void main(String[] args) {


    String[] validClasses = new String[]{"C0318G"};
    String[] invalidClasses = new String[]{"M0318G", "P0323A", "P0323J", "AA9878"};
    ValidateClass validate= new ValidateClass();
        for (String className : validClasses) {
        boolean isValid = validate.validate(className);
        System.out.println("Name of class is " + className + " is valid " + isValid);
    }
        for (String className : invalidClasses) {
        boolean isValid = validate.validate(className);
        System.out.println("Name of class is " + className + " is valid " + isValid);
    }}
}

