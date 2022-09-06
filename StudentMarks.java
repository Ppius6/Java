import java.util.Scanner;
public class StudentMarks {
    public static void main(String args[]) {
        //score 0-100
        String grade = null;
        System.out.print("Enter your score: ");
        Scanner sc =  new Scanner(System.in);
        int score =  sc.nextInt();

        switch (score/10) {
            //score 80-100
            case 10:
            case 9:
            case 8:
            case 7:
                grade = "A";
                break;
            //score 70-79
            case 6:
                grade = "B";
                break;
            //score 60-69
            case 5:
                grade = "C";
                break;
            //score 50-59
            case 4:
                grade = "D";
                break;
            //score 0-40
            default:
                grade = "F";
                break;
        }
        //display the grade
        System.out.println("Your grade is " + grade);
    }
}