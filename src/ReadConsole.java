import java.io.*;

public class ReadConsole {


public static  void main(String[] args) throws IOException {

    InputStreamReader inputStreamReader = null;
    try{
        inputStreamReader = new InputStreamReader(System.in);


        char c ;
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
