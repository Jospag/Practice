import java.util.Scanner;

public class Learning {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the radius and length of a cylinder: ");

        int radius = n.nextInt();

        int length = n.nextInt();

        double area;

        area = (22 * radius * radius) / 7;

        double volume = area * length;

        System.out.printf("The area is %.2f.%nThe volume is %.2f%n", area, volume);
    }
}