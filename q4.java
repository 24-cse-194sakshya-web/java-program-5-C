
class Practical4 {
    public static void main(String[] args) {
        Calculator4 calc = new Calculator4();

        System.out.println("Method Overloading:");
        System.out.println("Sum of two numbers: " + calc.add(10, 20));
        System.out.println("Sum of three numbers: " + calc.add(10, 20, 30));
        System.out.println("Sum of decimal numbers: " + calc.add(5.5, 4.5));

        System.out.println("\nMethod Overriding:");
        Employee4 emp = new Developer4();
        System.out.println("Developer pay: " + emp.calculatePay());

        emp = new Manager4();
        System.out.println("Manager pay: " + emp.calculatePay());
    }
}

class Calculator4 {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee4 {
    double calculatePay() {
        return 20000;
    }
}

class Developer4 extends Employee4 {
    @Override
    double calculatePay() {
        return 35000;
    }
}

class Manager4 extends Employee4 {
    @Override
    double calculatePay() {
        return 50000;
    }
}
