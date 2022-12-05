import packetgAbsractClass.Cat;
import packetgAbsractClass.Dog;
import packetgAbsractClass.Animal1;

public class Test3 {
    // Реализует  enam Animal
    public static void main(String[] args) {
        Animal animal = Animal.FROG;
        switch(animal) {
            case M0USE :
            System.out.println(Animal.M0USE);
            break;
            case FROG :

            System.out.println("This frog");
            break;

            case CAT :
                System.out.println(" this MOUSE\n\n");
                break;

        }

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        dog.sleep();
        cat.sleep();
        Animal1 animal1 = new Animal1() {
            @Override
            public void eat() {
                System.out.println("Cat it eating.");
            }

            @Override
            public void makeSound() {
                System.out.println("Гав гав");
            }
        };
        animal1.eat();
        animal1.makeSound();

    }
}
