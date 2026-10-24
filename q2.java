
class Practical2 {
    public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        Car2 car = new Car2();
        car.start();
        car.drive();

        System.out.println("\nMultilevel Inheritance:");
        Manager2 manager = new Manager2();
        manager.showPerson();
        manager.showEmployee();
        manager.manage();

        System.out.println("\nHierarchical Inheritance:");
        Circle2 circle = new Circle2();
        circle.display();
        circle.area();

        Rectangle2 rectangle = new Rectangle2();
        rectangle.display();
        rectangle.area();
    }
}

class Vehicle2 {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car2 extends Vehicle2 {
    void drive() {
        System.out.println("Car is running");
    }
}

class Person2 {
    void showPerson() {
        System.out.println("This is a person");
    }
}

class Employee2 extends Person2 {
    void showEmployee() {
        System.out.println("This is an employee");
    }
}

class Manager2 extends Employee2 {
    void manage() {
        System.out.println("Manager manages the team");
    }
}

class Shape2 {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle2 extends Shape2 {
    void area() {
        System.out.println("Area of circle: " + (3.14 * 5 * 5));
    }
}

class Rectangle2 extends Shape2 {
    void area() {
        System.out.println("Area of rectangle: " + (4 * 6));
    }
}
