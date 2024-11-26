package hust.soict.globalict.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) {
        String filePath = "test.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            String content = ""; 
            while ((line = reader.readLine()) != null) {
                content += line;
            }
            System.out.println("File content loaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
