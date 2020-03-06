package textfilereader;

import javax.swing.*;
import java.io.*;

public class TextFileReader {
    public static void main(String[] args) throws IOException {
        String fileName;
        fileName = JOptionPane.showInputDialog("Please enter a file name: ");
        BufferedReader readFile = new BufferedReader(new FileReader("g:/" + fileName));
        String line = "";
        String output = "";
        while((line = readFile.readLine()) != null){
            System.out.println(line);
        }
    }
}
