public class Bicycleji2Extend implements BicycleJi{
    double raduis;
    @Override
    public void applyBrake(int decrement){
        System.out.println("Brakes are pressed with a pressure of : " + decrement);
    }

    @Override
    public void speedUp(int increment){
        System.out.println("Speed is increased by : " + increment);
    }

//    constructor
    public Bicycleji2Extend(double raduis){
        this.raduis = raduis;
        System.out.println(raduis);
    }
}
