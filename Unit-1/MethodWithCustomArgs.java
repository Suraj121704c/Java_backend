public class MethodWithCustomArgs {
//    Eggs class has been created already just using it hear

//    takes an egg as an argument
    static  void  PrintEggDetails(Eggs egg){
        System.out.println(egg.color + " " + egg.size);
    }

//  Q.  method that returns an egg object as the return type ?

    public  Eggs eggDetails(Eggs  egg){
        return egg;
    }

//    or
    static  Eggs createEgg(){
        return new Eggs();
    }

//    or
    Eggs eggMethod(String color , int size){
        Eggs e1 = new Eggs();
        e1.color = color;
        e1.size = size;
        return e1;
    }
    public static void main(String[] args) {
        Eggs egg = new Eggs();

        egg.size = 10;
        egg.color = "white";
        PrintEggDetails(egg);
        Eggs emptyEgg = new Eggs();
        PrintEggDetails(emptyEgg);
        createEgg();
    }
}
