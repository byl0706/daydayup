package design.temp;

/**
 * @author baiyunlong
 * @title GenericWithCreate
 * @description 创建类
 * @date 2020/7/9 10:46
 */
public abstract class GenericWithCreate<T> {
    T element;
    public GenericWithCreate () {
        element = create();
    }

    abstract T create();
}
