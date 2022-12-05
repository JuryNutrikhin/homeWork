package collection;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<Animal2> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal2(2));
        listOfAnimal.add(new Animal2(5));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog(4));

        test(listOfAnimal);
        test(listOfDogs);

    }

    private static void test(List<? extends Animal2> list) {//  ? знак вопроса и есть wildcards(означает любые обьекты)
        for (Animal2 animal : list) {
            System.out.println(animal);// выводит на экран потому что переопределен  метод toString();

            animal.eat();

        }

    }
}
