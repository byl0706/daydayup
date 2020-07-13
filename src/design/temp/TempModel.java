package design.temp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baiyunlong
 * @title TempModel
 * @description 模板方法设计模式
 * @date 2020/7/9 10:45
 */
public class TempModel {
    public static void main(String[] args) {
        Create create = new Create();
        create.f();
    }
}

class X {
    List<String> list = new ArrayList<>();
}
class Create extends GenericWithCreate<X> {
    @Override
    X create() {
        return new X();
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
