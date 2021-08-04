package nl.streeksoft.novi;

import java.util.ArrayList;
import java.util.Scanner;

public class AppController {
    ArrayList<StudentGrade> students = new ArrayList<>();

    public void start() {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 4; i++) {
            StudentGrade student = new StudentGrade();
            System.out.print("Studentnaam: ");
            student.studentName = input.nextLine();
            System.out.print("Cijfer: ");
            student.grade = input.nextByte();
            input.nextLine();
            System.out.print("Leeftijd: ");
            student.age = input.nextByte();
            input.nextLine();
            students.add(student);
        }

/*
        StudentGrade student1 = new StudentGrade();
        student1.studentName = "Bastian";
        student1.grade = 6;
        student1.age = 40;

        StudentGrade student2 = new StudentGrade();
        student2.studentName = "Claudine";
        student2.grade = 8;

        StudentGrade student3 = new StudentGrade();
        student3.studentName = "Dennis";
        student3.grade = 10;

        students.add(student1);
        students.add(0, student2);
        students.add(student3);
*/

       // System.out.println( student1.getDetails() );
       // System.out.println( student2.getDetails() );
    }

    public void printStudentGrades() {
        for (StudentGrade student: students) {
            System.out.println(student.getDetails());
        }
    }



}
