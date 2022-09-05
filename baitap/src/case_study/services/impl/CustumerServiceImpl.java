package case_study.services.impl;

import case_study.models.Custumer;
import case_study.services.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustumerServiceImpl implements Service {
    private static List<Custumer> customerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Custumer customer: customerList){
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Loại khách hàng: ");
        String typeCustomer = scanner.nextLine();
        Custumer customer = new Custumer(id, age, name, address, typeCustomer);
        customerList.add(customer);
        System.out.println("Đã thêm mới khách hàng thành công");
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {
        for (Custumer customer: customerList){
            System.out.println(" ");
        }
    }
}
