package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {
        /**
         * ���������� ���������� iterable ��� �������
         */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator1 =list.iterator();
        //  �� Java 5 (���������� ���������� for eatch)
        while (iterator1.hasNext()){
            System.out.println(iterator1.hasNext());// boolean hasNext - ���� ���� ��������� ������� �������� true
        }
        // ����� Java5
        for(Integer i: list){
            System.out.println(i);
        }
    }
}
