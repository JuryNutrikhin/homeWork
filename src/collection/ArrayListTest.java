package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        list.remove(2);//�������� �� �������
        list.remove(4);

        System.out.println(list);

        list = new LinkedList<Integer>();
        System.out.println(list);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("LinkedList "+list);

        list.remove(3);
        System.out.println("�������� "+list);

        list.add(22);
        System.out.println(list);
        /***
         *
         */


    }
}
