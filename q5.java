
class Practical5 {
    public static void main(String[] args) {
        ComplexNumber5 c1 = new ComplexNumber5(3, 4);
        ComplexNumber5 c2 = new ComplexNumber5(2, 5);

        System.out.print("First complex number: ");
        c1.display();

        System.out.print("Second complex number: ");
        c2.display();

        ComplexNumber5 result = c1.add(c2);
        System.out.print("Sum: ");
        result.display();
    }
}

class ComplexNumber5 {
    int real;
    int imaginary;

    ComplexNumber5(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber5 add(ComplexNumber5 other) {
        return new ComplexNumber5(
            real + other.real,
            imaginary + other.imaginary
        );
    }

    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}
