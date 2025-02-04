import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //variables
        double bmi;
        double weight;
        double height;

        //user input
        System.out.print("\nWrite your weight in [kg]: ");
        weight = scanner.nextDouble();
        System.out.print("Write your height in [cm]: ");
        height = scanner.nextDouble() / 100;

        //bmi equation
        bmi = weight / Math.pow(height, 2D);

        System.out.printf("\nYour BMI is: %.2f", bmi);

        //method to close scanner
        scanner.close();

    }

}
