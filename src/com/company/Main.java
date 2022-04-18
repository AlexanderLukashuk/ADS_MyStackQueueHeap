package com.company;

public class Main {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        System.out.println("Empty? " + stack.empty());
        stack.push(5);
        stack.push(91);
        stack.push(57);
        stack.push(16);
        stack.push(28);
        stack.push(84);
        System.out.println("Empty? " + stack.empty());
        stack.showMyStack();

        System.out.println("Size = " + stack.size());
        System.out.println("Peek = " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.showMyStack();
        System.out.println("Size = " + stack.size());
        System.out.println("Peek = " + stack.peek());

        MyQueue<Integer> queue = new MyQueue<>();

        System.out.println("Empty? " + queue.empty());
        queue.push(75);
        queue.push(23);
        queue.push(49);
        queue.push(30);
        queue.push(63);
        queue.push(164);
        queue.push(202);
        System.out.println("Empty? " + queue.empty());
        queue.showMyQueue();

        System.out.println("Size = " + queue.size());
        System.out.println("Peek = " + queue.peek());

        queue.pop();
        queue.pop();
        queue.pop();
        queue.showMyQueue();
        System.out.println("Size = " + queue.size());
        System.out.println("Peek = " + queue.peek());

        MyHeap<Integer> heap = new MyHeap<>(10);
        System.out.println("Empty? " + heap.empty());
    }
}
