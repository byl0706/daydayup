/**
 * @author baiyunlong
 * @title CovariantReturnType
 * @description 协变返回类型
 * @date 2020/6/22 10:12
 */
public class CovariantReturnType {


    public static void main(String[] args) {
        A a = new A();
        Test test = a.getTest();
        System.out.println(test.toString());
        a = new B();
        test = a.getTest();
        System.out.println(test.toString());
    }
}

class Test {
    @Override
    public String toString() {
        return "A";
    }
}

class AntherTest extends Test  {
    @Override
    public String toString() {
        return "B";
    }
}

class A {
    Test getTest() {return new Test();}
}

class B extends A {
    @Override
    AntherTest getTest() {return new AntherTest();}
}
