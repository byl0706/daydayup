package latenttype.adapter;

import java.util.Collection;

/**
 * @author baiyunlong
 * @title Adapter
 * @description TODO
 * @date 2020/7/14 11:24
 */
public class Adapter {
    public static <T> Addable<T> collectionAdapter(Collection<T> c) {
        return new AddableCollectionAdapter<>(c);
    }
}
