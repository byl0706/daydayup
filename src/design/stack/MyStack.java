package design.stack;

import anonymity.Base;

import java.util.*;

/**
 * @author baiyunlong
 * @title MyStack
 * @description 栈的实现
 * @date 2020/7/7 15:28
 */
public class MyStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;
        Node() {
            item = null;
            next = null;
        }
        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {return item == null && next == null;}
    }
    private Node<T> top = new Node<>();

    public void push(T item) {
        top = new Node<>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }
}
