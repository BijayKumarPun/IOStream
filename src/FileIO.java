import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

    public static void main(String[] args) throws IOException {
        System.out.println("Program is starting");

        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("InputText.txt");
            fileOutputStream = new FileOutputStream("OutputText.txt");
            int c;
            while ((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileInputStream.close();
            }
        }
    }
}
