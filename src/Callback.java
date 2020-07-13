/**
 * @author baiyunlong
 * @title Callback
 * @description 闭包与回调的事例
 * @date 2020/6/25 10:39
 */
public class Callback {
    public static void main(String[] args) {
        Callee1 callee1 = new Callee1();
        Callee2 callee2 = new Callee2();
        MyIncrementable.f(callee2);
        Caller caller1 = new Caller(callee1);
        Caller caller2 = new Caller(callee2.getIncrementable());
        caller1.go();
        System.out.println("可以在任何时刻通过Caller获得到的Incrementable对象引用，回调Callee类");
        caller1.go();
        caller2.go();
    }
}

interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable {
    private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println("Callee1 -> increment().i = " + i);
    }
}

class MyIncrementable {
    public void increment() {
        System.out.println("MyIncrementable -> increment()");
    }

    static void f(MyIncrementable mi) {
        mi.increment();
    }
}

class Callee2 extends MyIncrementable {
    private int i = 0;
    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println("Callee2 -> increment().i = " + i);
    }

    private class Closure implements Incrementable {
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getIncrementable() {
        return new Closure();
    }
}

class Caller {
    private Incrementable incrementable;
    public Caller(Incrementable incrementable) {
        this.incrementable = incrementable;
    }
    void go() {
        incrementable.increment();
    }
}
