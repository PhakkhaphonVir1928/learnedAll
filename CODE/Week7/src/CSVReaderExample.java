import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderExample {
    public static void main(String[] args) {
        String csvFile = "src/Erorr101.csv"; // กำหนดพาธไฟล์ CSV ที่เก็บในโฟลเดอร์ src
        String line;
        String cvsSplitBy = ","; // กำหนดตัวคั่น (delimiter) ในไฟล์ CSV

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // ใช้คอมม่า (,) เพื่อแยกค่าที่มาจากแต่ละคอลัมน์
                String[] values = line.split(cvsSplitBy);
                // ทำสิ่งที่คุณต้องการกับค่าที่อ่านได้จากไฟล์
                System.out.println("Column 1 = " + values[0] + " , Column 2 = " + values[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}