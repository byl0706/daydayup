package map;

import java.util.Map;

/**
 * @author baiyunlong
 * @title MapEntry
 * @description TODO
 * @date 2020/7/21 11:01
 */
public class MapEntry<K, V> implements Map.Entry<K, V> {

    private K key;

    private V value;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V result = this.value;
        this.value = value;
        return result;
    }

    @Override
    public int hashCode() {
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof MapEntry)) {
            return false;
        }
        MapEntry me = (MapEntry) obj;
        return (key == null ? me.getKey() == null : key.equals(me.getKey())) && (value == null ? me.getValue() == null : value.equals(me.getValue()));
    }
}
