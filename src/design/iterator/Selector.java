package design.iterator;

/**
 * @author baiyunlong
 * @title Selector
 * @description Selector
 * @date 2020/6/24 10:51
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
