package collection;

public class Dog extends Animal2 {
    private int id;

    public Dog(int id) {
        this.id  = id;

    }
    Dog(){

    }
    @Override
    void eat(){
        System.out.println("Dog it eating...");
    }
    @Override
    public String toString(){
        return String.valueOf(id);
    }


}
