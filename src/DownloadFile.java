import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class DownloadFile {
    public static void main(String[] args) {


        //download file from URL
        String MYURL = "https://software-download.microsoft.com/db/Win10_1809Oct_English_x64.iso?t=19265bb6-ce1c-4479-aaea-a10e61bb27d5&e=1549696720&h=e7b3f8b6c9493a027843396395d0785d";
        String FC = "download.iso";
        try {
            InputStream inputStream = new URL(MYURL).openStream();
            File file = new File("download.iso");
            Files.copy(inputStream, Paths.get(FC), StandardCopyOption.REPLACE_EXISTING);


        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(MYURL).openStream())) {
//            File file = new File("cake.iso");
//            FileOutputStream fileOutputStream = new FileOutputStream(file);


//
//            byte[] dataBuffer = new byte[1024];
//            int bytesRead;
//            while((bytesRead = bufferedInputStream.read(dataBuffer,0,10000))!=-1){
//                fileOutputStream.write(dataBuffer, 0, bytesRead);
//                System.out.println(file.length());
//            }
//
//        } catch (Exception e) {
//
//        }


    }
}
