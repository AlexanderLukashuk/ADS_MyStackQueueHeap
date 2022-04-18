package com.company;

//public class MyStack<T> implements ProList<T> {
public class MyStack<T> {
//    private MyLinkedList<Integer> list;

//    @Override
//    public boolean empty() {
//        return list.size() == 0 ? true : false;
//    }
//
//    @Override
//    public int size() {
//        return list.size();
//    }
//
//    @Override
//    public T peek() {
//        return (T) list.peek();
//    }
    private static class MyNode<T>{
        T data;
        MyNode<T> next, prev;

        MyNode(T data) {
            this.data = data;
        }
    }

    private int length = 0;
    private MyNode<T> head, tail;

    public boolean empty() {
        return length == 0 ? true : false;
    }

    public int size() {
        return length;
    }

    public T peek() {
        return head.data;
    }

    public T push(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
//            head.next = newNode;
            head = newNode;
        }
        length++;

        return (T) newNode;
    }

//    public void push(T item) {
//        MyNode<T> newNode = new MyNode<>(item);
//        if (head == null) {
//            head = tail = newNode;
//        } else {
//            newNode.prev = tail;
//            tail.next = newNode;
//            tail = newNode;
//        }
//        length++;
//    }

    public T pop() {
        if (length != 0) {
            T popped = head.data;
            head = head.next;
            length--;
            return popped;
        }
        return null;
    }

    public void justPop() {
        if (length != 0) {
            head = head.next;
            length--;
        }
    }

    public void showMyStack() {
        for (MyNode<T> i = head; i != null; i = i.next) {
            System.out.print(i.data + " ");
        }
        System.out.println();
    }
}
