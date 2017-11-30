import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("images/blomst.jpg");
        System.out.println("does it exist? " + file.exists());
        System.out.println(file.getAbsolutePath());
        File file2 = new File("images/image.jpg");
        System.out.println("does it exist? " + file.exists());

    }

}
