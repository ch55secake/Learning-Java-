import java.util.Scanner;

public class findingHypotenuse {

    public static void main(String[] args) {
        double x;
        double y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        double finalValue = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse of this triangle is "+ finalValue);
        scanner.close();
    }

}

