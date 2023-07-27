import entities.Department;
import entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(10, "teste/QA");

        Seller seller = new Seller(10, "Carlos", "carlos@gmail.com",new Date(), 2000.00, department);

        System.out.println(department.toString());

        System.out.println("_-----------------------_");

        System.out.println(seller.toString());
    }
}