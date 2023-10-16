public class Main extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max",21);
        System.out.println(max.toString());

        PrimarySchoolStudent gimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(gimmy);
    }

}
class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}
class PrimarySchoolStudent extends Student {
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s Kid, " + super.toString();
    }
}