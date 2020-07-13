/**
 * @author baiyunlong
 * @title ClassLoadTest
 * @description 类加载测试
 * @date 2020/7/2 15:00
 */
public class ClassLoadTest {
    public static void main(String[] args) {
        System.out.println("Inside main");
        Class clas = Candy.class;
        System.out.println("===========================");
        try {
         Class.forName("Gum");
        System.out.println("===========================");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        new Candy();
        System.out.println("===========================");

        Class<? super CandySon> clazz = CandySon.class.getSuperclass();
        try {
            Object candy = clazz.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class CandySon extends Candy {
    static {
        System.out.println("Loading CandySon");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}
