public class MethodOverLoadingDemo {
    public int Multiply (int x , int y){
        return (x * y);
    }

    public int Multiply (int x , int y , int z){
        return (x * y * z);
    }

    public double Multiply (double x , double y){
        return  x * y;
    }

    public static void main(String[] args) {
        MethodOverLoadingDemo methodOverLoadingDemo = new MethodOverLoadingDemo();
        methodOverLoadingDemo.Multiply(5,4);
        methodOverLoadingDemo.Multiply(2,1,2);
        methodOverLoadingDemo.Multiply(4,3);
    }


}
