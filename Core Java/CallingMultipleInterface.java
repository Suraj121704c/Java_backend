public class CallingMultipleInterface {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Fish fish = new Fish();
        fish.swim();

        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
