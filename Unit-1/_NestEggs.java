public class _NestEggs {
//    1 Nest (height , color) : 2 Eggs(size , color)

    public static void main(String[] args) {

//        calling and setting the values of Nest class in the nest variable;
        Nest nest = new Nest();

        nest.height = 100;
        nest.color = "brown";

//        doing the same with the eggs class
        Eggs egg1 = new Eggs();
        egg1.color = "white";
        egg1.size = 2;

        Eggs egg2 = new Eggs();
        egg2.size = 4;
        egg2.color = "yellow";


//        setting the value of Eggs in an array;

        Eggs[]  arrayOfEggs = new Eggs[2];

//        assigning the predeclared egg1 and egg2 into Eggs array.
      arrayOfEggs[0] = egg1;
      arrayOfEggs[1] = egg2;

      nest.eggs = arrayOfEggs;

    }
}

class Nest {
    int height;
    String color;
    Eggs[] eggs ;//= new Eggs[2];
//    Eggs firstEgg; --> you can do it like this
}


