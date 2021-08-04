package nl.streeksoft.novi;

public class StudentGrade {
    String studentName;
    byte grade;
    byte age;

    public String getDetails() {
        return "Studentnaam: " + studentName + " met cijfer: " + grade;
    }

}
