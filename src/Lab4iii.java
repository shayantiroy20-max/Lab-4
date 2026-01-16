import java.util.Scanner;

// Interface definition
interface Employee {
    void earnings();
    void deductions();
    void bonus();
}

// Manager class implements interface but does not implement bonus()
abstract class Manager implements Employee {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    // Earnings = Basic + DA (80%) + HRA (15%)
    public void earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        double totalEarnings = basic + da + hra;
        System.out.println("Earnings: " + totalEarnings);
    }

    // Deductions = PF (12% of basic)
    public void deductions() {
        double pf = 0.12 * basic;
        System.out.println("Deductions (PF): " + pf);
    }
}

// Substaff class extends Manager and implements bonus()
class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    // Bonus = 50% of basic
    public void bonus() {
        double bonus = 0.50 * basic;
        System.out.println("Bonus: " + bonus);
    }
}

// Main class
class Sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        Substaff substaff = new Substaff(basicSalary);

        substaff.earnings();
        substaff.deductions();
        substaff.bonus();

        sc.close();
    }
}
