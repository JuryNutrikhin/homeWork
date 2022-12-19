package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {
        /**
         * Реализация интерфейса iterable под капотом
         */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator1 =list.iterator();
        //  до Java 5 (устаревшая реализация for eatch)
        while (iterator1.hasNext()){
            System.out.println(iterator1.hasNext());// boolean hasNext - пока есть следующий элемент значение true
        }
        // после Java5
        for(Integer i: list){
            System.out.println(i);
        }
    }
}
