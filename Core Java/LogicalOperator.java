public class LogicalOperator {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;

//        bitwise and
//        It evaluates both the left and right operands and returns the result of the bitwise AND operation on their individual bits.
        if((value1 == 1) & (value2 == 2)){
            System.out.println("cool");
        }
//        bitwise or
//        it will check both the side wheter the first one is correct or not
        if((value1 == 5) | (value2 == 5)){
            System.out.println("hot");
        }
//        comparision or
//        it will check  the first one if it is correct then it will stop there and print the answer
        if((value1 == 5) || (value2 == 5)){
            System.out.println("hot2");
        }
//        comparision and
//        If the left operand evaluates to false, the right operand is not evaluated, as the overall result will be false regardless.
        if((value1 == 1) && (value2 == 2)){
            System.out.println("cool");
        }
    }
}
