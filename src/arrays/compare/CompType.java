package arrays.compare;

import arrays.Generated;
import latenttype.adapter.Generator;

import java.util.*;

/**
 * @author baiyunlong
 * @title CompType
 * @description TODO
 * @date 2020/7/15 14:18
 */
public class CompType implements Comparable<CompType> {

    int i;
    int j;
    private static int count = 1;

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public int compareTo(CompType o) {
        return i < o.i ? -1 : (i == o.i ? 0 : 1);
    }

    @Override
    public String toString() {
        String result = "[i = "+ i +", j = " + j + "]";
        if (count++ % 3 == 0) {
            result += "\n";
        }
        return result;
    }

    private static Random r = new Random(47);
    public static Generator<CompType> generator() {
        return new Generator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(r.nextInt(100), r.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
//        CompType[] a = Generated.array(new CompType[12], generator());
        System.out.println("before sort:");
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);
        System.out.println("after sort:");
//        System.out.println(Arrays.toString(a));
    }

}
