package map.weak;

import java.util.WeakHashMap;

/**
 * @author baiyunlong
 * @title CanonicalMap
 * @description TODO
 * @date 2020/7/28 16:57
 */
public class CanonicalMap {
    public static void main(String[] args) throws InterruptedException {
        int size = 1000;
        if (args.length > 0) {
            size = new Integer(args[0]);
        }
        Key[] keys = new Key[size];
        WeakHashMap<Key, Value> map = new WeakHashMap<>();
        for (int i = 0; i < size; i++) {
            Key k = new Key(String.valueOf(i));
            Value v = new Value(String.valueOf(i));
            if (i % 3 == 0) {
                keys[i] = k;
            }
            map.put(k, v);
        }
        System.gc();
        Thread.sleep(10000);
    }
}
