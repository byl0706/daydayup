package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author baiyunlong
 * @title Generic
 * @description 泛型——逆变
 * @date 2020/7/13 9:30
 */
public class Generic {
    public static void main(String[] args) {
        GenericWriter.f2();
        System.out.println(GenericWriter.apples);
        System.out.println(GenericWriter.fruits);
        List<?> list = new ArrayList<>();
//        list.add("123"); // error
    }
}

class GenericWriter {
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }
    static List<Apple> apples = new ArrayList<>();
    static List<Fruit> fruits = new ArrayList<>();

    static void f1() {
        writeExact(apples, new Apple());
        writeExact(fruits, new Fruit());
        writeExact(fruits, new Apple());
    }

    static <T> void writeExact2(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writeExact(apples, new Apple());
        writeExact(fruits, new Fruit());
        writeExact(fruits, new Apple());
    }
}

class GenericReader {
    static <T> T read(List<T> list) {
        return list.get(0);
    }

    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruits = Arrays.asList(new Fruit());

    public static void f() {
        Apple apple = read(apples);
        Fruit fruit = read(fruits);
        fruit = read(apples);
    }
    static class Reader<T> {
        private T reader2(List<T> list) {
            return list.get(0);
        }
    }

    public static void f2() {
        Reader<Fruit> reader = new Reader<>();
        Fruit fruit = reader.reader2(fruits);
//        fruit = reader.reader2(apples); // error List<Apple> cannot to be applied to List<Fruit>
    }

    static class CovariantReader<T> {
        T reader3(List<? extends T> list) {
            return list.get(0);
        }
    }

    public static void f3() {
        CovariantReader<Fruit> covariantReader = new CovariantReader<>();
        Fruit fruit = covariantReader.reader3(fruits);
        fruit = covariantReader.reader3(apples);
    }
}


class Apple extends Fruit {}

class Fruit {}
