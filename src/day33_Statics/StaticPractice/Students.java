package day33_Statics.StaticPractice;

public class Students {

    public String name;
    public int age;
    public int ID;
    public static char gender ='M';
    public static String nameOfInstructor = "Muhtar";

    public static String schoolName;

    static{
        schoolName = "Cydeo School";
    }

    public Students(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;

    }
public void drink(){

    System.out.println(name +" is drinking water");

}

public static void open(){
    System.out.println(schoolName + " opens on September");
}


    public String toString() {
        return "Students{" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", ID= " + ID +
                ", schoolName='" + schoolName + '\'' +
                ", gender='" + gender + '\'' +
                ", nameOfInstructor='" + nameOfInstructor + '\'' +

                '}';
    }
}


