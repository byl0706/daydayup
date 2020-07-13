package dynamic;

/**
 * @author baiyunlong
 * @title DynamicChildern
 * @description TODO
 * @date 2020/6/21 16:24
 */
public class DynamicChildern extends DynamicBinding {

    @Override
    public void say(String str) {
        System.out.println("子类说" + str);
    }

    @Override
    public void run(Integer meter) {
        System.out.println("子类跑了" + meter);
    }
}
