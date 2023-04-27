import java.util.*;

public class A2_FetchArray {
    public static void main(String[] args) {
        Integer [] arr = {2, 3, 4, 1, 6, 1, 2, 5, 6,7,7,7,7, 9};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Collections.addAll(arrayList,arr);
        //TODO: CRETE A NEW ONE



        HashSet<Integer> hashSet= new HashSet<>(arrayList);
        hashSet.stream().distinct().forEach(elements-> System.out.println(elements));



    }

}

