/**
 * Видео   ->   https://swiftbook.org/courses/415/lectures/4512
 */
package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator2 {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        animal.add("Frog");
        animal.add("Cat");
        animal.add("Dogthtt");


             Collections.sort(animal,new StringComparator());

        System.out.println(animal);

        List<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(1);
        number.add(5);

        Collections.sort(number,new NumberComparator());
        System.out.println(number);
    }
}
class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) return -1;
        else if (o1.length() < o2.length()) return 1;
        else return 0;
    }
}

class NumberComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2) return -1;
        else if (o1<o2) return 1;
        else return 0 ;
    }
}