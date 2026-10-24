
class Practical1 {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo(101, "Rahul", 85, 90, 78);
        StudentInfo s2 = new StudentInfo(102, "Priya", 92, 88, 95);
        StudentInfo s3 = new StudentInfo(103, "Aman", 70, 75, 80);

        s1.display();
        s2.display();
        s3.display();
    }
}

class StudentInfo {
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    StudentInfo(int rollNo, String name, int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    int totalMarks() {
        return marks1 + marks2 + marks3;
    }

    double percentage() {
        return totalMarks() / 3.0;
    }

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks());
        System.out.printf("Percentage: %.2f%%%n", percentage());
        System.out.println("--------------------");
    }
}
