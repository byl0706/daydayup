package latenttype.reflect;

/**
 * @author baiyunlong
 * @title Reflection
 * @description 通过反射来实现
 * @date 2020/7/14 10:41
 */
public class Reflection {
    public static void main(String[] args) {
        Action.perform(new Dog());
        Action.perform(new Robot());
    }
}
