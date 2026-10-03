
import java.util.Scanner;

public class TotalWaste {

    static double calculateTotalWaste(double point1waste, double point2waste) {
        return point1waste + point2waste;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste at Point 1: ");
        double point1 = sc.nextDouble();

        System.out.print("Enter waste at Point 2: ");
        double point2 = sc.nextDouble();

        double total = calculateTotalWaste(point1, point2);

        System.out.println("Total Waste Collected: " + total + " kg");
    }
}
