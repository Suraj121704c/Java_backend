public class StaticVsNon {
    public static int staticVariable = 10;
    public int notStaticVariable = 20;

    public static void staticMethod(){
        System.out.println("This is a static method.");
    }


    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        System.out.println(staticVariable);
        staticMethod();

        StaticVsNon staticVsNon = new StaticVsNon();
        System.out.println(staticVsNon.notStaticVariable);
        staticVsNon.nonStaticMethod();
    }
}
