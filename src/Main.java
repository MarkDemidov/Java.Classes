public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Ivan", "Ivanov", "Ivanovich", "Leninskaya 5", "Phylosofia", 1990, 3754454545454l, 4, 211);
        students[1] = new Student("Petr", "Petrov", "Petrovich", "Pervomaiskaay 6", "Ekonomicheskiy", 1991, 375442323234l, 3, 212);
        students[2] = new Student("Sidr", "Sidorov", "Sidorovich", "Pionerskaya 7", "Ekonomicheskiy", 1990, 375445234921l, 4, 211);
        Faculty pvt = new Faculty(students);




        pvt.printStudentsBirthAfterYear(1990);
        pvt.printStudentsForGivenGroup(211);
        pvt.printStudentsForGivenFaculty("Ekonomicheskiy");
        pvt.printStudentsForGivenFacultyAndCourse("Ekonomicheskiy", 4);
    }

}
