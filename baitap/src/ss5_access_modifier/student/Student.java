package ss5_access_modifier.student;

public class Student {
    private String name = "Jonh";
    private String classes = "CO2";

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public Student(String nam, int i, String da_nang) {
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }

}
