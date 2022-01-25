
public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private String faculty;
    private int date;
    private long telephoneNumber;
    private int course;
    private int group;

    public Student(String name, String surname, String patronymic, String address, String faculty, int date, long telephoneNumber, int course, int group) {
        this(name, surname, patronymic);
        this.address = address;
        this.faculty = faculty;
        this.date = date;
        this.telephoneNumber = telephoneNumber;
        this.course = course;
        this.group = group;
    }
    public Student(String name, String surname,  String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getDateOfBirth() {
        return date;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.date = date;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String toString(){
        return name + " " + surname +" "+ patronymic + " " + date +" " + faculty +" ";
    }
}

