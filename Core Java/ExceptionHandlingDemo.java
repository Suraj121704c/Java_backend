import java.util.ArrayList;
import java.util.List;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            List<Integer> list = new ArrayList<>(10);
            list.add(1);

            System.out.println("Entering" + "try statement");

            Integer a = list.get(0);

            System.out.println("accessing the first element : " + a);
        }catch (IndexOutOfBoundsException e){
//            it will help us in handling exception.
            System.err.println("Caught IndexOutOfBoundsException : " + e.getMessage());
        }finally {
//            it will always be getting executed.
            System.out.println("this will always be executed.");
        }
    }
}
