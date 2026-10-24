
class Practical9 {
    public static void main(String[] args) {
        Employee9 e1 = new Employee9();
        Employee9 e2 = new Employee9("Rahul", 25000);
        Employee9 e3 = new Employee9("Priya", 30000);

        e1.display();
        System.out.println();

        e2.display();
        System.out.println();

        e3.display();
        System.out.println();

        Employee9.showCount();
    }
}

class Employee9 {
    String name;
    double salary;
    static int count = 0;

    Employee9() {
        this("Not Assigned", 0);
    }

    Employee9(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    static void showCount() {
        System.out.println("Total employees: " + count);
    }
}
