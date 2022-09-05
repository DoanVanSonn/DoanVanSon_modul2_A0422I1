package case_study.models;

public class Villa extends Facility{
    private String otherUtilities; //Các tiện ích khác
    private int amount;

    public Villa() {
    }

    public Villa(String idFacility, String serviceName, float area, float price, int maxPeople, String rentType, int rentTime, String otherUtilities, int amount) {
        super(idFacility, serviceName, area, price, maxPeople, rentType, rentTime);
        this.otherUtilities = otherUtilities;
        this.amount = amount;

    }

    public String getOtherUtilities() {
        return otherUtilities;
    }

    public void setOtherUtilities(String otherUtilities) {
        this.otherUtilities = otherUtilities;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return"Facility{" +
                "id='" + super.getIdFacility() + '\'' +
                ", serviceName='" + super.getServiceName() + '\'' +
                ", area=" + super.getArea() +
                ", price=" + super.getPrice() +
                ", maxPeople=" + super.getMaxPeople() +
                ", rentType='" + super.getRentType() + '\'' +
                ", rentTime=" + super.getRentTime() +
                ", otherUtilities=" + this.otherUtilities +
                ", amount=" + this.amount +
                '}';
    }
}
