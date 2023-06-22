import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

//    passing the error to be get handled by the user who is going to call it.
    public static void main(String[] args) throws FileNotFoundException , IOException {
        FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);

      for (int counter = 0 ;counter < 3 ; counter++)
          System.out.println(fileInput.readLine());

      fileInput.close();

    }
}
