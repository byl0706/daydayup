import design.command.GreenHouseControls;

/**
 * @author baiyunlong
 * @title InnerClassExtend
 * @description TODO
 * @date 2020/6/28 14:42
 */
public class InnerClassExtend extends GreenHouseControls.LightOff {
    public InnerClassExtend(GreenHouseControls greenHouseControls, long delayTime) {
        greenHouseControls.super(delayTime);
    }

    public static void main(String[] args) {
        GreenHouseControls greenHouseControls = new GreenHouseControls();
        InnerClassExtend innerClassExtend = new InnerClassExtend(greenHouseControls, 1000);
        innerClassExtend.action();
    }
}
