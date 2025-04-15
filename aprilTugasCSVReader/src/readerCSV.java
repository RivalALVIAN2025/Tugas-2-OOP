import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readerCSV {
    public static ArrayList<StudentData> readCSV(String filePath) {
        ArrayList<StudentData> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean header = true;
            while ((line = br.readLine()) != null) {
                if (header) {
                    header = false;
                    continue;
                }
                String[] data = line.split(",");
                try {
                    String id = data[0];
                    String name = data[1] + " " + data[2];
                    String gender = data[4];
                    int age = Integer.parseInt(data[5]);
                    double gpa = Double.parseDouble(data[10]);
                    String grade = data[11];
                    students.add(new StudentData(id, name, gender, age, gpa, grade));
                } catch (Exception e) {
                    System.out.println("Data error: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }
        return students;
    }
}