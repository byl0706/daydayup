package latenttype.adapter;

import java.util.Collection;

/**
 * @author baiyunlong
 * @title AddableCollectionAdapter
 * @description TODO
 * @date 2020/7/14 11:23
 */
public class AddableCollectionAdapter<T> implements Addable<T> {
    private Collection<T> c;

    public AddableCollectionAdapter(Collection<T> c) {
        this.c = c;
    }

    @Override
    public void add(T item) {
        c.add(item);
    }
}
