import java.util.Scanner;
import java.text.DecimalFormat;
public class Skeleton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Initialize array of integers
        int[] grades = new int[5];
        int labAttendance, midtermGrade;

        // for loop to get user input & store in array
        for (int counter = 0; counter < grades.length; counter++) {
            do {
            System.out.println("Input the grade of assignment " + (counter + 1) + " :");
            grades[counter] = scan.nextInt();
            }while (grades[counter] < 0 || grades[counter] > 100);
        }

        do {
        System.out.println("Input the number of attended labs: ");
        labAttendance = scan.nextInt();
        } while (labAttendance < 0 || labAttendance > 7);

        do {
        System.out.println("Input the midterm grade: ");
        midtermGrade = scan.nextInt();
        } while (midtermGrade < 0 || midtermGrade > 100);

        // for loop to iterate over the array & perform calculations
        // display output to user
        System.out.println("Assignments (30%): " + AssignmentGrade(grades)); 
        System.out.println("Attendance (5%): " + AttendanceGrade(labAttendance));
        System.out.println("Midterm (30%): " + MidtermGrade(midtermGrade));

        scan.close();
    }

    private static double AssignmentGrade (int[] grades) {
        DecimalFormat fmt = new DecimalFormat("0.##");
        int gradeSum = 0;
        for (int counter2 = 0; counter2 < grades.length; counter2++) {
            gradeSum += grades[counter2];
        }
        gradeSum *= (3.0/50);
        double output = Double.parseDouble(fmt.format(gradeSum));
        return output;
    }

    private static double AttendanceGrade(int labAttendance) {
        DecimalFormat fmt = new DecimalFormat("0.##");
        double attendanceGrade = (labAttendance * 5) / 7.0;
        double output = Double.parseDouble(fmt.format(attendanceGrade));
        return output;
    }

    private static double MidtermGrade(int midtermGrade) {
        DecimalFormat fmt = new DecimalFormat("0.##");
        double output = Double.parseDouble(fmt.format(midtermGrade*0.3));
        return output;
    }
}