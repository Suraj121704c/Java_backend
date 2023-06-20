public class weProblem {
    int x=10;
    static  int s ;
    public static void main(String[] args) {
        weProblem obj1 = new weProblem();
        obj1.x = 10;
        weProblem obj2 = new weProblem();
        obj2.x = 20;
        System.out.println(obj1.x); // 10
        System.out.println(obj2.x); // 20

//        we can access static variables by two ways
//        by accessing class
        System.out.println(s);
//        by accessing objects
        System.out.println(weProblem.s);
    }
}
