class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee(65, "MAYURI", 45000);
        e.display();
    }
}
