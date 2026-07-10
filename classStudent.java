package day3bootcamp;

public class classStudent {

    // Instance variables
    String name;
    int rollNo;

    // Constructor
    classStudent(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        classStudent s1 = new classStudent("Chandru", 101);
        classStudent s2 = new classStudent("Akash", 102);

        s1.display();
        s2.display();
    }
}