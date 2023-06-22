//factorial by recurssion
public class Recurssion {
    int calulateFactorial(int n){
        if(n == 1) {
            return 1;
        }
        else {
            return  (n * calulateFactorial(n - 1));
        }
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Recurssion recurssion = new Recurssion();

        System.out.println(recurssion.calulateFactorial(5));

        System.out.println(fibonacci(7));
    }
}
