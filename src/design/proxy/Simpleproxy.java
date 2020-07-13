package design.proxy;

/**
 * @author baiyunlong
 * @title Simpleproxy
 * @description 代理模式
 * @date 2020/7/6 17:20
 */
public class Simpleproxy implements Interface {
    private Interface proxied;
    public Simpleproxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("Simpleproxy do something");
        proxied.doSomething();
    }

    @Override
    public void somethingElse() {
        System.out.println("Simpleproxy do something else");
        proxied.somethingElse();
    }
}
