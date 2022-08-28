public class StudentMarks {
    public static void main(String args[]) {
        //score 0-100
        int score = 40;
        String grade = null;

        switch (score/10) {
            //score 80-100
            case 8:
                grade = "A";
                break;
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