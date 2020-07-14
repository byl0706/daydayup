package latenttype.adapter;

import latenttype.reflect.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baiyunlong
 * @title DogsAndRobots
 * @description TODO
 * @date 2020/7/14 11:25
 */
public class DogsAndRobots {
    public static void main(String[] args) {
         List<Dog3> dog3s = new ArrayList<>();
         // Adapt a Collection:
         Fill.fill(new AddableCollectionAdapter<>(dog3s), BigDog.class, 3);
         // Helper method captures the type:
         Fill.fill(Adapter.collectionAdapter(dog3s), SmallDog.class, 2);
         for(Dog3 elem : dog3s) {
             System.out.println(elem.getClass().getSimpleName());
         }
         System.out.println("----------------------");
         // Use an adapted class:
         AddableSimpleQueue<Dog3> dog3Queue = new AddableSimpleQueue<>();
         Fill.fill(dog3Queue, BigDog.class, 4);
         Fill.fill(dog3Queue, SmallDog.class, 1);
         for(Dog3 elem : dog3Queue) {
             System.out.println(elem.getClass().getSimpleName());
         }
     }

}

class Dog3 {
    public void speak() {
        System.out.println("Dog2 Speaking...");
    }

    public void sit() {
        System.out.println("Dog2 Sitting...");
    }

    public void run(int length) {
        System.out.println("Dog2 runs " + length + " miles.");
    }
}

class BigDog extends Dog3 {
}

class SmallDog extends Dog3 {
}
