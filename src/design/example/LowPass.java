package design.example;

/**
 * @author baiyunlong
 * @title LowPass
 * @description LowPass
 * @date 2020/6/23 14:35
 */
public class LowPass extends Filter {
    private double cutOff;

    public LowPass(double cutOff) {
        this.cutOff = cutOff;
    }

    @Override
    public WaveForm process(WaveForm input) {
        return input;
    }
}
