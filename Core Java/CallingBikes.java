public class CallingBikes {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(0 , 1, 20);

        mountainBike.speedUp(10);
        mountainBike.setGear(2);
        mountainBike.setSeatHeight(25);

        System.out.println(mountainBike.speed);
        System.out.println(mountainBike.gear);
        System.out.println(mountainBike.getSeatHeight());

    }
}
