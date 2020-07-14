package latenttype.adapter;

/**
 * @author baiyunlong
 * @title AddableSimpleQueue
 * @description TODO
 * @date 2020/7/14 11:24
 */
public class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T> {
    @Override
    public void add(T t) {
        super.add(t);
    }
}
