import java.util.Scanner;

class Shape {
    protected int length;
    protected int breadth;

    // Constructor to initialize length and breadth
    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to print length and breadth
    public void area() {
        System.out.println(length + " " + breadth);
    }
}

class Rectangle extends Shape {

    // Constructor that calls the superclass constructor
    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    // Overridden method to print the area of the rectangle
    @Override
    public void area() {
        super.area();  // Print length and breadth first
        System.out.println(length * breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read space-separated integers for length and breadth
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        // Validate constraints
        if (length < 0 || length > 1000 || breadth < 0 || breadth > 1000) {
            System.out.println("Invalid input. Length and breadth should be between 0 and 1000.");
        } else {
            // Create Rectangle object and print the area
            Rectangle rect = new Rectangle(length, breadth);
            rect.area();
        }

        scanner.close();
    }
}
