import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numberList =  new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

//        before java 8;
//        List<Integer> squresList = new ArrayList<>();
//        for(Integer i : numberList){
//            squresList.add(i*i);
//        }

//        After Java 8;
//        numberList.stream() => it will send data one by one not by all at once
//        map method of the stream Api
//        x -> x*x => lambda syntax.
//        collect convert the stream into list again .
        List<Integer> squreList = numberList.stream().map(x -> x*x).collect((Collectors.toList()));
        System.out.println(squreList);

    }
}
