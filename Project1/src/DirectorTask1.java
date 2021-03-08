import java.math.BigInteger;

class Employee extends DirectorTask1{

    String Specialization;
    String Department;

}
class Manager extends DirectorTask1{

    String Specialization;
    String Department;


}
public class DirectorTask1 {
    String name;
    int age;
    long phoneNo;
    String Address;
    int salary;

    public void printSalary() {

        int dirSalary=20000;
        System.out.printf("Salary of manager :%d",dirSalary);

    }
    public static void main(String[] args){

        DirectorTask1 director=new DirectorTask1();
        Employee employee1=new Employee();
        Manager manager1=new Manager();

        employee1.name= "John";
        employee1.age=23;
        employee1.phoneNo=9656497679L;
        employee1.Address="Trivandrum";
        employee1.salary=50000;

        manager1.name="Kevin";
        manager1.age=31;
        manager1.phoneNo=9656497679L;
        manager1.Address="Trivandrum";
        manager1.salary=10000;

        director.printSalary();
        System.out.printf("\nEmployee Details : \nname:%s\tAge:%d\tPhone No:%d\tAddress:%s\tSalary:%d",employee1.name,employee1.age,employee1.phoneNo,employee1.Address,employee1.salary);
        System.out.printf("\nManager Details : \nname:%s\tAge:%d\tPhone No:%d\tAddress:%s\tSalary:%d",manager1.name,manager1.age,manager1.phoneNo,manager1.Address,manager1.salary);

    }
}
