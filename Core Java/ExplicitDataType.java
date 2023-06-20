public class ExplicitDataType {
    public static void main(String[] args) {
        double a = 50.50;
        System.out.println("Double representation : " + a);

//        explicit casting
        float f = (float) a;
        System.out.println("Float representation : "  + f);

        long l = (long) f;
        System.out.println("Long representaion : " + l);

        int c = (int) l;
        System.out.println("Int representation : " + c);

    }
}
