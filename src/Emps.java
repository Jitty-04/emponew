
import java.util.ArrayList;
import java.util.Scanner;
class Employee{
    int code;
    String name;
    String designation;
    double salary;
    String companyName;
    long phnNo;
    String emailId;
    public Employee(int code, String name, String designation, double salary, String companyName, long phnNo, String emailId) {
        this.code = code;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.companyName = companyName;
        this.phnNo = phnNo;
        this.emailId = emailId;
    }
}
public class Emps {
    public static void main(String[] args) {
        ArrayList<Employee> earr = new ArrayList<Employee>();
        while (true) {
            System.out.println("Select an option \n 1 - Add Employee \n 2 - View Employee \n 3 - Search an Employee \n" +
                    "4 - Delete an Employee \n 5 - Exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            if (n == 5) {
                System.out.println("You are exiting from the program");
                System.exit(0);
            } else {
                switch (n) {
                    case 1:
                        System.out.println("Enter employee details of employee ");
                        Scanner obj = new Scanner(System.in);
                        System.out.println("enter the code");
                        int code = obj.nextInt();
                        System.out.println("Enter name");
                        String name = obj.next();
                        System.out.println("Give the designation");
                        String designation = obj.next();
                        System.out.println("Enter the salary");
                        double salary = obj.nextDouble();
                        System.out.println("Enter company name");
                        String companyName = obj.next();
                        System.out.println("Enter phn No");
                        long phnNo = obj.nextLong();
                        System.out.println("Enter email Id");
                        String emailId = obj.next();
                        Employee e = new Employee(code, name, designation, salary, companyName, phnNo, emailId);
                        earr.add(e);
                        break;
                }
            }
        }
    }
}