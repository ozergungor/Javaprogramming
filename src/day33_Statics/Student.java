package day33_Statics;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, char gender, int studentID) {
        this (name, gender);
        this.studentID = studentID;
    }

    public Student(String name, char gender, int studentID, int age) {
        this (name, gender, studentID);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this (name, gender, studentID, age);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
