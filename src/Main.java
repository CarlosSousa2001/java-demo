import entities.Department;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(10, "teste/QA");

        System.out.println(department.toString());
    }
}