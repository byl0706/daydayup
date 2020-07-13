package container;

import java.util.Collection;
import java.util.LinkedList;

/**
 * @author baiyunlong
 * @title Stack1
 * @description 栈的实现-LinkedList
 * @date 2020/6/29 16:01
 */
public class Stack1<T> {
    private LinkedList<T> linkedList = new LinkedList<>();
    public void push(T t) {
        linkedList.addFirst(t);
    }
    public T peek() {
        return linkedList.getFirst();
    }

    public T pop() {
        return linkedList.removeFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
