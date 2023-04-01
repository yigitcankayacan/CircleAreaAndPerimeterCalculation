import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius;
        double pi = Math.PI;
        double angle;

        System.out.print("Please enter radius= ");
        radius = scanner.nextDouble();
        System.out.print("Please enter your central angle= ");
        angle = scanner.nextDouble();
        if (angle > 360) {
            System.out.println("Please enter a valid number for cenral angle!");
        } else if (angle <= 360) {
            double area = pi * radius * radius;
            double perimeter = 2 * pi * radius;
            double segmentArea = (pi * radius * radius * angle) / 360;

            System.out.println("----");
            System.out.println("Your circle area= " + area);
            System.out.println("Your circle perimeter= " + perimeter);
            System.out.println("Segment area of your circle= " + segmentArea);

        }
    }
}


