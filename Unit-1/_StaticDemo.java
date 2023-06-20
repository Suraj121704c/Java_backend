public class _StaticDemo {
//    Inside a class there are 2 types of elements
//    1-> static : loaded into RAM first
//                 : static is realeated to a class;
//                 :Only one copy.
//    2-> non-static : loaded into memory only after you create an object using new operator
//                    : realeated to an object
//                     : many copies
}

class Simple {
    static  int s;
//    gets a default value even before object initialization.
    int n ;

    public static void main(String[] args) {
        System.out.println(s);
        Simple simple = new Simple();
        System.out.println(simple.n);
    }
//    Rule : --> you can't refrence nonstatic items from static methods;but Viceversa is not  true.
}
