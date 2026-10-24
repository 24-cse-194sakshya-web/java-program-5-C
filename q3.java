
class Practical3 {
    public static void main(String[] args) {
        System.out.println("Multiple Inheritance using Interfaces:");
        AllInOnePrinter3 printer = new AllInOnePrinter3();
        printer.print();
        printer.scan();

        System.out.println("\nHybrid Inheritance:");
        SmartPrinter3 smart = new SmartPrinter3();
        smart.switchOn();
        smart.print();
        smart.scan();
    }
}

interface Printable3 {
    void print();
}

interface Scannable3 {
    void scan();
}

class AllInOnePrinter3 implements Printable3, Scannable3 {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

class Machine3 {
    void switchOn() {
        System.out.println("Machine is switched on");
    }
}

class SmartPrinter3 extends Machine3 implements Printable3, Scannable3 {
    public void print() {
        System.out.println("Smart printer is printing");
    }

    public void scan() {
        System.out.println("Smart printer is scanning");
    }
}
