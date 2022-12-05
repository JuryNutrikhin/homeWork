package collection;
//реализация класса MyLinkedList

public class MyLinkedListTest {
    public static void main(String[] args){
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(44);
        linkedList.add(3);


        System.out.println(linkedList);

        linkedList.remove(1);

        System.out.println(linkedList);

    }
}
