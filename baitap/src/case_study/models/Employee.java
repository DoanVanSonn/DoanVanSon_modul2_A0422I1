package case_study.models;

public class Employee extends Person{
    private String position; //Chức vụ
    private int salary; //Lương

    public Employee() {
    }

    public Employee(int id, int age, String name, String address, String position, int salary) {
        super(id, age, name, address);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id: " + super.getId() +
                ", Tên: " + super.getName() + '\'' +
                ", Tuổi: " + super.getAge() +
                ", Địa chỉ: " + super.getAddress() + '\'' +
                ", Chức vụ : " + this.position + '\'' +
                ", Lương : " + this.salary + '\'' +
                '}';
    }
}
