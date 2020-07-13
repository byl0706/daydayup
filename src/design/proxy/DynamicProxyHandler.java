package design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author baiyunlong
 * @title DynamicProxyHandler
 * @description 动态代理
 * @date 2020/7/7 9:34
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy:" + proxy.getClass() + ".method:" + method + ".args:" + args);
        return method.invoke(proxied, args);
    }
}

class SimpleDynamicProxy {
    private static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse();
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);

        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[] { Interface.class },
                new DynamicProxyHandler(real));

        consumer(proxy);
    }
}
