import java.util.Scanner;

class Employee 
{
        String name;
        int age;
        String phoneNumber;
        String address;
        double salary;
        Employee(String name, int age, String phoneNumber, String address, double salary) 
        {
                this.name = name;
                this.age = age;
                this.phoneNumber = phoneNumber;
                this.address = address;
                this.salary = salary;
        }
   
}

class Officer extends Employee
{
        String specialization;
        Officer(String name, int age, String phoneNumber, String address, double salary, String specialization)
        {
                super(name, age, phoneNumber, address, salary);
                this.specialization = specialization;
        }
}

class Manager extends Employee
{
        String department;
        Manager(String name, int age, String phoneNumber, String address, double salary, String department)
        {
                super(name, age, phoneNumber, address, salary);
                this.department = department;
        }
}

public class EmployeeInheritance 
{
        public static void main(String[] args) 
        {
                Scanner sc = new Scanner(System.in);
                String name, phone, address, specialization, department;
                int age,salary;
                name=sc.nextLine();
                age=sc.nextInt();
                sc.nextLine();
                phone=sc.nextLine();
                address=sc.nextLine();
                salary=sc.nextInt();
                sc.nextLine();
                specialization=sc.nextLine();
                Officer officer=new Officer(name, age, phone, address, salary, specialization);
                name=sc.nextLine();
                age=sc.nextInt();
                sc.nextLine();
                phone=sc.nextLine();
                address=sc.nextLine();
                salary=sc.nextInt();
                sc.nextLine();
                department=sc.nextLine();
                Manager manager=new Manager(name, age, phone, address, salary, department);
                System.out.println("Officer:");
                System.out.println(officer.name);
                System.out.println(officer.age);
                System.out.println(officer.phoneNumber);
                System.out.println(officer.address);
                System.out.println(officer.salary);
                System.out.println(officer.specialization);
                System.out.println("Manager:");
                System.out.println(manager.name);
                System.out.println(manager.age);
                System.out.println(manager.phoneNumber);
                System.out.println(manager.address);
                System.out.println(manager.salary);
                System.out.println(manager.department);
        }
}
