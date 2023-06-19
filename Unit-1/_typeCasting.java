import java.lang.Integer;
public class _typeCasting {

//    conversion of int to interger : primitive -> wrapperclass
//    vicerversa also
    public static  void main(String[] args){
       int i = 5;
       Integer j = 5;
       i = j;
       j = i;

//       Implict type casting
//        putting the same value into large value;
//        Byte (-128 to 127)
       byte b = 10;
       int c = 10000; // 2,147,483,648
       c=b;

//       Explicit casting --> holding the value of bigger into smaller bucket
        int d = 127; //if we increase the value to above 127 it will go in negative due to its range of -128 to 127;
        byte e;
        e = (byte) d;
        System.out.println(e);

        byte x = 10;
        byte y = 11;
        byte z = (byte) (x + y); //because the limit of byte is in low range so that it will not increase the limit;
        System.out.println(z);

//        double p = 3.2;
//        double q = 4.5;
//        double r = p + q;
//        System.out.println(r);
    }
}
