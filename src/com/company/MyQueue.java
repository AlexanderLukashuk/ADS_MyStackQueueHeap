package com.company;

public class MyQueue<T> {
    private static class MyNode<T>{
        T data;
        MyNode<T> next, prev;

        MyNode(T data) {
            this.data = data;
        }
    }

    private int length = 0;
    private MyNode<T> front, back;

    public boolean empty() {
        return length == 0 ? true : false;
    }

    public int size() {
        return length;
    }

    public T peek() {
        return front.data;
    }

    public T push(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if (front == null) {
            front = back = newNode;
        } else {
            newNode.prev = back;
            back.next = newNode;
            back = newNode;
        }
        length++;

        return (T) newNode;
    }

    public T pop() {
        if (length != 0) {
            T popped = front.data;
            front = front.next;
            length--;
            return popped;
        }
        return null;
    }

    public void showMyQueue() {
        for (MyNode<T> i = front; i != null; i = i.next) {
            System.out.print(i.data + " ");
        }
        System.out.println();
    }
}
