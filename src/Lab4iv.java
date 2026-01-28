import java.util.Scanner;

// Interface Employee
interface Employee {
    void getDetails();
}

// Derived Interface Manager
interface Manager extends Employee {
    void getDeptDetails();
}

// Class Head implementing Manager interface
class Head implements Manager {
    int empId;
    String empName;
    int deptId;
    String deptName;

    // Method to get employee details
    public void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee id - ");
        empId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter employee name - ");
        empName = sc.nextLine();
    }

    // Method to get department details
    public void getDeptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department id - ");
        deptId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter department name - ");
        deptName = sc.nextLine();
    }

    // Method to display all details
    void displayDetails() {
        System.out.println("\nEmployee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}

// Main class
class getdetail {
    public static void main(String[] args) {
        Head h = new Head();

        h.getDetails();
        h.getDeptDetails();
        h.displayDetails();
    }
}
