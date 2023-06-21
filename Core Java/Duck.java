public class Duck  implements Flyable , Swimmable{
    @Override
    public void swim() {
        System.out.println("The duck is flying.");
    }

    @Override
    public void fly() {
        System.out.println("The duck is swimming");
    }

}
