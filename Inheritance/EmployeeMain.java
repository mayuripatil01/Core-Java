class Employee{
    String name;
    double salary;
     
    void ShowEmployee(){
        System.out.println("Name:"+ name);
        System.out.println("Salary:" + salary);
    }
}
class HR extends Employee{
    void  work(){
        System.out.println("HR manage recruitement");

    }
}
 class Admin extends Employee{
    void work(){
        System.out.println("Admin manage office work");
    }
 }
 class EmployeeMain{
    public  static void main(String[] args)
    {
        HR hr = new HR();
        hr.name = "Payal";
        hr.salary = 50000;
        hr.ShowEmployee();
        hr.work();

        System.out.println();

        Admin ad = new Admin();
        ad.name = "Vedika";
        ad.salary = 75000;
        ad.ShowEmployee();
        ad.work();
    }
 }