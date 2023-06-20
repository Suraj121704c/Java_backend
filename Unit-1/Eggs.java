class Eggs {
    String color;
    int size;

//constructor
    Eggs(){
//        will be called whenever a new object is created.
        System.out.println("Constructor");
    }

//    other constructor -- parametrised constructor;
//    or overloaded constructor
    Eggs(String colorOfEgg , int sizeOfEgg){
        color = colorOfEgg;
        this.size = sizeOfEgg;
   }
}
