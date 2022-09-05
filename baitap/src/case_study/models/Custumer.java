package case_study.models;

public class Custumer extends Person{
    private String typeCustumer;

    public Custumer() {
    }


    public Custumer(int id, int age, String name, String address, String typeCustumer) {
        super(id, age, name, address);
        this.typeCustumer = typeCustumer;
    }

    public String getTypeCustumer() {
        return typeCustumer;
    }

    public void setTypeCustumer(String typeCustumer) {
        this.typeCustumer = typeCustumer;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id: " + super.getId() +
                ", Tên: " + super.getName() + '\'' +
                ", Tuổi: " + super.getAge() +
                ", Địa chỉ: " + super.getAddress() + '\'' +
                ", Loại khách hàng : " + this.typeCustumer + '\'' +
                '}';
    }
}
