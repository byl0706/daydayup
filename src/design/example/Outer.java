package design.example;

/**
 * @author baiyunlong
 * @title OuterAndInner
 * @description .this和.new的使用
 * @date 2020/6/24 11:07
 */
public class Outer {
    private static int i = 1;
    public void f() {
        System.out.println("外部类f方法" + i);
        i++;
    }
    private class Inner {
        public Outer outer() {
            return Outer.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner1 = outer.inner();
        Outer.Inner inner = outer.new Inner();
        inner.outer().f();
        inner1.outer().f();
    }
}
