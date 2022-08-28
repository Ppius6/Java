import java.util.*;
public class DailyRainfall {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of rainfall for Monday: ");
        int Monday = input.nextInt();
        System.out.println("Enter the amount of rainfall for Tuesday: ");
        int Tuesday = input.nextInt();
        System.out.println("Enter the amount of rainfall for Wednesday: ");
        int Wednesday = input.nextInt();
        System.out.println("Enter the amount of rainfall for Thursday: ");
        int Thursday = input.nextInt();
        System.out.println("Enter the amount of rainfall for Friday: ");
        int Friday = input.nextInt();
        System.out.println("Enter the amount of rainfall for Saturday: ");
        int Saturday = input.nextInt();
        System.out.println("Enter the amount of rainfall for Sunday: ");
        int Sunday = input.nextInt();
        int total = Monday + Tuesday + Wednesday + Thursday + Friday + Saturday + Sunday;
        System.out.println("The total rainfall for the week is " + total + ".");
        System.out.println("The average rainfall is " + total / 7 + ".");
    }
}