
class Practical6 {
    public static void main(String[] args) {
        Book6 b1 = new Book6();
        Book6 b2 = new Book6("Wings of Fire", "A.P.J. Abdul Kalam", 250);
        Book6 b3 = new Book6(b2);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("\nParameterized Constructor:");
        b2.display();

        System.out.println("\nCopy Constructor:");
        b3.display();

        b3.price = 300;

        System.out.println("\nAfter changing copied book:");
        System.out.println("Original price: " + b2.price);
        System.out.println("Copied price: " + b3.price);
    }
}

class Book6 {
    String title;
    String author;
    double price;

    Book6() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    Book6(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book6(Book6 other) {
        title = other.title;
        author = other.author;
        price = other.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
