import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = 3.14 * Math.pow(radius, 2);

        System.out.printf("The area of a circle with radius %.2f is %.2f.%n",
                radius, area);

        scanner.close();
    }
}
