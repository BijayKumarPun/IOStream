import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {

    public static void main(String[] args) {
        File file = new File("ABC.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                StringBuilder stringBuilder = new StringBuilder();
                //stringBuilder.append(scanner.next());
                stringBuilder.append(scanner.nextLine());

                System.out.println(stringBuilder);

            }
            System.out.println();
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int c;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            while ((c = fileInputStream.read()) != -1) {
                //System.out.println(((char) fileInputStream.read()));

                System.out.print(((char) c));
            }
            fileInputStream.close();
        } catch (Exception e) {

        }


    }
}
