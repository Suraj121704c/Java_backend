import java.util.HashSet;

public class Hashet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(5);

//        hashset takes only unique keys so only one C will be there;
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");

        System.out.println(hashSet);

        System.out.println("List contains C or not ? " + hashSet.contains("C"));
        
    }
}
