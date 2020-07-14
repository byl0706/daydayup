package latenttype.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author baiyunlong
 * @title Action
 * @description 泛化行动类
 * @date 2020/7/14 10:45
 */
public class Action {
    public static void perform(Object object) {
        Class<?> clzz = object.getClass();
        try {
            Method speak = clzz.getMethod("speak");
            speak.invoke(object);
            Method sit = clzz.getMethod("sit");
            sit.invoke(object);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
