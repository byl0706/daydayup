package dynamic;

/**
 * @author baiyunlong
 * @title dynamic.DynamicBinding
 * @description 动态绑定
 * @date 2020/6/21 16:19
 */
public class DynamicBinding {
    public void say(String str) {
        System.out.println("基类说：" + str);
    }

    public void run(Integer meter) {
        System.out.println("基类跑了：" + meter);
    }

    public static void main(String[] args) {
        DynamicBinding dynamicBinding = new DynamicChildern();
        dynamicBinding.say("mother fucker");
        dynamicBinding.run(100);
    }
}
