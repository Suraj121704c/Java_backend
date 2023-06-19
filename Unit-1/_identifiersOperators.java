public class _identifiersOperators {
    public  static  void main(String[] args){
        String country = "India";
//        follow camel case
        String myCountryName = "India";
        int i = 10;
        boolean areYouOk = true;
        double pi = 3.14;

//        Operators
//        + , - , / , % , ++ , --
//        not equal to !=

        System.out.println(++i);
//        pre increment i;

        int k = 10;

        System.out.println(k++);

//        bollean operators
//        & , | , ^
//        AND
//        OR XOR

//        Sort Circuit
//        && ,||

//      Terniary Operator

        int x = 6;
        String result = (x==5) ? "x is five" : "x is not 5";
        System.out.println(result);

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1&b2); // true;
        System.out.println(b1&b2); // false;

        System.out.println(b1|b2);//true;
        System.out.println(b2|b2); // false;

//        if both the operands are having different value it will print true;
        System.out.println(b1^b2);//true;

        double p = 3.14;
//        convert values into float;
        float another = 3.14f;


//        wrapperClass

        int n = 3; //primitive class
//      convert n into an OOP long
//        Interger is a wrapper class which contains int m = 3;
        Integer m = 3; //object orianted value;

    }
}
