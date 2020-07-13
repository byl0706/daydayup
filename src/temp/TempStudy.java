package temp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baiyunlong
 * @title TempStudy
 * @description 测试类
 * @date 2020/6/28 19:29
 */
public class TempStudy {
    public static void main(String[] args) {
//        Integer[] integers = {10, 2, 3, 4, 79};
//        List<Integer> integerList = Arrays.asList(integers);
//        List<Integer> otherList = new ArrayList<>();
//        Collections.addAll(otherList, integers);
//        for (int i = 0; i < integerList.size(); i++) {
//            System.out.println("integerList:" + integerList.get(i));
//            System.out.println("otherList:" + otherList.get(i));
//        }
        List<? extends Y> list1 = new ArrayList<Y>();
        List<? extends Y> list2 = new ArrayList<Z>();
//        List<? extends Y> list3 = new ArrayList<X>(); // error
        List<? super Y> list4 = new ArrayList<Y>();
        List<? super Y> list5 = new ArrayList<X>();
//        List<? super Y> list6 = new ArrayList<Z>(); // error
//        list4.add(new X()); // error
        list4.add(new Y());
        list4.add(new Z());
//        list5.add(new X()); // error
        list5.add(new Y());
        list5.add(new Z());
     }
}
class X {}
class Y extends X {}
class Z extends Y {}
