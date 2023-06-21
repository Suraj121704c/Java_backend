class MountainBike extends Bicycle {
    private int seatHeight;

    public MountainBike(int startSpeed, int startGear, int startSeatHeight) {
        super(startSpeed, startGear);
        seatHeight = startSeatHeight;
    }

    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }

    public int getSeatHeight() {
        return seatHeight;
    }
}

