import java.util.Scanner;

class Employee {
    private int eno;
    private String ename;
    private double esal;

    public void readEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee number: ");
        eno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the employee name: ");
        ename = sc.nextLine();
        System.out.print("Enter the employee salary: ");
        esal = sc.nextDouble();
    }

    public void displayEmployee() {
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + esal);
    }

    public int getEno() {
        return eno;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            emp[i].readEmployee();
        }
        System.out.println("Employee Details:");
        for (int i = 0; i < n; i++) {
            emp[i].displayEmployee();
        }
        System.out.print("Enter the employee number to search: ");
        int eno = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (emp[i].getEno() == eno) {
                System.out.println("Employee Found:");
                emp[i].displayEmployee();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found");
        }
    }
}
