import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertToCSV {
    private static String[][] VARUNS_DATA;

    public static void main(String[] args) {
        String data = inputForCSV(VARUNS_DATA);
        writeToCSV("parsedData", data);
    }

    public static String inputForCSV(String[][] data) {
        String output = "";
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[0].length; c++) {
                output += data[r][c];
                output += ",";
            }
            output += "/n";
        }
        return output;
    }

    public static void writeToCSV(String filePath, String data) {
        File outFile = new File(filePath);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
