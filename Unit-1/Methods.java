//for using abstract method we use abstract keyword in the class
public abstract class Methods {
//    methods are also know as function

    public static void main(String[] args) {

        hi(); //method calling

        int total = sum(2,3);
        System.out.println(total);


    }

//    method creation
//    two types of methods
//    concrete method --> have body
    public static void hi() {
        System.out.println("hi");
    }

    public static int sum(int x , int y) {
        return  x + y;
    }

//    abstract method --> don't have body;

    abstract  public  int calculateArea();

//    we use abstract methods when we don't have enough info about it ;

}
