import java.util.ArrayList;
import java.util.Collections;

public class Faculty {
    Student[] students;
    public Faculty(Student[] studentArray) {
        students = studentArray;
    }

    public void printStudentsForGivenGroup(int group) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup() == group) {
                System.out.println(students[i].toString());
            }
        }

    }

    public void printStudentsBirthAfterYear(int year) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getDateOfBirth() > year) {
                System.out.println(students[i].toString());
            }
        }
    }

    public void printStudentsForGivenFacultyAndCourse(String faculty, int course) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty) && students[i].getCourse() == course) {
                System.out.println(students[i].toString());
            }
        }
    }

    public void printStudentsForGivenFaculty(String faculty) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                System.out.println(students[i].toString());
            }
        }
    }
}
