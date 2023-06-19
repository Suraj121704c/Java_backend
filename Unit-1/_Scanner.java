import java.util.Scanner;

public class _Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        System.out.println("enter your name");
        String name = scanner.next();
        System.out.println("Are you 18+?");
        boolean eighteenPlus = scanner.nextBoolean();

        System.out.println(age + " " + name + " " + eighteenPlus);
    }
}
