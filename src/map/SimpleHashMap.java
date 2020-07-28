package map;

import java.util.*;

/**
 * @author baiyunlong
 * @title map.SimpleHashMap
 * @description TODO
 * @date 2020/7/21 10:59
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

    private static final int SIZE = 997;

    @SuppressWarnings("unchecked")
    private LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];


    @Override
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            return null;
        }
        for (MapEntry<K, V> iPair : buckets[index]) {
            if (key.equals(iPair.getKey())) {
                return iPair.getValue();
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            // 说明之前此桶位没有插入值
            buckets[index] = new LinkedList<>();
        }

        boolean found = false;
        MapEntry<K, V> pair = new MapEntry<>(key, value);
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        ListIterator<MapEntry<K, V>> iterator = bucket.listIterator();
        while (iterator.hasNext()) {
            MapEntry<K, V> iPair = iterator.next();
            if (key.equals(iPair.getKey())) {
                oldValue = iPair.getValue();
                iterator.set(pair);
                found = true;
                break;
            }
        }

        if (!found) {
            // 如果之前为put该key
            buckets[index].add(pair);
        }
        return oldValue;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> entrySet = new HashSet<>();
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            entrySet.addAll(bucket);
        }
        return entrySet;
    }

    public static void main(String[] args) {
        SimpleHashMap<String, String> map = new SimpleHashMap<>();
        map.put("123", "1");
        map.put("123", "2");
        map.put("456", "3");
        map.put("456", "4");
        System.out.println(map);
    }
}
