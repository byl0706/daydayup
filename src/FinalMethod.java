/**
 * @author baiyunlong
 * @title FinalMethod
 * @description final方法
 * @date 2020/6/19 10:32
 */
public class FinalMethod {
    private void f() {
        System.out.println("FinalMethod类的私有方法f()");
    }

    public final void g() {
        System.out.println("FinalMethod类的final方法");
    }

    class SonMethod extends FinalMethod {
        private void f() {
            System.out.println("SonMethod的私有方法");
        }
    }
}
// 私有方法和final方法无法被重写
