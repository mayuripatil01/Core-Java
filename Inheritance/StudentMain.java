// Peson class 
class Person{
    String name;
    int age;


    void displayPeson(){
        System.out.println("Name:" +name);
        System.out.println("Age"+ age);
    }
}
// child class
class Student extends Person{
    int rollNo;

    void displayStudent(){
        displayPeson();// PARENT METHOD
        System.out.println("Roll No" + rollNo);
    }
}
public class StudentMain{
    public static void main (String[] args)
    {
        Student s = new Student();
        s.name = "Harshada";
        s.age = 25;
        s.rollNo = 65;

        s.displayStudent();
    }
}