import java.io.*;
import java.util.Scanner;

public class ReadConsole {


public static  void main(String[] args) throws IOException {

    InputStreamReader inputStreamReader = null;
    try{
        inputStreamReader = new InputStreamReader(System.in);

        Scanner scanner = new Scanner(inputStreamReader);

        int c = scanner.nextInt();

        if (c == 5) {

            //stop
        }

        do {
            c = ((char) inputStreamReader.read());
        } while (c != 'q');

    } catch (IOException e) {
        e.printStackTrace();
    }finally {
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
    }


}
}
