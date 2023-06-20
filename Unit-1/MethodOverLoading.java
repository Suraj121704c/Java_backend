public class MethodOverLoading {
//    polymorphism = > many forms of the same thing.
//    two types


//  -->  compile time or static polymorphism or method overloading -> cause we were knowing which method is being to be called.
    public  static  void hi(){
        System.out.println("hi");
    }

    public static  void hi(String name){
        System.out.println("hi" + name);
    }

    public  static  void hi(String name , String place){
        System.out.println("h1" + name + "how is it going in" + place );
    }

    public static void main(String[] args) {
        hi();
        hi("chirage");
    }
}
