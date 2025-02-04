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

        printBmi(weight, height);

        System.out.println();

        System.out.printf("\nYour BMI is: %.2f", returnBmi(weight, height));

        //method to close scanner
        scanner.close();

    }

    //method to calculate and print bmi
    static void printBmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2D);
        System.out.printf("\nYour BMI is: %.2f", bmi);
    }


    //method to calculate and return bmi
    static double returnBmi(double weight, double height) {
        double bmi;
        return bmi = weight / Math.pow(height, 2D);
    }

}
