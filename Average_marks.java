import java.util.Scanner;
public class Average_marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your course: ");
        String course = input.nextLine();
        System.out.println("Enter your year of study: ");
        int year = input.nextInt();
        System.out.println("Enter your marks for subject A: ");
        int marksA = input.nextInt();
        System.out.println("Enter your marks for subject B: ");
        int marksB = input.nextInt();
        System.out.println("Enter your marks for subject C: ");
        int marksC = input.nextInt();
        double average = (marksA + marksB + marksC) / 3;
        System.out.println("Hello " + name  + ", Your average marks is " + average);
    }
}