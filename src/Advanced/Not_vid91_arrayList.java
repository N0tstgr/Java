package Advanced;
import java.util.*;
import java.lang.reflect.Array;

public class Not_vid91_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer>l1 = new ArrayList<>();
        ArrayList<Integer>l2 = new ArrayList<>(6);

        l2.add(78);
        l2.add(38);
        l2.add(98);


        l1.add(6);
        l1.add(7);
        l1.add(9);
        l1.add(1,8);
        l1.add(0,5);
        l1.addAll(0,l2);
        l1.clear();
        System.out.println(l1.contains(90));
//        for (int i =0; i<l1.size(); i++){
//            System.out.println(l1.get(i));


    }
}
