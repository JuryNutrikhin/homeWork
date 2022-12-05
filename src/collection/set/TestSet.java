package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Mike");
        treeSet.add("Katy");
        treeSet.add("Bob");
        treeSet.add("Donald");


        for (String name :
                treeSet) {
            System.out.println(name);
        }

        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        Set<Integer> union = new HashSet<>(set1);

        union.addAll(set2);//�����������
        System.out.println("addAll - ����������� set1 � set2 " + union);

        Set<Integer> union2 = new HashSet<>(set1);
        union2.retainAll(set2);// ����������� set1 � set2// ������� ��� ������ �������
        System.out.println("retainAll - ����������� set1 � set2 " + union2);

        //difference - ������� ��������
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("removeAll - ������� �������� set1 � set2 " +difference );

        System.out.println( "���� ��� git");
        System.out.println( "���� ��� git2");




    }
}
