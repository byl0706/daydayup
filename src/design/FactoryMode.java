package design;

/**
 * @author baiyunlong
 * @title FactoryMode
 * @description 工厂模式
 * @date 2020/6/23 16:36
 */
public class FactoryMode {
    public static void serviceConsumer(ServiceFactory serviceFactory) {
        Service service = serviceFactory.getService();
        service.method1();
        service.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(new ImplementationFactory1());
        serviceConsumer(new ImplementationFactory2());
    }
}

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    @Override
    public void method1() {
        System.out.println("Implementation1: method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1: method2");
    }
}

class Implementation2 implements Service {
    @Override
    public void method1() {
        System.out.println("Implementation2: method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2: method2");
    }
}

class ImplementationFactory1 implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class ImplementationFactory2 implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation2();
    }
}
