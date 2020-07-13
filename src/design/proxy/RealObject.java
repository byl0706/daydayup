package design.proxy;

/**
 * @author baiyunlong
 * @title RealObject
 * @description 代理模式
 * @date 2020/7/6 17:19
 */
public class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("RealObject do something");
    }

    @Override
    public void somethingElse() {
        System.out.println("RealObject do something else");
    }
}
