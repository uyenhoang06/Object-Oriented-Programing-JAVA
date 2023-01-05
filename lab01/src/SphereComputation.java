import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        double radius, surfaceArea, volume;

        System.out.print("Enter the radius: ");
        Scanner in = new Scanner(System.in);
        radius = in.nextDouble();

        surfaceArea = 4 * Math.PI * radius * radius;
        volume = (double) (4 / 3) * Math.PI * radius * radius * radius;

        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);

        in.close();
    }
}
