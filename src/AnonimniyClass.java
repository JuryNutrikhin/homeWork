interface AbleToEat{// ��������� �����  ���������� ���������
    public void eat();
}
//........................................

public class AnonimniyClass {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println( " Anonimniy ����� ���������������� eat()");
            }
        };// <-����� � �������


    }
}
