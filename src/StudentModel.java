// StudentModel.java
public class StudentModel {

    private final String name;
    private final int age;
    private final String course;

    public StudentModel(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}
