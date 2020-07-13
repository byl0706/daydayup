package design.proxy;

/**
 * @author baiyunlong
 * @title ProxyMode
 * @description 代理模式
 * @date 2020/7/6 17:18
 */
public class ProxyMode {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse();
    }

    public static void main(String[] args) {
        consumer(new Simpleproxy(new RealObject()));
    }
}
