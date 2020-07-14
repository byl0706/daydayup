package latenttype.adapter;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author baiyunlong
 * @title SimpleQueue
 * @description TODO
 * @date 2020/7/14 11:20
 */
public class SimpleQueue<T> implements Iterable<T>  {
    private LinkedList<T> storage = new LinkedList<T>();

    public void add(T t) {
        storage.offer(t);
    }

    public T get() {
        return storage.poll();
    }

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }
}
