package Codsoft_Internship;

import java.util.Scanner;

public class GradeCalculator 
{
    public static void main(String args[]) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter marks obtained in each subject (out of 100):");
        System.out.print("Subject 1: ");
        int sub1 = obj.nextInt();
        System.out.print("Subject 2: ");
        int sub2 = obj.nextInt();
        System.out.print("Subject 3: ");
        int sub3 = obj.nextInt();
        System.out.print("Subject 4: ");
        int sub4 = obj.nextInt();
        System.out.print("Subject 5: ");
        int sub5 = obj.nextInt();
        System.out.print("Subject 6: ");
        int sub6 = obj.nextInt();

        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;

        double avg = (double) totalMarks / 6;

        char grade;
        if (avg >= 90)
        {
            grade = 'A';
        } 
        else if (avg >= 80) 
        {
            grade = 'B';
        }
        else if (avg >= 70) 
        {
            grade = 'C';
        } 
        else if (avg >= 60) 
        {
            grade = 'D';
        } 
        else 
        {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", avg);
        System.out.println("Grade: " + grade);

        obj.close();
    }
}
