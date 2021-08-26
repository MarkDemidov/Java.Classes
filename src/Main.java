public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Ivan", "Ivanov", "Ivanovich", "Leninskaya 5", "Phylosofia", 1990, 3754454545454l, 4, 211);
        students[1] = new Student("Petr", "Petrov", "Petrovich", "Pervomaiskaay 6", "Ekonomicheskiy", 1991, 375442323234l, 3, 212);
        students[2] = new Student("Sidr", "Sidorov", "Sidorovich", "Pionerskaya 7", "Ekonomicheskiy", 1990, 375445234921l, 4, 211);

        printStudentsBirthAfterYear(students, 1990);
        printStudentsForGivenGroup(students, 211);
        printStudentsForGivenFaculty(students, "Ekonomicheskiy");
        printStudentsForGivenFacultyAndCourse(students, "Ekonomicheskiy", 4);
    }

    public static void printStudentsForGivenGroup(Student[] students, int group) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup() == group) {
                System.out.println(students[i].toString());
            }
        }
    }

    public static void printStudentsBirthAfterYear(Student[] students, int year) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getDateOfBirth() > year) {
                System.out.println(students[i].toString());
            }
        }
    }

    public static void printStudentsForGivenFacultyAndCourse(Student[] students, String faculty, int course) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty) && students[i].getCourse() == course) {
                System.out.println(students[i].toString());
            }
        }
    }

    public static void printStudentsForGivenFaculty(Student[] students, String faculty) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                System.out.println(students[i].toString());
            }
        }
    }
}
