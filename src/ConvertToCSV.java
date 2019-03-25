import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertToCSV {
    public static void main(String[] args) {
        String data;
    }

    public static void writeToCSV(String filePath) {
        File outFile = new File(filePath);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
