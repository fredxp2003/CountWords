import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static int wordCount(String filename){
        int count = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while (reader.readLine() != null) count++;
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static void writeToFile(String fileName, String text) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        String outputFileName = args[1];
        int count = wordCount(fileName);
        System.out.println("Number of words: " + count);
        writeToFile(outputFileName, "Number of words: " + count);

    }
}
