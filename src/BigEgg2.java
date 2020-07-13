/**
 * @author baiyunlong
 * @title BigEgg2
 * @description TODO
 * @date 2020/6/28 15:03
 */
public class BigEgg2 extends Egg {
    public BigEgg2() {
        insertYolk(new Yolk());
    }

    class Yolk extends Egg.Yolk {
        public Yolk() {
            System.out.println("BigEgg2.Yolk");
        }

        @Override
        public void f() {
            System.out.println("BigEgg2.Yolk.f()");
        }
    }

    public static void main(String[] args) {
        BigEgg2 bigEgg2 = new BigEgg2();
        bigEgg2.g();
    }
}

class Egg {
    private Yolk y = new Yolk();

    public Egg() {
        System.out.println("New Egg");
    }

    class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk");
        }
        public void f() {
            System.out.println("Egg.Yolk.f()");
        }

    }
    public void g() {
        y.f();
    }

    public void insertYolk(Yolk yy) {
        y = yy;
    }
}