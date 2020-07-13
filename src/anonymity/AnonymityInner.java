package anonymity;

/**
 * @author baiyunlong
 * @title AnonymityInner
 * @description 匿名内部类
 * @date 2020/6/24 14:31
 */
public class AnonymityInner {
    private Contents contents() {
        return new Contents() {
            private int i = 11;
            @Override
            public int value() {return i;}
        };
    }

    private Wrapping wrapping(int value) {
        return new Wrapping(value) {
            @Override
            public int value() {
                return super.value() * 10;
            }
        };
    }

    /**
     * 参数dest必须声明为final，如果在匿名内部类对dest进行修改编译会报错，所以需要用final修饰dest
     **/
    private Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    /**
     * 使用实例初始化为匿名内部类创建一个构造器
     * */
    private Base base(int i) {
        return new Base(i) {
            {
                // 匿名内部类的构造器
                System.out.println("anonymity Inner class.i = " + i);
            }
            @Override
            public void f() {
                System.out.println("anonymity Inner class f()");
            }
        };
    }


    public static void main(String[] args) {
        AnonymityInner anonymityInner = new AnonymityInner();
        Contents contents = anonymityInner.contents();
        Wrapping wrapping = anonymityInner.wrapping(10);
        Base base = anonymityInner.base(999);
        Destination destination = anonymityInner.destination("123");
        System.out.println(contents.value() + "");
        System.out.println(wrapping.value() + "");
        System.out.println(destination.readLabel());
        base.f();
    }
}
