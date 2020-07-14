package latenttype.sequence;

import latenttype.reflect.Dog;
import latenttype.reflect.Robot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author baiyunlong
 * @title Actions
 * @description 一个方法应用序列-潜在类型机制
 * @date 2020/7/14 11:03
 */
public class Action2 {
    public static <T, S extends Iterable<? extends  T>> void apply(S squeue, Method method, Object... args) {
        for (T t : squeue) {
            try {
                method.invoke(t, args);

            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException {
        List<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            dogs.add(new Dog());
        }
        apply(dogs, Dog.class.getMethod("speak"));
        apply(dogs, Dog.class.getMethod("sit"));
        FilledList<Robot> robots = new FilledList<>(Robot.class, 5);
        apply(robots, Robot.class.getMethod("speak"));
        apply(robots, Robot.class.getMethod("sit"));
    }
}
