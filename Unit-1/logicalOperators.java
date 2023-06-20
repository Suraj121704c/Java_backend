public class logicalOperators {
//    | and &
//    XOR (^) works binary numbers

    public static void main(String[] args) {
        System.out.println(true | true); // true
        System.out.println(false | true); // true
        System.out.println(false | false); // false

        System.out.println(true & false); // false
        System.out.println(true & true); // ture

//        if both the values are same then it returns false else it returns true;
        System.out.println(false ^ false); // false ;
        System.out.println(true ^ true); // false ;
        System.out.println(true ^ false); // true ;

    }
}
