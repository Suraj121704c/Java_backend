package PackagePractice.Badbboy;

public class Circle {
    private double radius;

//    constructor
    public Circle(double radius){
        this.radius = radius;
    }
//  method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
