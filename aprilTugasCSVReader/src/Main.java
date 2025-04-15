// Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/Students_Grading_Dataset.csv"; // sesuaikan jika beda
        ArrayList<StudentData> students = readerCSV.readCSV(filePath);

        for (StudentData s : students) {
            s.printInfo();
        }

        System.out.println("Total Mahasiswa: " + students.size());
    }
}
