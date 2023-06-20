public class ImplicitDataType {
    public static void main(String[] args) {

//        int < long < float -- Implicit binding : automatic binding

        int a = 100;
        System.out.println("Int representation : " + a) ;


        long b = a;
        System.out.println("Long representation : " + b);

        float c = b;
        System.out.println("FLoat representation : " + c);

    }
}
