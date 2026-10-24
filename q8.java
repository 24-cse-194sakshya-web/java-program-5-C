
class Practical8 {
    public static void main(String[] args) {
        Product8 p1 = new Product8();
        Product8 p2 = new Product8("Pen");
        Product8 p3 = new Product8("Notebook", 50);
        Product8 p4 = new Product8("Bag", 800, 2);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}

class Product8 {
    String name;
    double price;
    int quantity;

    Product8() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    Product8(String name) {
        this.name = name;
        price = 0;
        quantity = 0;
    }

    Product8(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 1;
    }

    Product8(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateCost());
        System.out.println("-------------------");
    }
}
