package hust.soict.globalict.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
        String filePath = "path/to/large-text-file.txt"; 
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuffer content = new StringBuffer(); 
            while ((line = reader.readLine()) != null) {
                content.append(line); 
            }
            System.out.println("File content loaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
