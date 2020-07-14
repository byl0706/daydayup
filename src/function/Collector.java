package function;

/**
 * @author baiyunlong
 * @title Collector
 * @description TODO
 * @date 2020/7/14 16:14
 */
public interface Collector<T> extends UnaryFunction<T, T> {
    T result();
}
