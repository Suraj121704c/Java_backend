import PackagePractice.Badbboy.Circle;
import PackagePractice.Badbboy.Rectangle;

public class SelfmadePackageCalling {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area : " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4.0 , 6.0);
        System.out.println("Reactangle Area : " + rectangle.calculateArea());
    }
}
