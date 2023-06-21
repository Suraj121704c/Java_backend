class _Animal {
    public void makeSound(){
        System.out.println("popo");
    }
}

class Dog extends  _Animal {
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}

public class Animal {
    public static void main(String[] args) {
        _Animal animal = new _Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
    }
}