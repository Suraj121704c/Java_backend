import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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

//        sets before java 8;
//        Set<Integer> squreSet = new HashSet<>();
//        for(Integer i : numberList){
//            squreList.add(i * i);
//        }

//        after java 8
        Set<Integer> squareSet = numberList.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Scala");

//        without java 8
//        List<String> filterResult = new ArrayList<>();
//        for(String s : filterResult){
//            if(s.startsWith("P")){
//                filterResult.add(s);
//            }
//        }

//        After java 8
//        filter
        List<String> filterResult = languages.stream().filter(s -> s.startsWith("P")).collect(Collectors.toList());
        System.out.println(filterResult);


//   sort on the basis of albates
        List<String> sortList = languages.stream().sorted().collect(Collectors.toList());
        System.out.println(sortList);


//        forEach
//        iterating by the help of forEach method come from streamApi
        languages.stream().forEach(y -> System.out.println("element is : " + y));


//        reduce
//        identity - an element that is the intial value;
        int sum = numberList.stream().reduce(0 , (ans , i) -> ans + i);
        System.out.println(sum);
    }
}
