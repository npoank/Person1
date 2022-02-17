public class Person {

    private String name = "None";
    private int age = 99;
    private String sex = "None";


    public Person() {

    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public void displayinfo() {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Sex " + sex);
    }
}
