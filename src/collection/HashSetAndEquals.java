package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetAndEquals {
    public static void main(String[] args) {

        Map<Person, Integer> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Jhon");
        Person person2 = new Person(1, "Jhon");
        Person person3 = new Person(2, "Mike");

        map.put(person1, 12);
        map.put(person2, 12);
        map.put(person3, 113);

        set.add(person1);
        set.add(person2);
        set.add(person3);

        System.out.println(map);
        System.out.println();
        System.out.println(set);


    }


    static class Person {
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "...Person " + "id = " + id + ", name = " + name + " ..."
                    ;
        }

        /**
         * переопределяем методы для сравнивания на одинаковость
         *
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person person = (Person) o;

            if (id != person.id) return false;
            return name != null ? name.equals(person.name) : person.name == null;
        }

        @Override
        public int hashCode() {
            int result = id;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }

}
