import java.util.Scanner;

// Abstract class
abstract class student {
    int rollNo;
    int regNo;

    // Method to take input
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Registration Number: ");
        regNo = sc.nextInt();
    }

    // Abstract method
    abstract void course();
}

// Subclass
class kiitian extends student {

    // Implementation of abstract method
    void course() {
        System.out.println("Course: B.Tech");
    }

    // Method to display details
    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Registration Number: " + regNo);
        course();
    }
}

// Driver class
class Driver {
    public static void main(String[] args) {
        kiitian k = new kiitian();
        k.getInput();
        System.out.println("\nStudent Details:");
        k.display();
    }
}
