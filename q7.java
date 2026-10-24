
class Practical7 {
    public static void main(String[] args) {
        Demo7 d = new Demo7();
        d.show();

        d = null;

        System.out.println("Reference removed");
        System.gc();

        System.out.println("Garbage collection requested");
    }
}

class Demo7 {
    Demo7() {
        System.out.println("Object created");
    }

    void show() {
        System.out.println("Object is being used");
    }
}
