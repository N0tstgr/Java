package Advanced;

import java.util.ArrayList;
import java.util.LinkedList;

public class Not_vid92_Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer>l2 = new LinkedList<>();

        l2.add(78);
        l2.add(38);
        l2.add(98);


        l1.add(6);
        l1.add(7);
        l1.add(9);
        l1.add(6);
        l1.add(1,8);
        l1.add(0,5);
        l1.addAll(0,l2);
        l1.set(1,566);
        l1.addLast(999);
        l1.addFirst(909);

//        l1.clear();
        System.out.println(l1.contains(90));
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.indexOf(6));
        //l1.clear();

        for (int i =0; i<l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        }
}
