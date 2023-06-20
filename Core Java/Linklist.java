import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);

        for(int i = 0;i<list.size();i++){
//           .get is used to get elements from the linkedlist
            String ele = list.get(i);
            System.out.println(ele);
        }
    }
}
