import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOStream {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream("MyFile.txt"); // this is instantiated using file

        //also
        //created using file

        File file = new File("MyFile.txt");

        FileInputStream fileInputStreamFile = new FileInputStream(file);

        //read file
int c;
        try {
            while ((c = fileInputStream.read()) != -1) {
                System.out.print(((char) c));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    int d ;
        try{
            while ((d = fileInputStreamFile.read()) != -1) {
                System.out.println(((char) d));

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
