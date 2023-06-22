public class SimpleExceptionDemo {
    public static void main(String[] args) {
//      Arithmetic Exception -  it will give run time exception
        int data = 100/0;
        System.out.println(data);

//        Null Point Exception
        String a = null;
        System.out.println(a.charAt(0));
    }
}
