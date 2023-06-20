import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(5);

        for(int i = 1;i<=5;i++){
//            for adding anything in a list use add keyword
            arrayList.add(i);
        }

        System.out.println(arrayList);
//        for removing anything in a list use remove keyword
        arrayList.remove(3);

        System.out.println(arrayList);

//   to get array list values
        for(int i = 0;i<arrayList.size() ; i++){
            System.out.println(arrayList.get(i) + " ");
        }
    }
}
