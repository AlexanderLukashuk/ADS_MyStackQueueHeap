package com.company;

import java.util.Arrays;

public class MyHeap<T> {
    private int d = 2;
    private Object[] heap;
    private int heapSize;

    public MyHeap(int capasity) {
        heapSize = 0;
        heap = new Object[capasity + 1];
        Arrays.fill(heap, -1);
    }

    public boolean empty() {
        return heapSize == 0;
    }

    public int size() {
        return heapSize;
    }

    public T getMin() {
        return (T)heap[0];
    }

    public T deleteMin() {

    }

    public void insert(T item) {

    }

    private void heapify(int index) {

    }

    private void traverseUp(int index) {

    }

    private int leftChildOf(int index) {
        return d * index + 1;
    }

    private int rightChildOf(int index) {
        return d * index + 2;
    }

    private int parentOf(int index) {
        return (index - 1) / d;
    }

    private void swap(int index1, int index2) {

    }
}
