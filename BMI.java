import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in Kilograms: ");
        double weight = input.nextDouble();
        System.out.println("Enter your height in meters: ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
    }
}