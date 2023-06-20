import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("D");

        System.out.println(treeSet);
    }
}
