import java.io.File;

public class FileDirs {

    public static void main(String[] args) {
        File file = new File("ample/me/some");
        if (file.mkdirs()) {

            System.out.println("Successfully created");
        } else {

            System.out.println("Failed careting directories");

        }

        String dirName = "rasm";
        File file1 = new File(dirName);
        if (file1.mkdir()) {
            System.out.println("successfully created directory");

        } else {
            System.out.println("failed creating directory");

        }


    }

}
