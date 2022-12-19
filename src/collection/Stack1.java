package collection;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);//вставляет в стек элемент
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        stack.pop();//достает из стека последний вложенный элемент
        System.out.println(stack);

        stack.pop();//достает из стека последний вложенный элемент
        System.out.println(stack);

        //stack.peek();   показывает последний  элемент
        System.out.println(stack.peek());
        System.out.println();

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(11);
        stack1.push(22);
        stack1.push(33);
        stack1.push(44);

        while(!stack1.empty()){//проверка на пустоту стека empty() -> boolian
            System.out.println(stack1.pop());
        }


    }
}
