package anonymity;

/**
 * @author baiyunlong
 * @title Base
 * @description Base
 * @date 2020/6/24 15:46
 */
public abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor.i = " + i);
    }

    public abstract void f();
}
