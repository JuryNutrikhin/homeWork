package collection;

public class Animal2 {
    Animal2(){

    }
    private int id;
    Animal2(int id){
        this.id = id;
    }
    @Override
    public String toString(){
        return String.valueOf(id);
    }
    void eat(){
        System.out.println( "Animal its eating...");
    }
}
