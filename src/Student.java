public class Student extends Person {
    private String course = "None";
    private String subject = "None";

    public Student(String name, int age, String sex, String course, String subject) {
        super(name, age, sex);
        this.course = course;
        this.subject = subject;
    }
}
