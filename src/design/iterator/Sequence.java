package design.iterator;

/**
 * @author baiyunlong
 * @title Sequence
 * @description Sequence
 * @date 2020/6/24 10:52
 */
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object item) {
        if (next < items.length) {
            items[next++] = item;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
}
