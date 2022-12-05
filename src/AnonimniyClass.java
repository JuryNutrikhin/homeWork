interface AbleToEat{// Анонимный класс  реализация интефейса
    public void eat();
}
//........................................

public class AnonimniyClass {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println( " Anonimniy класс спереопеделением eat()");
            }
        };// <-точка с запятой


    }
}
