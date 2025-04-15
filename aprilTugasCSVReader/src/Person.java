// Person.java
public class Person {
    protected String studentID;
    protected String name;
    protected String gender;
    protected int age;

    public Person(String studentID, String name, String gender, int age) {
        this.studentID = studentID;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
}