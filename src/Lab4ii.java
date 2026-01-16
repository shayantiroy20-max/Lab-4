// Interface
interface Motor {
    int capacity = 5;   // interface data member (public static final)

    void run();
    void consume();
}

// Class implementing interface
class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running");
    }

    public void consume() {
        System.out.println("Washing machine consumes electricity");
    }
}

// Driver class
class Main {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();

        // Checking interface data member
        System.out.println("Motor Capacity: " + wm.capacity);
    }
}

