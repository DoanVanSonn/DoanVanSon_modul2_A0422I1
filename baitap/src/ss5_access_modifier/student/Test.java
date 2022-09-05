package ss5_access_modifier.student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Nam", 18, "Da Nang");
        student.setClasses("A04");
        student.setName("Doan Van Son");
        System.out.println(student.getClasses());
        System.out.println(student.getName());

    }
}
