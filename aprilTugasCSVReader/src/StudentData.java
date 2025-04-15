public class StudentData extends Person {
    private double gpa;
    private String grade;

    public StudentData(String studentID, String name, String gender, int age, double gpa, String grade) {
        super(studentID, name, gender, age);
        this.gpa = gpa;
        this.grade = grade;
    }

    public String calculateGrade() {
        if (gpa >= 3.5) return "A";
        else if (gpa >= 3.0) return "B";
        else if (gpa >= 2.5) return "C";
        else return "D";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("------------------------");
    }
}