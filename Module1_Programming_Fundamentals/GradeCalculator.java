package Module1_Programming_Fundamentals;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("grade:a");
        }

        else if (marks >= 80) {
            System.out.println("grade:b");
        }

        else if (marks >= 70) {
            System.out.println("grade:c");
        }

        else if (marks >= 60) {
            System.out.println("grade:d");
        }
        
        else {
            System.out.println("grade:f");
        }

        sc.close();
    }
}