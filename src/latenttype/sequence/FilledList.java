package latenttype.sequence;

import java.util.ArrayList;

/**
 * @author baiyunlong
 * @title FilledList
 * @description
 * @date 2020/7/14 11:10
 */
public class FilledList<T> extends ArrayList<T> {
    public FilledList(Class<? extends T> clazz, int size) throws IllegalAccessException, InstantiationException {
        for (int i = 0; i < size; i++) {
            add(clazz.newInstance());
        }
    }
}
