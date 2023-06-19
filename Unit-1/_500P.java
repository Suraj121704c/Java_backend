public class _500P {
    public static void main(String[] args) {
//  java is a Multiparadigm language;
//  class is and blueprint for creating an object.
//  whereas objects is an instance of class.

//  we declared variable plant with Plant due the class name from where it is being called;
//  new keyword creates a new object on the heap;
//  heap is a memory area;
        Plant plant = new Plant();
//  calling method
        plant.hi();
//  assigning values to the variables;
        plant.height = 110;
        plant.name = "cactus";
    }
}
