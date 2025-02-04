public class Main {

    public static void main(String[] args) {

        double bmi;
        double weight;
        double height;

        weight = 117;
        height = 1.88;

        bmi = weight / Math.pow(height, 2D);

        System.out.printf("Your BMI is: %.2f", bmi);

    }

}
