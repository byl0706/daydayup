package design;

import design.iterator.Selector;
import design.iterator.Sequence;

/**
 * @author baiyunlong
 * @title IteratorMode
 * @description 迭代器模式
 * @date 2020/6/24 10:48
 */
public class IteratorMode {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(String.valueOf(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
