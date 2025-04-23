import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String filePath = "data.bin";
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;
            System.out.println("Reading binary data.");

            while ((byteData = fis.read()) != -1) {
                System.out.printf("0x%02x ", byteData);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}