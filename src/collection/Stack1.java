package collection;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);//��������� � ���� �������
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        stack.pop();//������� �� ����� ��������� ��������� �������
        System.out.println(stack);

        stack.pop();//������� �� ����� ��������� ��������� �������
        System.out.println(stack);

        //stack.peek();   ���������� ���������  �������
        System.out.println(stack.peek());
        System.out.println();

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(11);
        stack1.push(22);
        stack1.push(33);
        stack1.push(44);

        while(!stack1.empty()){//�������� �� ������� ����� empty() -> boolian
            System.out.println(stack1.pop());
        }


    }
}
