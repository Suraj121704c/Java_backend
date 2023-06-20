import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
//        have string for key and integer for value;
        HashMap<String , Integer> map = new HashMap<>();

//      put to adding in hashMap
        map.put("a" , 10);
        map.put("b" , 20);
        map.put("c" , 30);

        System.out.println(map);

//        check presence of a and print its value;
        if(map.containsKey("a")){
            Integer a = map.get("a");
            System.out.println(a);
        }
    }
}
