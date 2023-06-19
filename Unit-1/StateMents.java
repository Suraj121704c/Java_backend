public class StateMents {
// Conditional Statements
//    if , else-if,else-if else
//    nested if else
public static void main(String[] args) {
    int i = 10;
    int j ;
    if(i == 10){
        j = 20 ;
    }else {
        j = 30;
    }
    int sum = i + j;
    System.out.println(j);

//    switch case

    int dayNight = 1; // 0 day , 1 night  , anything else : wrong Input

    switch (dayNight) {
        case 0 :
            System.out.println("day");
            break;
        case 1 :
            System.out.println("night");
            break;
        default:
            System.out.println("wrong Input");
    }



}
}
