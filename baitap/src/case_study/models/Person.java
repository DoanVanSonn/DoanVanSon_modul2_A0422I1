package case_study.models;

public abstract class Person {
    private int id;
    private int age;
    private String name;
    private String address;

    public Person() {
    }

    public Person(int id, int age, String name, String address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", Tên: " + name + '\'' +
                ", Tuổi: " + age +
                ", Địa chỉ: " + address + '\'' +
                '}';
    }
}
